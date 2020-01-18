import React from 'react';
import { Group } from '@vx/group';
import { Cluster } from '@vx/hierarchy';
import { LinkVertical } from '@vx/shape';
import { hierarchy } from 'd3-hierarchy';
import { LinearGradient } from '@vx/gradient';
import {Button, Card} from 'antd';
import "../Styles/Dendogram.css"

const citrus = '#ddf163';
const white = '#ffffff';
const green = '#79d259';
const aqua = '#37ac8c';
const merlinsbeard = '#f7f7f3';
const bg = '#306c90';

// const dataFromS = () =>{
//     {"type": "ROOT", "id": 1, "parent_id":-1, children_id: [], from: [-1, -1], to: [-1, -1]}
//     {"type": "variable", "id": 2, "parent_id":1, children_id: [], from: [1, 0], to: [1, 0], name": A, value_id: null}
//     {"type": "variable", "id": 3, "parent_id":1, children_id: [], from: [1, 2], to: [1, 2], name": B, value_id: null}
//     {"type": "variable", "id": 6, "parent_id":5, children_id: [], from: [1, 21], to: [1, 21], name": D, value_id: null}
//     {"type": "variable", "id": 7, "parent_id":5, children_id: [], from: [1, 23], to: [1, 23], name": E, value_id: null}
//     {"type": "variable", "id": 9, "parent_id":8, children_id: [], from: [1, 26], to: [1, 26], name": F, value_id: null}
//     {"type": "variable", "id": 10, "parent_id":8, children_id: [], from: [1, 28], to: [1, 28], name": G, value_id: null}
//     {"type": "subscript, id: 12, "parent_id":11, children_id: [], from: [1, 32], to: [1, 33]}
//     {"type": "variable", id: 11, "parent_id":8, children_id: [12], from: [1, 30], to: [1, 30], name": H, value_id: null}
//     {"type": "list, id: 8, "parent_id":5, children_id: [9, 10, 11], from: [1, 26], to: [1, 35]}
//     {"type": "subscript, "id": 14, "parent_id":13, children_id: [], from: [1, 41], to: [1, 42]}
//     {"type": "variable", "id": 13, "parent_id":5, children_id: [14], from: [1, 39], to: [1, 39], name": I, value_id: null}
//     {"type": "variable", "id": 15, "parent_id":5, children_id: [], from: [1, 46], to: [1, 46], name": j, value_id: null}
//     {"type": "subscript, "id": 5, "parent_id":4, children_id: [6, 7, 8, 13, 15], from: [1, 6], to: [1, 48]}
//     {"type": "variable", "id": 4, "parent_id":1, children_id: [5], from: [1, 4], to: [1, 4], name": C, value_id: null}
//     {"type": "variable", "id": 17, "parent_id":16, children_id: [], from: [3, 1], to: [3, 1], name": A, value_id: null}
//     {"type": "variable", "id": 18, "parent_id":16, children_id: [], from: [3, 3], to: [3, 3], name": B, value_id: null}
//     {"type": "list, "id": 16, "parent_id":1, children_id: [17, 18], from: [3, 1], to: [3, 5]}
//     {"type": "variable", "id": 20, "parent_id":19, children_id: [], from: [5, 1], to: [5, 1], name": A, value_id: null}
//     {"type": "variable", "id": 22, "parent_id":21, children_id: [], from: [5, 5], to: [5, 5], name": A, value_id: null}
//     {"type": "variable", "id": 23, "parent_id":21, children_id: [], from: [5, 7], to: [5, 7], name": C, value_id: null}
//     {"type": "list, "id": 21, "parent_id":19, children_id: [22, 23], from: [5, 5], to: [5, 7]}
//     {"type": "list, "id": 19, "parent_id":1, children_id: [20, 21], from: [5, 1], to: [5, 8]}
//
// }
const dataFromS = [
    ["{type: ROOT, id: 1, parent_id:-1, children_id: [], from: [-1, -1], to: [-1, -1]}\n"] ,
    ["{type: variable, id: 2, parent_id:1, children_id: [], from: [1, 0], to: [1, 0], name: A, value_id: null}\n"] ,
    "{type: variable, id: 3, parent_id:1, children_id: [], from: [1, 2], to: [1, 2], name: B, value_id: null}\n" +
    "{type: variable, id: 6, parent_id:5, children_id: [], from: [1, 21], to: [1, 21], name: D, value_id: null}\n" +
    "{type: variable, id: 7, parent_id:5, children_id: [], from: [1, 23], to: [1, 23], name: E, value_id: null}\n" +
    "{type: variable, id: 9, parent_id:8, children_id: [], from: [1, 26], to: [1, 26], name: F, value_id: null}\n" +
    "{type: variable, id: 10, parent_id:8, children_id: [], from: [1, 28], to: [1, 28], name: G, value_id: null}\n" +
    "{type: subscript, id: 12, parent_id:11, children_id: [], from: [1, 32], to: [1, 33]}\n" +
    "{type: variable, id: 11, parent_id:8, children_id: [12], from: [1, 30], to: [1, 30], name: H, value_id: null}\n" +
    "{type: list, id: 8, parent_id:5, children_id: [9, 10, 11], from: [1, 26], to: [1, 35]}\n" +
    "{type: subscript, id: 14, parent_id:13, children_id: [], from: [1, 41], to: [1, 42]}\n" +
    "{type: variable, id: 13, parent_id:5, children_id: [14], from: [1, 39], to: [1, 39], name: I, value_id: null}\n" +
    "{type: variable, id: 15, parent_id:5, children_id: [], from: [1, 46], to: [1, 46], name: j, value_id: null}\n" +
    "{type: subscript, id: 5, parent_id:4, children_id: [6, 7, 8, 13, 15], from: [1, 6], to: [1, 48]}\n" +
    "{type: variable, id: 4, parent_id:1, children_id: [5], from: [1, 4], to: [1, 4], name: C, value_id: null}\n" +
    "{type: variable, id: 17, parent_id:16, children_id: [], from: [3, 1], to: [3, 1], name: A, value_id: null}\n" +
    "{type: variable, id: 18, parent_id:16, children_id: [], from: [3, 3], to: [3, 3], name: B, value_id: null}\n" +
    "{type: list, id: 16, parent_id:1, children_id: [17, 18], from: [3, 1], to: [3, 5]}\n" +
    "{type: variable, id: 20, parent_id:19, children_id: [], from: [5, 1], to: [5, 1], name: A, value_id: null}\n" +
    "{type: variable, id: 22, parent_id:21, children_id: [], from: [5, 5], to: [5, 5], name: A, value_id: null}\n" +
    "{type: variable, id: 23, parent_id:21, children_id: [], from: [5, 7], to: [5, 7], name: C, value_id: null}\n" +
    "{type: list, id: 21, parent_id:19, children_id: [22, 23], from: [5, 5], to: [5, 7]}\n" +
    "{type: list, id: 19, parent_id:1, children_id: [20, 21], from: [5, 1], to: [5, 8]}"
]

