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
 */


// https://www.geeksforgeeks.org/scope-resolution-in-python-legb-rule/
public class Scope {
    private Scope parentScope; //who is my parent
    private Node scopeNode; // must be a class, function or module. it identifies the node that opens this scope

    private  static String []builtin_methods = {"abs", "all", "min", "str", "zip", "range"}; // add as required from here https://docs.python.org/3/library/functions.html
    private static ArrayList<Module> modules= new ArrayList<>();

    private static HashMap<String, Node> lingering = new HashMap<>(); // keeps calls to node instances that have not been created yet. For example https://stackoverflow.com/questions/44423786/does-the-order-of-functions-in-a-python-script-matter
    // yet we assume that the code is well written and therefore we do not check whether is valid or not.

    public ArrayList<Scope> childrenScopes = new ArrayList<>(); // children scopes
    public HashMap<String, Node> nodes = new HashMap<>(); // K = node name, V = declaration, assign, etc within scope

    public Scope (Scope parentScope, Node scopeNode){

        this.parentScope = parentScope;
        this.scopeNode = scopeNode;
    }

    public boolean addChild(Scope childScope){
        return this.childrenScopes.add(childScope);
    }

    private ArrayList<Integer> getNodesIds(){
        ArrayList<Integer> ids = new ArrayList<>();
        this.nodes.forEach( (k,v)-> ids.add(v.id));
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

    public int addNodeToScope(Node node){ // -1 no named node, 1 name that already exists and needs to be rewritten, 0 new named node
        if(node.name == null) return -1;

        Scope scope = this;
        while(scope != null){
            if(scope.nodes.containsKey(node.name)) {
                Node scopeNode = scope.nodes.get(node.name);

                if(node.type.equals("variable")){
                    if(((Var) node).value == null){ // call
                        ((Var)scopeNode).addVarMention(node);
                        ((Var)node).assignVarDeclaration(scopeNode);
                    } else { // assign
                        scope.nodes.replace(node.name, node);
                    }
                } else if(node.type.equals("function") && node.type.equals("class")) {
                    scope.nodes.replace(node.name, node);
                }
                // if not found, it does not reference it
                return 1;
            }
            scope = scope.parentScope;
        }

        // if not found, creates it
        this.nodes.put(node.name, node);
        return 0;
    }

    public Node searchNode(String name) { // up lookup
        Scope scope = this;
        while(scope != null){
            if(scope.nodes.containsKey(name)) return scope.nodes.get(name);
            scope = scope.parentScope;
        }
        return null; // not found
    }

    public Node searchNodeInScope(String name) { // within scope
        return this.nodes.get(name);
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
