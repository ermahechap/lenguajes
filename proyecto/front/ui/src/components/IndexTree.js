// import React, { useState,useContext,useEffect} from "react";
import React, { useContext } from "react";
import Context from '../GlobalState/context'
import Tree from 'react-d3-tree';

const dataFromS = [
  {type: 'ROOT', id: 1, parent_id:-1, children_id: [2, 3, 4, 27, 33], from: [-1, -1], to: [-1, -1]},
  {type: 'variable', id: 2, parent_id:1, children_id: [], from: [1, 0], to: [1, 0], name: 'A', value_id: null, declared_id: null, mentions_ids: [29, 35, 39]},
  {type: 'variable', id: 3, parent_id:1, children_id: [], from: [1, 2], to: [1, 2], name: 'B', value_id: null, declared_id: null, mentions_ids: [31]},
  {type: 'variable', id: 4, parent_id:1, children_id: [5], from: [1, 4], to: [1, 4], name: 'C', value_id: null, declared_id: null, mentions_ids: [41]},
  {type: 'subscript', id: 5, parent_id:4, children_id: [6, 7, 8, 9, 10, 11, 12, 13, 22, 25, 26], from: [1, 6], to: [1, 48]},
  {type: 'number', id: 6, parent_id:5, children_id: [], from: [1, 6], to: [1, 6]},
  {type: 'number', id: 7, parent_id:5, children_id: [], from: [1, 8], to: [1, 8]},
  {type: 'number', id: 8, parent_id:5, children_id: [], from: [1, 12], to: [1, 12]},
  {type: 'number', id: 9, parent_id:5, children_id: [], from: [1, 15], to: [1, 15]},
  {type: 'number', id: 10, parent_id:5, children_id: [], from: [1, 17], to: [1, 17]},
  {type: 'variable', id: 11, parent_id:5, children_id: [], from: [1, 21], to: [1, 21], name: 'D', value_id: null, declared_id: null, mentions_ids: []},
  {type: 'variable', id: 12, parent_id:5, children_id: [], from: [1, 23], to: [1, 23], name: 'E', value_id: null, declared_id: null, mentions_ids: []},
  {type: 'list', id: 13, parent_id:5, children_id: [14, 16, 18], from: [1, 26], to: [1, 35], elements_ids: [14, 16, 18]},
  {type: 'composed_element', id: 14, parent_id:13, children_id: [15], from: [1, 26], to: [1, 26]},
  {type: 'variable', id: 15, parent_id:14, children_id: [], from: [1, 26], to: [1, 26], name: 'F', value_id: null, declared_id: null, mentions_ids: []},
  {type: 'composed_element', id: 16, parent_id:13, children_id: [17], from: [1, 28], to: [1, 28]},
  {type: 'variable', id: 17, parent_id:16, children_id: [], from: [1, 28], to: [1, 28], name: 'G', value_id: null, declared_id: null, mentions_ids: []},
  {type: 'composed_element', id: 18, parent_id:13, children_id: [19], from: [1, 30], to: [1, 35]},
  {type: 'variable', id: 19, parent_id:18, children_id: [20], from: [1, 30], to: [1, 30], name: 'H', value_id: null, declared_id: null, mentions_ids: []},
  {type: 'subscript', id: 20, parent_id:19, children_id: [21], from: [1, 32], to: [1, 33]},
  {type: 'number', id: 21, parent_id:20, children_id: [], from: [1, 33], to: [1, 33]},
  {type: 'variable', id: 22, parent_id:5, children_id: [23], from: [1, 39], to: [1, 39], name: 'I', value_id: null, declared_id: null, mentions_ids: []},
  {type: 'subscript', id: 23, parent_id:22, children_id: [24], from: [1, 41], to: [1, 42]},
  {type: 'number', id: 24, parent_id:23, children_id: [], from: [1, 42], to: [1, 42]},
  {type: 'variable', id: 25, parent_id:5, children_id: [], from: [1, 46], to: [1, 46], name: 'j', value_id: null, declared_id: null, mentions_ids: []},
  {type: 'number', id: 26, parent_id:5, children_id: [], from: [1, 48], to: [1, 48]},
  {type: 'list', id: 27, parent_id:1, children_id: [28, 30], from: [2, 1], to: [2, 5], elements_ids: [28, 30]},
  {type: 'composed_element', id: 28, parent_id:27, children_id: [29], from: [2, 1], to: [2, 1]},
  {type: 'variable', id: 29, parent_id:28, children_id: [], from: [2, 1], to: [2, 1], name: 'A', value_id: null, declared_id: 2, mentions_ids: []},
  {type: 'composed_element', id: 30, parent_id:27, children_id: [31, 32], from: [2, 3], to: [2, 5]},
  {type: 'variable', id: 31, parent_id:30, children_id: [], from: [2, 3], to: [2, 3], name: 'B', value_id: null, declared_id: 3, mentions_ids: []},
  {type: 'number', id: 32, parent_id:30, children_id: [], from: [2, 5], to: [2, 5]},
  {type: 'list', id: 33, parent_id:1, children_id: [34, 36], from: [3, 1], to: [3, 8], elements_ids: [34, 36]},
  {type: 'composed_element', id: 34, parent_id:33, children_id: [35], from: [3, 1], to: [3, 1]},
  {type: 'variable', id: 35, parent_id:34, children_id: [], from: [3, 1], to: [3, 1], name: 'A', value_id: null, declared_id: 2, mentions_ids: []},
  {type: 'composed_element', id: 36, parent_id:33, children_id: [37], from: [3, 4], to: [3, 8]},
  {type: 'list', id: 37, parent_id:36, children_id: [38, 40], from: [3, 5], to: [3, 7], elements_ids: [38, 40]},
  {type: 'composed_element', id: 38, parent_id:37, children_id: [39], from: [3, 5], to: [3, 5]},
  {type: 'variable', id: 39, parent_id:38, children_id: [], from: [3, 5], to: [3, 5], name: 'A', value_id: null, declared_id: 2, mentions_ids: []},
  {type: 'composed_element', id: 40, parent_id:37, children_id: [41], from: [3, 7], to: [3, 7]},
  {type: 'variable', id: 41, parent_id:40, children_id: [], from: [3, 7], to: [3, 7], name: 'C', value_id: null, declared_id: 4, mentions_ids: []},
  ]