const cluster = {
        "name": "(1) ROOT",
            "children": [
                { "name": "(2) Var A" },
                { "name": "(3) Var B" },
                { "name": "(4) Var C",
                    "children": [
                        {"name": "(5) Subscript",
                            "children": [
                                { "name": "(6) Var D" },
                                { "name": "(7) Var E" },
                                { "name": "(8) List",
                                    "children": [
                                        { "name": "(9) Var F"},
                                        { "name": "(10) Var G"},
                                        { "name": "(11) Var H",
                                            "children": [
                                                { "name": "(12) Subscript"},
                                            ]
                                        },
                                    ]
                                },
                                { "name": "(13) Var I",
                                    "children": [
                                        { "name" : "(14) Subscript"},
                                    ]
                                },
                                { "name": "(15) Var j" },
                        ]},
                ]}
                ,
                { "name": "(16) List",
                    "children": [
                        { "name": "(17) Var A"},
                        { "name": "(18) Var B"},
                    ]},
                { "name": "(19) List",
                    "children": [
                        { "name": "(20) Var A" },
                        { "name": "(21) List",
                            "children": [
                                { "name": "(22) Var A"},
                                { "name": "(23) Var C"},
                            ]},
                    ]},
            ],
}



function Node({ node }) {
    const isRoot = node.depth === 0;
    const isParent = !!node.children;

    if (isRoot) return <RootNode node={node} />;

    return (
        <Group top={node.y} left={node.x}>
            {node.depth !== 0 && (
                <circle
                    r={20}
                    fill={bg}
                    stroke={isParent ? white : citrus}
                    onClick={() => {
                        alert(`clicked: ${JSON.stringify(node.data.name)}`);
                    }}
                />
            )}
            <text
                dy={'.33em'}
                fontSize={9}
                fontFamily="Arial"
                textAnchor={'middle'}
                style={{ pointerEvents: 'none' }}
                fill={isParent ? white : citrus}
            >
                {node.data.name}
            </text>
        </Group>
    );
}

function RootNode({ node }) {
    const width = 160;
    const height = 80;
    const centerX = -width / 2;
    const centerY = -height / 2;

    return (
        <Group top={node.y} left={node.x}>
            <rect width={width} height={height} y={centerY} x={centerX} fill="url('#top')" />
            <text
                dy={'.33em'}
                fontSize={9}
                fontFamily="Arial"
                textAnchor={'middle'}
                style={{ pointerEvents: 'none' }}
                fill={bg}
            >
                {node.data.name}
            </text>
        </Group>
    );
}

const Dendogram = ({
                       // width = 500,
                       // height = 800,
                       margin = {
                           top: 40,
                           left: 0,
                           right: 0,
                           bottom: 110
                       }
                   }) => {
    const handleDataFromS = (dataFromS) => {

    }

    const data = hierarchy(cluster);
    // const xMax = width - margin.left - margin.right;
    // const yMax = height - margin.top - margin.bottom;

    return (
        <div className="graph-container">
            <svg className="graph">
                <LinearGradient id="top" from={green} to={aqua} />
                <rect width={1000} height={600} rx={14} fill={bg} />
                <Cluster root={data} size={[990, 500]}>
                    {cluster => {
                        return (
                            <Group top={margin.top} left={margin.left}>
                                {cluster.links().map((link, i) => {
                                    return (
                                        <LinkVertical
                                            key={`cluster-link-${i}`}
                                            data={link}
                                            stroke={merlinsbeard}
                                            strokeWidth="1"
                                            strokeOpacity={0.2}
                                            fill="none"
                                        />
                                    );
                                })}
                                {cluster.descendants().map((node, i) => {
                                    return <Node key={`cluster-node-${i}`} node={node} />;
                                })}
                            </Group>
                        );
                    }}
                </Cluster>
            </svg>
            <Button className="btn-yes" type="danger" size="large" onClick={() => console.log(dataFromS)}> click me </Button>
            <div style={{ background: '#ECECEC', padding: '30px' }}>
                <Card title="Card title" bordered={false} style={{ width: 300 }}>
                    <p>Card content</p>
                    <p>Card content</p>
                    <p>Card content</p>
                </Card>
            </div>
        </div>

    );
};


export default Dendogram