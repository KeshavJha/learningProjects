function DeveloperDetails(props: any) {
    return(
        <>
        <h2> Developer Name : {props.name}</h2>
        <p/>
        <h3> Skills : {props.skills}</h3>
        <p/>
        <h3> Looking for : {props.desire}</h3>
        </>
    
    );
};

export default DeveloperDetails;