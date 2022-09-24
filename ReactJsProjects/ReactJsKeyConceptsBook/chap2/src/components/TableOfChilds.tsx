import DeveloperDetails from "./FirstComponentChild1";

function TableOfDevelopers () {
    return(
        <table>
            <tr>
                <td><DeveloperDetails name="Keshav Mukund Jha"
    skills ="Developing somethhings, Lacking most things"
    desire = "Confidence in building UI"/></td>
    <td><DeveloperDetails name="Keshav ka Copy"
    skills ="Developing somethhings, Lacking most things"
    desire = "Confidence in building UI"/></td>
    <td><DeveloperDetails name="Yet another copy"
    skills ="Developing somethhings, Lacking most things"
    desire = "Confidence in building UI"/></td>
    </tr>
        </table>
    )
};
export default TableOfDevelopers;