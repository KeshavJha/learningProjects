import { createStore } from "redux";
import { configureStore } from '@reduxjs/toolkit'
import tasks from "../reducers/reducer1";

const default_store = createStore(tasks);
export default default_store;