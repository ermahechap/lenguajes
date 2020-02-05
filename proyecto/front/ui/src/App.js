import React from 'react';
import './App.css';
import Code from "./components/Code";
import { Row, Col } from 'antd';
import IndexTree from "./components/IndexTree";

function App() {
  return (
    <div className="App">
        <div>
            <Row>
                <Col span={24}>
                    <Code/>
                </Col>
                <Col span={16}>
                <IndexTree/>
                </Col>

            </Row>

        </div>
    </div>

  );
}

export default App;
