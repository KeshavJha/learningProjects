<?php
$execution_log_message = "";
function failScriptWithMessage($failureMessage) {
	print("FAILED : $failureMessage\n");
	sendFailureNotificationEmail($failureMessage);
	exit(1);
}
function sendFailureNotificationEmail($body) {
	$subject = "FTP service check has failed";
  	$to = "keshav.mukund@flipkart.com"; //"sp-slm-alerts@flipkart.com";
  	$headers = "MIME-Version: 1.0" . "\r\n";
	$headers .= "Content-type:text/html;charset=UTF-8" . "\r\n";
	echo mail($to,$subject,$body,$headers);
}
function main() {           
$ftp_server = "cms.flipkart.com";
$ftp_user = "ftpUser";
$ftp_pass = "ftpPassword";
$ftp_root_dir = "/";
$ftp_input_dir = "input";
$ftp_output_dir = "output";
$ftp_remote_put_file = "createdFile.txt";
$ftp_remote_get_file = "fileToTestFtpGet.txt";
$ftp_local_get_file = "fetchedFile.txt";

// set up a connection or failScriptWithMessage
$conn_id = ftp_connect($ftp_server) or failScriptWithMessage("Couldn't connect to $ftp_server"); 

// try to login
if (@ftp_login($conn_id, $ftp_user, $ftp_pass)) {
    print ("SUCCESS : Connected as $ftp_user@$ftp_server\n");
    $userDirectory = @ftp_pwd($conn_id);

    // Check that user is chroot jailed 
    if ( $ftp_root_dir != $userDirectory) {
    	failScriptWithMessage ("FTP user is not chroot jailed, but is instead $userDirectory \n");
    }

    // Check that input and output directories only available for ftp user
###	$directories = @ftp_nlist($conn_id, ".");
###	if(sizeof($directories) != 2) {
###		failScriptWithMessage ("FTP user doesn't have input and output directory \n");
###	}
###	if ( $directories[0] != "input") {
###		failScriptWithMessage ("No input directory \n");
###	}
###	if ( $directories[1] != "output") {
###		failScriptWithMessage ("No output directory \n");
###	}

    // Check that user can switch to input directory and put files in it.
	if (!ftp_chdir($conn_id, $ftp_input_dir)) {
		failScriptWithMessage("Couldn't change to input directory\n");
	} else {
		print("SUCCESS : /input directory exists\n");
###		$tmpfile = fopen('php://memory', 'r+');
###		fwrite($tmpfile, "ftp write file");
###		rewind($tmpfile);
###		ftp_fput($conn_id, $ftp_remote_put_file, $tmpfile, FTP_BINARY);
###		ftp_delete($conn_id, $ftp_remote_put_file);
	}

	// Switch to output directory
	ftp_cdup($conn_id);

	if (!ftp_chdir($conn_id, $ftp_output_dir)) {
		$currentDirectories = @ftp_nlist($conn_id, ".");
		failScriptWithMessage("Couldn't change to output directory\n");
	} else {
		print("SUCCESS : /output directory exists\n");
#		ftp_get($conn_id, $ftp_local_get_file, $ftp_remote_get_file, FTP_BINARY);
#		unlink($ftp_local_get_file);
	}

	// close the connection
	ftp_close($conn_id);  

} else {
    failScriptWithMessage ("Couldn't connect as $ftp_user\n");
}
}
main();
?>
