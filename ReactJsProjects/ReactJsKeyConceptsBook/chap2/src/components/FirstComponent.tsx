import {useState} from 'react'
// import DeveloperDetails from './FirstComponentChild1';
import TableOfDevelopers from './TableOfChilds';

function SpecialSubmit() {
const [isSubmitted, setIsSubmitted] = useState(false);
function submitHandler() {
    setIsSubmitted(!isSubmitted);
};

return(
    <>
    <button onClick={submitHandler}>
        {isSubmitted ? 'Loading ...' : "Submit"}
    </button>
    <p> {isSubmitted ? "Fetching the values" : "Submit to proceed"}</p>
    <TableOfDevelopers/>
    
    </>
);
};

export default SpecialSubmit;