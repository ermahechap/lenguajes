import React from 'react';
import './App.css';
// import Dendogram from  './components/Dendogram.js';
import Code from "./components/Code";
import { Row, Col } from 'antd';


function App() {
  return (
    <div className="App">
        <div>
            <Row>
                <Col span={24}>
                    <Code/>
                </Col>
                {/*<Col span={16}>*/}
                {/*    <Dendogram/>*/}
                {/*</Col>*/}
            </Row>

        </div>
    </div>

  );
}

export default App;
