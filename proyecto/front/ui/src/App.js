import React from 'react';
import './App.css';
import Dendogram from  './components/Dendogram.js';
import Code from "./components/Code";


function App() {
  return (
    <div className="App">
        <div>
            <Code/>
        </div>
        <div>
            <Dendogram/>
        </div>


    </div>
  );
}

export default App;
