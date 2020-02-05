// import React, { useState,useContext,useEffect} from "react";
import React, { useContext } from "react";
import Context from '../GlobalState/context'
import Tree from 'react-d3-tree';
import dataJson from "../input/input.json"

const dataFromS = dataJson.data;

const colors = {
  variable: 'red',
  list: 'green',
  function: 'blue',
  dictionary: 'purple',
  class: 'orange',
  number: 'aquamarine',
  subscript: 'gold',
  composed_element: 'lightblue',
  variable_reference: 'brown',
  tuple: 'cadetblue',
  function_reference: 'deeppink',
  class_reference: 'mediumspringgreen',
  calledClass: 'greenyellow',
  for_block: 'orchid',
  while_block: 'palegreen',
  if_block: 'teal',
  condition: 'sandybrown',
  composed: 'springgreen',
  return: 'violet',
  function_call: 'yellowgreen',
  class_call: 'yellow',
  boolean: 'limegreen',
  rule: 'lightseagreen'
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
  }else if(node.type==='variable_reference'){
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
  }else if(node.type==='tuple'){
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
  }else if(node.type==='function_reference'){
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
  }else if(node.type==='class_reference'){
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
  }else if(node.type==='calledClass'){
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
  }else if(node.type==='for_block'){
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
  }else if(node.type==='while_block'){
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
  }else if(node.type==='if_block'){
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
  }else if(node.type==='condition'){
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
  }else if(node.type==='composed'){
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
  }else if(node.type==='return'){
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
  }else if(node.type==='function_call'){
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
  }else if(node.type==='class_call'){
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
        "fill": "${colors[node.type]}",
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


var datico = transformData(dataJson.data, dataJson.data[0]);
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
        <div id="treeWrapper" style={{marginLeft: 'auto', width: '75em', height: '30em'}}>
          <Tree data={JSON.parse(myTreeData)} orientation = 'vertical' onClick={clickHandler} onUpdate={updateHandler} collapsible={false} />
          <button onClick={() => console.log(Tree)}>
            debug
          </button>
          
          <dataFromS/>
        </div>

      );

  }

  export default IndexTree;