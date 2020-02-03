import React, { useState,useContext,useEffect} from "react";
import "../Styles/Code.css"
import { Checkbox } from 'antd';
import Context from "../GlobalState/context";
import dataJson from "../input/input.json"

const Code = (props) => {

    useEffect(() => {
        let script = document.createElement('script');
        script.type = 'text/javascript';
        script.async = true;

        script.src = 'https://cdn.rawgit.com/google/code-prettify/master/loader/run_prettify.js';
        (document.getElementsByTagName('head')[0] || document.getElementsByTagName('body')[0]).appendChild(script);


    });

    const { state } = useContext(Context);

    const setState = () =>{
        console.log(state);
    };

    const CheckboxGroup = Checkbox.Group;

    const plainOptions = ['variable', 'list', 'function', 'dictionary', 'class', 'number', 'subscript', 'composed Element'];
    /*variable: 'red',*/
    /*list: 'green',*/
    /*function: 'blue',*/
    /*dictionary: 'purple',*/
    /*class: 'orange',*/
    /*number: 'aquamarine',*/
    /*subscript: 'gold',*/
    /*composed_element: 'lightblue'*/
    const defaultCheckedList = ['Apple', 'Orange'];

    const [checkboxOptions, setCheckboxOptions] = useState({
        options: defaultCheckedList,
        inderteminate: true,
        checkAll: false
    });


    // const dataFromS = [
    //     {"type": "ROOT", "id": 1, "parent_id":-1, "children_id": [], "from": [-1, -1], "to": [-1, -1]},
    //     {"type": "variable", "id": 2, "parent_id":1, "children_id": [], "from": [1, 0], "to": [1, 0], "name": "A", "value_id": null},
    //     {"type": "variable", "id": 3, "parent_id":1, "children_id": [], "from": [1, 2], "to": [1, 2], "name": "B", "value_id": null},
    //     {"type": "variable", "id": 6, "parent_id":5, "children_id": [], "from": [1, 21], "to": [1, 21], "name": "D", "value_id": null},
    //     {"type": "variable", "id": 7, "parent_id":5, "children_id": [], "from": [1, 23], "to": [1, 23], "name": "E", "value_id": null},
    //     {"type": "variable", "id": 9, "parent_id":8, "children_id": [], "from": [1, 26], "to": [1, 26], "name": "F", "value_id": null},
    //     {"type": "variable", "id": 10, "parent_id":8, "children_id": [], "from": [1, 28], "to": [1, 28], "name": "G", "value_id": null},
    //     {"type": "subscript", "id": 12, "parent_id":11, "children_id": [], "from": [1, 32], "to": [1, 33]},
    //     {"type": "variable", "id": 11, "parent_id":8, "children_id": [12], "from": [1, 30], "to": [1, 30], "name": "H", "value_id": null},
    //     {"type": "list", "id": 8, "parent_id":5, "children_id": [9, 10, 11], "from": [1, 26], "to": [1, 35]},
    //     {"type": "subscript", "id": 14, "parent_id":13, "children_id": [], "from": [1, 41], "to": [1, 42]},
    //     {"type": "variable", "id": 13, "parent_id":5, "children_id": [14], "from": [1, 39], "to": [1, 39], "name": "I", "value_id": null},
    //     {"type": "variable", "id": 15, "parent_id":5, "children_id": [], "from": [1, 46], "to": [1, 46], "name": "j", "value_id": null},
    //     {"type": "subscript", "id": 5, "parent_id":4, "children_id": [6, 7, 8, 13, 15], "from": [1, 6], "to": [1, 48]},
    //     {"type": "variable", "id": 4, "parent_id":1, "children_id": [5], "from": [1, 4], "to": [1, 4], "name": "C", "value_id": null},
    //     {"type": "variable", "id": 17, "parent_id":16, "children_id": [], "from": [3, 1], "to": [3, 1], "name": "A", "value_id": null},
    //     {"type": "variable", "id": 18, "parent_id":16, "children_id": [], "from": [3, 3], "to": [3, 3], "name": "B", "value_id": null},
    //     {"type": "list", "id": 16, "parent_id":1, "children_id": [17, 18], "from": [3, 1], "to": [3, 5]},
    //     {"type": "variable", "id": 20, "parent_id":19, "children_id": [], "from": [5, 1], "to": [5, 1], "name": "A", "value_id": null},
    //     {"type": "variable", "id": 22, "parent_id":21, "children_id": [], "from": [5, 5], "to": [5, 5], "name": "A", "value_id": null},
    //     {"type": "variable", "id": 23, "parent_id":21, "children_id": [], "from": [5, 7], "to": [5, 7], "name": "C", "value_id": null},
    //     {"type": "list", "id": 21, "parent_id":19, "children_id": [22, 23], "from": [5, 5], "to": [5, 7]},
    //     {"type": "list", "id": 19, "parent_id":1, "children_id": [20, 21], "from": [5, 1], "to": [5, 8]}
    // ];


    const codeFromServer =`<code>
 class B:
     def __init__(self):
         pass
     def f(self):
         return 10;
     def ff(self, z, *args):
         return 10
 class A:
     a = B
     aa = B()
</code>`;

    const [code, setCode] = useState({
        str: codeFromServer
    });

    const rows = new Set();

    const setByRows = {};

    const opens = {};

    const closes = {};

    var temp = '';

    let b = false;

    const fillObjects = (codeFromServer) =>{
        console.log(dataJson.data);
        // console.log(dataFromS);
        for(let i = 0; i < dataJson.data.length; i++) {
            if(dataJson.data.parent_id === -1){

            }else{
                if((dataJson.data[i].from[0]) === (dataJson.data[i].to[0])){
                    if(!rows.has(dataJson.data[i].from[0])){
                        opens[dataJson.data[i].from[0]] = {};
                        closes[dataJson.data[i].to[0]] = {};
                        setByRows[dataJson.data[i].to[0]] = new Set();
                        rows.add((dataJson.data[i].from[0]));
                    }
                }else {
                    if(!rows.has(dataJson.data[i].from[0])){
                        opens[dataJson.data[i].from[0]] = {};
                        closes[dataJson.data[i].from[0]] = {};
                        rows.add((dataJson.data[i].from[0]));
                        setByRows[dataJson.data[i].from[0]] = new Set();
                    }
                    if(!rows.has(dataJson.data[i].to[0])){
                        closes[dataJson.data[i].to[0]] = {};
                        rows.add((dataJson.data[i].to[0]));
                        setByRows[dataJson.data[i].to[0]] = new Set();
                    }

                }
                /*variable: 'red',*/
                /*list: 'green',*/
                /*function: 'blue',*/
                /*dictionary: 'purple',*/
                /*class: 'orange',*/
                /*number: 'aquamarine',*/
                /*subscript: 'gold',*/
                /*composed_element: 'lightblue'*/
                opens[dataJson.data[i].from[0]][dataJson.data[i].from[1]] = "<mark class="+ "w" + " type=" + dataJson.data[i].type + " id=" + dataJson.data[i].id +">";
                closes[dataJson.data[i].to[0]][dataJson.data[i].to[1] + 1] = "</mark>";

                if(!setByRows[dataJson.data[i].from[0]].has(dataJson.data[i].from[1])){
                    setByRows[dataJson.data[i].from[0]].add(dataJson.data[i].from[1]);
                }

                if(!setByRows[dataJson.data[i].to[0]].has(dataJson.data[i].to[1]+1)){
                    setByRows[dataJson.data[i].to[0]].add(dataJson.data[i].to[1].valueOf()+1);
                }
            }

        }
        b = true;
    };

    const handleCodeFromServe = (codeFromServer) => {
        if(!b){
            fillObjects(codeFromServer);
        }
        const res = codeFromServer.split('\n');
        console.log(res);
        console.log(opens);
        console.log(closes);
        // console.log(setByRows);
        // temp += `<code>`;
        console.log(rows);
        for(let r = 0; r < res.length; r++){
            if(rows.has(r)){
                for(let c= 0; c < res[r].length; c++){
                    if(c in opens[r]){
                        // console.log(opens[row][j]);
                        temp+=(opens[r][c]);
                        // console.log(temp);
                    }
                    if(c in closes[r]){
                        temp+=(closes[r][c]);
                    }
                    temp+=(res[r][c]);
                }
                console.log("j: " + r);
            }else{
                temp+= res[r];
            }
            temp += "\n";
        }
        for(let r of res){
            console.log(r);
        }

        console.log("temp\n" + temp);
        setCode({...code,str: temp});
        return temp
    };

    const handleOptionsSelected = (optionsSelected) =>{
        if(!b){
            fillObjects(codeFromServer);
        }
        console.log(optionsSelected);
        const set = new Set(optionsSelected);
        console.log(set);
        console.log(opens);
        for(let r in opens){
            for(let i in opens[r]){
                let type = opens[r][i].split(' ')[2].split('=')[1];

                //https://love2dev.com/blog/javascript-includes/
                if(set.has(type)){
                    console.log(type);
                    console.log(opens[r][i]);
                    let begin = opens[r][i].substr(0,12);
                    let t = "w";
                    let end = opens[r][i].substr(13,opens[r][i].length);
                    switch (type) {
                        case "variable":
                            t = "v"
                            break;
                        case "list":
                            t = "l";
                            break;
                        case "function":
                            t = "f";
                            break;
                        case "dictionary":
                            t = "d";
                            break;
                        case "class":
                            t = "c";
                            break;
                        case "number":
                            t = "n";
                            break;
                        case "subscript":
                            t = "s";
                            break;
                        case "composed_element":
                            t = "e";
                            break;
                    }
                    opens[r][i] = begin+t+end;
                    // console.log(begin, "w", end)
                }

            }
        }
        handleCodeFromServe(codeFromServer);
        console.log(opens);
    };

    return (
        <div className="code-container">
            <p id="example1-description">
                This is the descriptive text before the code example:
            </p>
            <div className="checkbox-container">
                <div style={{ borderBottom: '1px solid #E9E9E9' }}>
                    <Checkbox
                        // indeterminate={()=>checkboxOptions.indeterminate}
                        // onChange={(e)=>onCheckAllChange(e)}
                        // checked={checkboxOptions.checkAll}
                    >
                        Check all
                    </Checkbox>
                </div>
                <br />
                <CheckboxGroup
                    options={plainOptions}
                    onChange={(optionsSelected) => handleOptionsSelected(optionsSelected)}
                    // value={checkboxOptions.options}
                    // onChange={() => onChange(checkboxOptions.options)}
                />
            </div>
            <button onClick={()=> handleCodeFromServe(codeFromServer)}>
                Code
            </button>
            <figure>
                <figcaption id="example1-caption" onClick={() => setState()}>
                    This is the caption
                </figcaption>
                <pre className="prettyprint"
                     dangerouslySetInnerHTML={{
                         __html: code.str
                     }}>
                </pre>
            </figure>
        </div>
    )
}

export default Code;