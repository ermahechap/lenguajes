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
                <Col span={20}>
                <IndexTree/>
                </Col>

            </Row>

        </div>
    </div>

  );
}

export default App;