// const datos = require('./DataFromS.js');


const colors = {
  variable: 'red',
  list: 'green',
  function: 'blue',
  dictionary: 'purple',
  class: 'orange',
  number: 'aquamarine',
  subscript: 'gold',
  composed_element: 'lightblue'
}

function transformData(data,node){
  var strData = '';
  if(node.type==='variable'){
    strData = `{
      "name": "${node.type}",
      "attributes": {
      "name": "${node.name}",
      "id": "${node.id}",
      "from": "${node.from}",
      "to": "${node.to}",
      "mentions_ids": "${node.mentions_ids}"
    },
      "nodeSvgShape": {
        "shapeProps": {
          "fill": "${colors[node.type]}",
          "r": 10
        },
      },
      `
  }else if(node.type==='list'){
    strData = `{
      "name": "${node.type}",
      "attributes": {
      "id": "${node.id}",
      "from": "${node.from}",
      "to": "${node.to}",
      "mentions_ids": "${node.elements_ids}" 
    },
    "nodeSvgShape": {
      "shapeProps": {
        "fill": "${colors[node.type]}",
        "r": 10
      },
    },
  `
  }else if(node.type==='dictionary'){
    strData = `{
      "name": "${node.type}",
      "attributes": {
      "id": "${node.id}",
      "from": "${node.from}",
      "to": "${node.to}",
      "mentions_ids": "${node.elements_ids}" 
    },
    "nodeSvgShape": {
      "shapeProps": {
        "fill": "${colors[node.type]}",
        "r": 10
      },
    },
    `
  }else if(node.type==='function'){
    strData = `{
      "name": "${node.type}",
      "attributes": {
      "name": "${node.name}",
      "id": "${node.id}",
      "from": "${node.from}",
      "to": "${node.to}",
      "mentions_ids": "${node.elements_ids}" 
    },
    "nodeSvgShape": {
      "shapeProps": {
        "fill": "${colors[node.type]}",
        "r": 10
      },
    },
    `
  }else if(node.type==='class'){
    strData = `{
      "name": "${node.type}",
      "attributes": {
      "name": "${node.name}",
      "id": "${node.id}",
      "from": "${node.from}",
      "to": "${node.to}" 
    },
    "nodeSvgShape": {
      "shapeProps": {
        "fill": "${colors[node.type]}",
        "r": 10
      },
    },
   `
  }else if(node.type==='number'){
    strData = `{
      "name": "${node.type}",
      "attributes": {
      "id": "${node.id}",
      "from": "${node.from}",
      "to": "${node.to}" 
    },
    "nodeSvgShape": {
      "shapeProps": {
        "fill": "${colors[node.type]}",
        "r": 10
      },
    },
   `
  }else if(node.type==='composed_element'){
    strData = `{
      "name": "${node.type}",
      "attributes": {
      "id": "${node.id}",
      "from": "${node.from}",
      "to": "${node.to}" 
    },
    "nodeSvgShape": {
      "shapeProps": {
        "fill": "${colors[node.type]}",
        "r": 10
      },
    },
   `
  }else if(node.type==='subscript'){
    strData = `{
      "name": "${node.type}",
      "attributes": {
      "id": "${node.id}",
      "from": "${node.from}",
      "to": "${node.to}" 
    },
    "nodeSvgShape": {
      "shapeProps": {
        "fill": "${colors[node.type]}",
        "r": 10
      },
    },
   `
  }else{
    strData = `{
      "name": "${node.type}",
      "attributes": {
      "id": "${node.id}",
      "from": "${node.from}",
      "to": "${node.to}" 
    },
    "nodeSvgShape": {
      "shapeProps": {
        "fill": "grey",
        "r": 10
      },
    },
   `
  }
  
  if(node.children_id.length!==0){
    strData += ' children: ['
    for(let i=0;i<node.children_id.length;i++){
      if(i>0){
        strData+=','
      }
      strData+= transformData(data,data[node.children_id[i]-1]);
    }
    strData += '] '
  }else{
  
  }
  strData += '}'
  
  return strData;
}


var datico = transformData(dataFromS, dataFromS[0]);
const myTreeData = JSON.stringify(eval("(" + datico + ")"));

  const updateHandler = (nodeData, event) => {
    
    console.log(nodeData.x+' '+nodeData.y);

    
  }



  
  const IndexTree = (props)=> {
      const {state, actions} = useContext(Context);
      const clickHandler = (nodeData, event) => {
        actions({
          type: 'setState',
          payload: {...state, nodeData: nodeData}
        });

      };
      return (
        <div id="treeWrapper" style={{width: '75em', height: '20em'}}>
          <Tree data={JSON.parse(myTreeData)} orientation = 'vertical' onClick={clickHandler} onUpdate={updateHandler} collapsible={false} />
          <button onClick={() => console.log(Tree)}>
            debug
          </button>
          
          <dataFromS/>
        </div>

      );

  }

  export default IndexTree;