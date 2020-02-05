import React, { useState,useContext,useEffect} from "react";
import "../Styles/Code.css"
import { Checkbox } from 'antd';
import Context from "../GlobalState/context";
import { Card } from 'antd';
import dataJson from "../input/input.json"
import { Row, Col } from 'antd';

const Code = (props) => {
    const { state } = useContext(Context);
    const CheckboxGroup = Checkbox.Group;

    const plainOptions = ['variable', 'list', 'function', 'dictionary', 'class', 'number', 'subscript', 'composed_element', 'variable_reference', 'tuple', 'function_reference', 'class_reference', 'calledClass', 'for_block', 'while_block', 'if_block', 'condition', 'composed', 'return','function_call','class_call','rule']

    const codeFromServer =`<code>
# class B:
#     def __init__(self):
#         pass
#     def f(self):
#         return 10;
#     def ff(self, z, *args):
#         return 10
# class A:
#     a = B
#     aa = B()
#
# A
# A()
# A.a
# A().a
# A.aa.f()
# A().aa.f()
# A().aa.ff(5,10)
#
# c = 10
# cc = c + 5
# cc = cc + 3
# zz = 1
# A = [1,2,3]
# A[:zz]

for i in range(10):
    print(i)

for i in [1,2,3]:
    print(i)

while True:
    print(i)
    break;

A = 10

if A == 10:
    print(A)
elif A == True:
    print(A)
else:
    print(A)
</code>`;

    const [code, setCode] = useState({
        str: ''
    });

    const [idTypeMap, setIdTypeMap] = useState({
        variable: [],
        list: [],
        function: [],
        dictionary: [],
        class: [],
        number: [],
        subscript: [],
        composed_element: [],
        variable_reference: [],
        tuple: [],
        function_reference: [],
        class_reference: [],
        calledClass: [],
        for_block: [],
        while_block: [],
        if_block: [], 
        condition: [],
        composed: [],
        return: [],
        function_call: [],
        class_call: [],
        rule: [],
    });

    const [idCard, setIdCard] = useState({
        last_id: 0,
        id: 0
    });

    const [cardInfo, setCardInfo] = useState({
        title: "Card Information",
        description: <p onClick={console.log("hola")}>Some Info</p>,
    });
    
    const [isHandled, setIsHandled] = useState(false)

    const [optionsSelected, setOptionsSelected] = useState([])

    const rows = new Set();

    const setByRows = {};

    const opens = {};

    const closes = {};

    var temp = '';

    const fillObjects = (codeFromServer) =>{
        let obj = Object.assign({}, idTypeMap);
        for(let i = 0; i < dataJson.data.length; i++) {
            if(dataJson.data[i].parent_id !== -1){
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

                if(opens[dataJson.data[i].from[0]] === undefined){
                    opens[dataJson.data[i].from[0]] = {};
                }
                if(closes[dataJson.data[i].to[0]] === undefined){
                    closes[dataJson.data[i].to[0]] = {};
                }
                // if(dataJson.data[i].id === 106){
                //     console.log(dataJson.data[i]);
                //     opens[dataJson.data[i].from[0]][dataJson.data[i].from[1]] = `<mark class="w ${dataJson.data[i].type}" id="${dataJson.data[i].id}">`
                //     console.log(opens[dataJson.data[i].from[0]][dataJson.data[i].from[1]]);
                // }
                if(opens[dataJson.data[i].from[0]][dataJson.data[i].from[1]] === undefined){
                    opens[dataJson.data[i].from[0]][dataJson.data[i].from[1]] = `<mark class="w ${dataJson.data[i].type}" id="${dataJson.data[i].id}">`
                }else{
                    opens[dataJson.data[i].from[0]][dataJson.data[i].from[1]] = `<mark class="w ${dataJson.data[i].type}" id="${dataJson.data[i].id}">` + opens[dataJson.data[i].from[0]][dataJson.data[i].from[1]]
                }
                if(closes[dataJson.data[i].to[0]][dataJson.data[i].to[1] + 1] === undefined){
                    closes[dataJson.data[i].to[0]][dataJson.data[i].to[1] + 1] = "</mark>";
                }else {
                    closes[dataJson.data[i].to[0]][dataJson.data[i].to[1] + 1] = closes[dataJson.data[i].to[0]][dataJson.data[i].to[1] + 1] + "</mark>";
                }

                
                let type = dataJson.data[i].type;
                if(obj[type] === undefined) obj[type] = [dataJson.data[i].type]
                else obj[type].push(dataJson.data[i].id)
                setCode({...code, str: temp});
                if(!setByRows[dataJson.data[i].from[0]].has(dataJson.data[i].from[1])){
                    setByRows[dataJson.data[i].from[0]].add(dataJson.data[i].from[1]);
                }

                if(!setByRows[dataJson.data[i].to[0]].has(dataJson.data[i].to[1]+1)){
                    setByRows[dataJson.data[i].to[0]].add(dataJson.data[i].to[1].valueOf()+1);
                }
            }
        }
        console.log(opens)
        setIdTypeMap(obj)
    };

    const handleCodeFromServe = (codeFromServer) => {
        console.log("handling....")
        fillObjects(codeFromServer);

        const res = codeFromServer.split('\n');
        for(let r = 0; r < res.length; r++){
            if(rows.has(r)){
                for(let c= 0; c < res[r].length; c++){
                    if(opens[r] !== undefined && c in opens[r]){
                        temp+=(opens[r][c]);
                    }
                    if(closes[r] !== undefined && c in closes[r]){
                        temp+=(closes[r][c]);
                    }
                    temp+=(res[r][c]);
                }
            }else{
                temp+= res[r];
            }
            temp += "\n";
        }

        setCode({...code, str: temp});
        setIsHandled(true)
    };

    const handleOptionsSelected = (options, id) =>{
        if(!isHandled) handleCodeFromServe(codeFromServer);
        let diff = plainOptions.filter(x => !options.includes(x))

        for(let c of diff){
            for(let id of idTypeMap[c]){
                if(document.getElementById(id))
                    document.getElementById(id).className = `${c} w`
            }
        }

        for(let c of options){
            for(let id of idTypeMap[c]){
                if(document.getElementById(id))
                    document.getElementById(id).className = c
            }
        }

        if(id && document.getElementById(dataJson.data[id].id)){
            console.log("aaa")
            document.getElementById(dataJson.data[id].id).className = 'selected'
        }
    };

    const fillCard = (id, last) => {
        let name = dataJson.data[id].type;
        let elements = Object.keys(dataJson.data[id]).map((k,v)=>{
            let val = (k,v)=>{
                if(k === 'from' || k === 'to')return v[0] + ", " + v[1]
                else if(v!==null && typeof(v) === 'object'){
                    return v.map((n)=>{
                        return <a onClick={() => fillCard(Math.abs(n) - 1 , id)}>{n},</a>
                    })
                } else if(typeof(v) === 'number')return <a onClick={() => fillCard(Math.abs(v) - 1, id)}>{v}</a>
                return v
            }
            
            return(<li>{k}: {val(k, dataJson.data[id][k])}</li>)
        })

        if(document.getElementById(dataJson.data[id].id)){
            document.getElementById(dataJson.data[id].id).className = 'selected'
        }

        if(last !== 0 && document.getElementById(dataJson.data[last].id)){
            document.getElementById(dataJson.data[last].id).className = ''
        }

        let info = <ul>
            {elements}
        </ul>;
        setCardInfo({...cardInfo,
            title: name,
            description: info,
        });
        setIdCard({...idCard,
            id: (id+1) % dataJson.data.length,
        })

        setIdCard({...idCard,
            last_id: last
        })
    };


    useEffect(() => {
        let script = document.createElement('script');
        script.type = 'text/javascript';
        script.async = true;

        script.src = 'https://cdn.rawgit.com/google/code-prettify/master/loader/run_prettify.js';
        (document.getElementsByTagName('head')[0] || document.getElementsByTagName('body')[0]).appendChild(script);
        if(!isHandled) handleCodeFromServe(codeFromServer);
    });

    return (
        <div>
            <Row>
                <Col span={12}>
                    <div className="code-container">
                        <p id="example1-description">
                            This is the descriptive text before the code example:
                        </p>
                        <div className="checkbox-container">
                            <CheckboxGroup
                                options={plainOptions}
                                onChange={(options) =>{
                                    handleOptionsSelected(options, idCard.id)
                                    setOptionsSelected(options)
                                }}
                                // value={checkboxOptions.options}
                                // onChange={() => onChange(checkboxOptions.options)}
                            />
                        </div>
                        <button onClick={()=> handleOptionsSelected(optionsSelected)}>
                            Code
                        </button>
                        <figure>
                            <pre className="prettyprint"
                                 dangerouslySetInnerHTML={{
                                     __html: code.str
                                 }}>
                            </pre>
                        </figure>
                    </div>
                </Col>
                <Col span={12}>
                    <div className="info-container">
                        <Card style={{ width: 300, marginTop: 50 }}
                              title={cardInfo.title}
                              extra={
                                  <div>
                                        <a onClick={() => {
                                                fillCard(idCard.id, idCard.last_id)
                                            }}> More </a>
                                            <a href="https://docs.python.org/3/glossary.html" 
                                            rel="noopener noreferrer" 
                                            target="_blank" onClick={() =>{
                                                console.log(cardInfo.description)
                                            }}> 
                                                Doc
                                            </a>
                                  </div>
                              }>
                            {cardInfo.description}


                        </Card>
                    </div>
                </Col>

            </Row>


        </div>

    )
}

export default Code;