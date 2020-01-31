import React from 'react';
import './App.css';
import Code from "./components/Code";
import { Row, Col } from 'antd';
import Arbolito from "./components/Arbolito dime tu";

function App() {
  return (
    <div className="App">
        <div>
            <Row>
                <Col span={24}>
                    <Code/>
                </Col>
                <Col span={16}>
                <Arbolito></Arbolito>}
                </Col>

            </Row>

        </div>
    </div>

  );
}

export default App;