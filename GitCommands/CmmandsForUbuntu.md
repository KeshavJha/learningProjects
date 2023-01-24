Update the system : `sudo apt-get update`

# Installing nvm ( node version manager )

`sudo apt install curl`

`curl https://raw.githubusercontent.com/creationix/nvm/master/install.sh | bash`

`source ~/.bashrc`

`nvm install node`

`nvm ls`   -- list installed versions of node

`nvm ls-remote`    -- list available node.js versions

`nvm use 12.18.3`    -- Use 12.18.3 version of node , if installed

`nvm run default --version`  -- find default Node version set currently

`nvm exec 12.18.3 server.js`     --- run a Node script with the desired version of node

# Node commands -- 
`node --version`        OR     `node -v`        ::====>>    node version

`npm --version`         OR     `npm -v`            ::====>>    npm version

`npm audit`   ::====>> audit dependencies for any vulnerabilities

`npm audit fix --force`  ::====>> fix any vulnerabilities found in audit


# Typescript commands 
`npm i -g typescript`   ::====>>    Install Typescript , tsc ( typescript compiler ) 

`tsc --version`   ::====>>    Verify typescript version

`tsc index.ts`  Compile the index.ts file to index.js

`node index.js`  Run the js file in node environment

`npm i -g ts-node`  Install ts-node package to run .ts files in node env

`ts-node index.ts`  Run the index.ts file

# ReactJS commands 
`npm i -g create-react-app`   ::====>>    Install React project creation app 

`npx-create-react-app project1`   ::====>>    Create a React app. Project name can't have capital letters. Only small letters, and hyphen

# Install Git 
`sudo apt-get install git`

`git --version`

`git config --global user.name "<user_name>"`

`git config --global user.email "<user_email>"`

`git config --list`

# Configure Git for passwordless SSH

`ssh-keygen -t ed25519 -C "<user_email>"`

`eval "$(ssh-agent -s)"`  ---- Verify that ssh process is up and running

`ssh-add ~/.ssh/id_ed25519` ---- add the ssh key to computer's signature

`cat ~/.ssh/id_ed25519.pub` ---- Add this signature to the SSH Keys in your account

git clone git@github.com:<user_name>/learningProjects

Add ".gitignore" file with list of files and folders that need to be ignored when checking files in to git


git clone git@github.com:<user_name>/learningProjects


Configure Branch protection rules in Github --  github.com/<user_name>/<ProjectName>/settings/branches
Can enfore commits to have signatures etc.

# Install JDK :
`sudo apt-get install default-jdk`

# Install Gradle and mvn
`sudo apt install mvn`
`sudo apt install gradle`


# Install Python : 

`sudo apt install python3`
`python3 --version`

`sudo apt install python3-pip`
`pip --version`

`pip3 install jupyter` -- pip3 is required to install jupyter for python 3, pip installs for 

#Install new JDK in IntelliJ Idea : 
File -> Project -> 

# Ubuntu Commands 
`shutdown -P`  ---- shutdown Ubuntu

`shutdown -r`  ---- reboot machine
