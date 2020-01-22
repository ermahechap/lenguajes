import React from 'react';
import Tree from 'react-d3-tree';

const dataFromS = [
    {"type": "ROOT", "id": 1, "parent_id":-1, "children_id": [2,3,4,19], "from": [-1, -1], "to": [-1, -1]},
    {"type": "variable", "id": 2, "parent_id":1, "children_id": [], "from": [1, 0], "to": [1, 0], "name": "A", "value_id": null},
    {"type": "variable", "id": 3, "parent_id":1, "children_id": [], "from": [1, 2], "to": [1, 2], "name": "B", "value_id": null},
    {"type": "variable", "id": 6, "parent_id":5, "children_id": [], "from": [1, 21], "to": [1, 21], "name": "D", "value_id": null},
    {"type": "variable", "id": 7, "parent_id":5, "children_id": [], "from": [1, 23], "to": [1, 23], "name": "E", "value_id": null},
    {"type": "variable", "id": 9, "parent_id":8, "children_id": [], "from": [1, 26], "to": [1, 26], "name": "F", "value_id": null},
    {"type": "variable", "id": 10, "parent_id":8, "children_id": [], "from": [1, 28], "to": [1, 28], "name": "G", "value_id": null},
    {"type": "subscript", "id": 12, "parent_id":11, "children_id": [], "from": [1, 32], "to": [1, 33]},
    {"type": "variable", "id": 11, "parent_id":8, "children_id": [12], "from": [1, 30], "to": [1, 30], "name": "H", "value_id": null},
    {"type": "list", "id": 8, "parent_id":5, "children_id": [9, 10, 11], "from": [1, 26], "to": [1, 35]},
    {"type": "subscript", "id": 14, "parent_id":13, "children_id": [], "from": [1, 41], "to": [1, 42]},
    {"type": "variable", "id": 13, "parent_id":5, "children_id": [14], "from": [1, 39], "to": [1, 39], "name": "I", "value_id": null},
    {"type": "variable", "id": 15, "parent_id":5, "children_id": [], "from": [1, 46], "to": [1, 46], "name": "j", "value_id": null},
    {"type": "subscript", "id": 5, "parent_id":4, "children_id": [6, 7, 8, 13, 15], "from": [1, 6], "to": [1, 48]},
    {"type": "variable", "id": 4, "parent_id":1, "children_id": [5], "from": [1, 4], "to": [1, 4], "name": "C", "value_id": null},
    {"type": "variable", "id": 17, "parent_id":16, "children_id": [], "from": [3, 1], "to": [3, 1], "name": "A", "value_id": null},
    {"type": "variable", "id": 18, "parent_id":16, "children_id": [], "from": [3, 3], "to": [3, 3], "name": "B", "value_id": null},
    {"type": "list", "id": 16, "parent_id":1, "children_id": [17, 18], "from": [3, 1], "to": [3, 5]},
    {"type": "variable", "id": 20, "parent_id":19, "children_id": [], "from": [5, 1], "to": [5, 1], "name": "A", "value_id": null},
    {"type": "variable", "id": 22, "parent_id":21, "children_id": [], "from": [5, 5], "to": [5, 5], "name": "A", "value_id": null},
    {"type": "variable", "id": 23, "parent_id":21, "children_id": [], "from": [5, 7], "to": [5, 7], "name": "C", "value_id": null},
    {"type": "list", "id": 21, "parent_id":19, "children_id": [22, 23], "from": [5, 5], "to": [5, 7]},
    {"type": "list", "id": 19, "parent_id":1, "children_id": [20, 21], "from": [5, 1], "to": [5, 8]}
]

function transformData(data){
  var strData = '';
  for(let i= 0 ; data.length; i++){
    console.log(data[i]);
    
  }
}



const myTreeData = [
    {
      name: 'Top Level',
      attributes: {
        keyA: 'val A',
        keyB: 'val B',
        keyC: 'val C',
      },
      children: [
        {
          name: 'Level 2: A',
          attributes: {
            keyA: 'val A',
            keyB: 'val B',
            keyC: 'val C',
          },
          children: [
              {
                  name: 'Level 2: B',
              attributes: {
                keyA: 'val A',
                keyB: 'val B',
                keyC: 'val C',
            },
        },
              {
                  name: 'Level 2: A',
              attributes: {
                keyA: 'val A',
                keyB: 'val B',
                keyC: 'val C',
            }
        }
          ]
        },
        {
          name: 'Level 2: B',
        },
      ],
    },
  ];

  // transformData(dataFromS);

  console.log(dataFromS);
  
  const Arbolito = ()=> { 
      return (
        //{/* <Tree /> will fill width/height of its container; in this case `#treeWrapper` */}
        <div id="treeWrapper" style={{width: '50em', height: '20em'}}>
  
          <Tree data={myTreeData} orientation = 'vertical' />
          
        </div>
      );

  }

  export default Arbolito;