import React, { useState,useContext,useEffect} from "react";
import "../Styles/Code.css"
import { Checkbox } from 'antd';
import Context from "../GlobalState/context";
import { Card } from 'antd';
import dataJson from "../input/input.json"
import { Row, Col } from 'antd';
import Arbolito from "./Arbolito dime tu";

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
    const { Meta } = Card;

    const plainOptions = ['variable', 'list', 'function', 'dictionary', 'class', 'number', 'subscript', 'composed Element', 'for_block', 'function_call'];
    /*variable: 'red',*/
    /*list: 'green',*/
    /*function: 'blue',*/
    /*dictionary: 'purple',*/
    /*class: 'orange',*/
    /*number: 'aquamarine',*/
    /*subscript: 'gold',*/
    /*composed_element: 'lightblue'*/

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
        str: codeFromServer
    });

    const [idCard, setIdCard] = useState({
        id: 123
    })

    const [cardInfo, setCardInfo] = useState({
        title: "Card Information",
        description: <p onClick={console.log("hola")}>Some Info</p>,
    })

    const rows = new Set();

    const setByRows = {};

    const opens = {};

    const closes = {};

    var temp = '';

    let b = false;

    // const fillCards = (dataJson) => {
    //     for(let i = 0; i<dataJson.data.length; i++){
    //         if(dataJson.data[i].parent_id !== -1){
    //
    //         }
    //     }
    //     return(
    //         <div>
    //
    //         </div>
    //     )
    //
    // };

    const fillObjects = (codeFromServer) =>{
        console.log(dataJson.data);
        // console.log(dataFromS);
        for(let i = 0; i < dataJson.data.length; i++) {
            if(dataJson.data[i].parent_id !== -1){
                console.log(dataJson.data[i]);
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
                opens[dataJson.data[i].from[0]][dataJson.data[i].from[1]] = "<mark class="+ "w" + " type=" + dataJson.data[i].type + " id=" + dataJson.data[i].id +
                                                                            " href=" + "\"https://docs.python.org/3/glossary.html\"" +
                                                                            + " onClick=" + "console.log(\"hola\") " +
                                                                            ">";
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
        console.log(rows);
        for(let r = 0; r < res.length; r++){
            if(rows.has(r)){
                for(let c= 0; c < res[r].length; c++){
                    if(opens[r] === undefined){

                    }else{
                        if(c in opens[r]){
                            temp+=(opens[r][c]);
                        }
                    }
                    if(closes[r] === undefined){

                    }else{
                        if(c in closes[r]){
                            temp+=(closes[r][c]);
                        }
                    }
                    temp+=(res[r][c]);
                }
            }else{
                temp+= res[r];
            }
            temp += "\n";
        }
        // for(let r of res){
        //     console.log(r);
        // }
        //
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
                        case "for_block":
                            t = "for";
                            break;
                        case "function_call":
                            t= "f_c";
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

    const fillCard = (id) => {
        let name = dataJson.data[id].type;


        let info = <ul>
            <li>{"id: " + dataJson.data[id].id}</li>
            {/*<li></li>*/}
            <li>{"from: " + dataJson.data[id].from}</li>
            <li>{"to: " + dataJson.data[id].to}</li>
            <li>{"info: " + dataJson.data[id].info}</li>
        </ul>;
        // const numbers = [1,1,1,1]
        // const info = dataJson.data.map((number) =>
        //     <li>{number}</li>
        // );


            // "<p>"+"id: " + dataJson.data[id].id + "</p>"+"\n"
            // + "children_id: " + dataJson.data[id].children_id +  "\n"
            // + "from: : " + dataJson.data[id].from +  "\n"
            // + "to: : " + dataJson.data[id].to +  "\n"
            // + "name: : " + dataJson.data[id].name +  "\n"
            // + "info: : " + dataJson.data[id].info +  "\n"
        setCardInfo({...cardInfo,
            title: name,
            description: info,
        });

        setIdCard({...idCard,
            id: (id+1) % dataJson.data.length
        })
    };

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
                </Col>
                <Col span={12}>
                    <div className="info-container">
                        <Card style={{ width: 300, marginTop: 50 }}
                              title={cardInfo.title}
                              extra={
                                  <div>
                                      <a onClick={() => fillCard(idCard.id)}> More </a>
                                      <a href="https://docs.python.org/3/glossary.html" rel="noopener noreferrer" target="_blank" onClick={() => console.log(cardInfo.description)}> Doc </a>
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