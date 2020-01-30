import React, { useEffect} from "react";
import "../Styles/Code.css"


const Code = (props) => {

    useEffect(() => {
        let script = document.createElement('script');
        script.type = 'text/javascript';
        script.async = true;

        script.src = 'https://cdn.rawgit.com/google/code-prettify/master/loader/run_prettify.js';
        (document.getElementsByTagName('head')[0] || document.getElementsByTagName('body')[0]).appendChild(script);

    });

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


    const codeFromServer =`<code>
A,B,C[5:10, 5, 5:10, D:E:[F,G,H[:10]], I[:5], j+5]

[A,B+5]

[A, [A,C]]
</code>`;

    const rows = new Set();

    const setByRows = {};

    const opens = {};

    const closes = {};

    var temp = '';

    const handleCodeFromServe = (codeFromServer) => {
        const res = codeFromServer.split('\n');
        console.log(res);
        var ob = {};
        for(var i = 1; i < dataFromS.length; i++) {
            if((dataFromS[i].from[0]) === (dataFromS[i].to[0])){
                if(!rows.has(dataFromS[i].from[0])){
                    opens[dataFromS[i].from[0]] = {};
                    closes[dataFromS[i].to[0]] = {};
                    setByRows[dataFromS[i].to[0]] = new Set();
                    rows.add((dataFromS[i].from[0]));
                    ob[dataFromS[i].to[0]] = [];
                }
            }else {
                if(!rows.has(dataFromS[i].from[0])){
                    opens[dataFromS[i].from[0]] = {};
                    closes[dataFromS[i].from[0]] = {};
                    rows.add((dataFromS[i].from[0]));
                    setByRows[dataFromS[i].from[0]] = new Set();
                    ob[dataFromS[i].from[0]] = [];
                }
                if(!rows.has(dataFromS[i].to[0])){
                    closes[dataFromS[i].to[0]] = {};
                    rows.add((dataFromS[i].to[0]));
                    setByRows[dataFromS[i].to[0]] = new Set();
                    ob[dataFromS[i].to[0]] = [];
                }

            }
            opens[dataFromS[i].from[0]][dataFromS[i].from[1]] = "<mark class="+ dataFromS[i].type + ">";

            closes[dataFromS[i].to[0]][dataFromS[i].to[1] + 1] = "</mark>";

            if(!setByRows[dataFromS[i].from[0]].has(dataFromS[i].from[1])){
                setByRows[dataFromS[i].from[0]].add(dataFromS[i].from[1]);
                ob[dataFromS[i].from[0]].push(dataFromS[i].from[1]);
                if(dataFromS[i].from[0] === 1){
                    // console.log(dataFromS[i].from[1]);
                }

            }

            if(!setByRows[dataFromS[i].to[0]].has(dataFromS[i].to[1]+1)){
                setByRows[dataFromS[i].to[0]].add(dataFromS[i].to[1].valueOf()+1);
                ob[dataFromS[i].to[0]].push((dataFromS[i].to[1])+1);
                if(dataFromS[i].to[0] === 1){
                    // console.log((dataFromS[i].to[1]+1));
                }
            }

        }
        console.log(opens);
        console.log(closes);
        console.log(setByRows);
        temp += `<code>`;
        for (let row of rows){
            for(var i = 0; i < res[row].length; i++){
                if(i in opens[row]){
                    console.log(opens[row][i]);
                    temp+=(opens[row][i]);
                    // console.log(temp);
                }
                if(i in closes[row]){
                    console.log(closes[row][i]);
                    temp+=(closes[row][i]);
                }
                console.log(res[row][i]);
                temp+=(res[row][i]);

            }
            temp += "\n";


            // console.log("----");
            // // console.log(typeof (Object.keys(opens[row])));
            // // console.log(Object.keys(opens[row]).concat(Object.keys(closes[row])));
            // // console.log(typeof (setByRows[row]))
            // console.log(Array.from(setByRows[row].entries).sort());
            // console.log([...(setByRows[row])].sort());
            // console.log(ob[row].sort().sort().sort());
            // console.log("----");
        }
        temp += `</code>`;
        console.log(temp)
        return temp
    }

    return (
        <div className="code-container">
            <p id="example1-description">
                This is the descriptive text before the code example:
            </p>
            <figure>
                <figcaption id="example1-caption" onClick={() => handleCodeFromServe(codeFromServer)}>
                    This is the caption
                </figcaption>
                <pre className="prettyprint"
                     dangerouslySetInnerHTML={{
                    __html: handleCodeFromServe(codeFromServer)
                }}>
                </pre>
            </figure>
        </div>
    )
}

export default Code;