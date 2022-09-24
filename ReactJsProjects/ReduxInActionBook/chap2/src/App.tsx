import React from 'react';
import './App.css';
import { connect } from 'react-redux';
import ReduxStoreComponent from './components/ReduxStoreComponent';

function App() {
  return (
    <div className="App">
      <header className="App-header">
      </header>
      <ReduxStoreComponent tasks={props.tasks}/>
    </div>
  );
}

function mapStateToProps(state: any){
  return {
    tasks: state.tasks
  }
}
export default connect(mapStateToProps)(App);
