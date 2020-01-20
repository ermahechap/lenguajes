import Utilities.Pair;

import java.util.*;
import java.util.HashMap;

/*
* Things that belongs to scopes:
* - Classes
* - var declaration
* - function declaration:
*   - Functions within a class (methods)
*   - Functions within functions
*   - Overloaded functions
 */


// https://www.geeksforgeeks.org/scope-resolution-in-python-legb-rule/
public class Scope {
    HashMap<String, ArrayList<Node> > context = new HashMap<>();
    private Scope parentScope; //who is my parent
    private Node scopeNode; // must be a class, function or module. it identifies the node that opens this scope

    private  static String []global_methods = {"abs", "all", "min", "str", "zip", "range"}; // add as required from here https://docs.python.org/3/library/functions.html
    private static ArrayList<Module> modules= new ArrayList<>();

    public ArrayList<Scope> childrenScopes = new ArrayList<>(); // children scopes
    public HashMap<String,ArrayList<Node>> nodes = new HashMap<>(); // K = node name, V = referenced places into scope

    public Scope (Scope parentScope, Node scopeNode){
        this.parentScope = parentScope;
        this.scopeNode = scopeNode;
    }

    public boolean addChild(Scope childScope){
        return this.childrenScopes.add(childScope);
    }

    private ArrayList<Integer> getNodesIds(){
        ArrayList<Integer> ids = new ArrayList<>();
        this.nodes.forEach( (k,v)-> v.forEach( (x)->ids.add(x.id) ) );
        return ids;
    }

    @Override
    public String toString(){
        return "{" +
                "\n\tnodes_ids: " + this.getNodesIds() +
                "\n\t,scope_node_id: " + this.scopeNode.id +
                "\n\t, parent_node_id: " + ((this.parentScope!=null)?this.parentScope.scopeNode.id : "null") +
                "\n\t}";
    }

    public int addNodeToScope(Node node){
        if(node.name == null) return -1;

        //lookup in scopes
        Scope scope = this;
        while(scope != null){
            if(scope.nodes.containsKey(node.name)) {
                ArrayList<Node> myNodes = scope.nodes.get(node.name);
                Node scopeNode = myNodes.get(myNodes.size() - 1);

                if(scopeNode.type == "variable" && node.type == "variable"){
                    if(((Var) node).value == null){ // call
                        ((Var)scopeNode).addVarMention(node);
                        ((Var)node).assignVarDeclaration(scopeNode);
                    } else { // assign
                        myNodes.add(node);
                    }
                } else if(scopeNode.type == "function" && node.type == "function_call") {
                    //pending

                } else if(scopeNode.type == "class" && node.type == "function_call") {
                    //pending
                }

                // if not found, it does not reference it, easier.
                scope.nodes.replace(node.name, myNodes); //tho, i dont think it is necessary
                return 1;
            }

            scope = scope.parentScope;
        }

        // if not found, creates it
        ArrayList<Node> myNodes =  new ArrayList<>();
        myNodes.add(node);
        this.nodes.put(node.name, myNodes);
        return 0;
    }

    public Node searchNode(String name) {
        Scope scope = this;
        while(scope != null){
            if(scope.nodes.containsKey(name)){
                ArrayList<Node> myNodes = scope.nodes.get(name);
                Node scopeNode = myNodes.get(myNodes.size()-1);
                return scopeNode;
            }
            scope = scope.parentScope;
        }
        return null; // not found
    }

    public Scope getParentScope(){
        return (this.parentScope == null)? this : this.parentScope;
    }
    public Node getScopeNode(){
        return this.scopeNode;
    }
}


// class to keep references to modules (from anaconda python, no own modules allowed, single file inputs)
class Module{
    public Module() {

    }
}
