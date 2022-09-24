// let private data:string = null;
function addItemToList() {
    // data = this.props;
}

function ReduxStoreComponent(props: any) {
    return (
        <>
        <button onClick={addItemToList}>Click me !!</button>
        <li>{props.state}</li>
        </>
    );
};
export default ReduxStoreComponent;