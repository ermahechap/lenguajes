import React from 'react';
import './App.css';
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
            </Row>

        </div>
    </div>

  );
}

export default App;
