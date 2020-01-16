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
    public ArrayList<Scope> childrenScopes = new ArrayList<>(); // children scopes
    public HashMap<String,ArrayList<Node>> nodes = new HashMap<>(); // K = node name, V = referenced places into scope

    public Scope (Scope parentScope, Node scopeNode){
        this.parentScope = parentScope;
        this.scopeNode = scopeNode;
    }

    public boolean addChild(Scope childScope){
        return this.childrenScopes.add(childScope);
    }

    public void addNodeToScope(Node node){
        if(node.name == null) return;

        //lookup in scopes
        

        if(!this.nodes.containsKey(node.name)) {
            ArrayList<Node> myNodes = new ArrayList<>();
            myNodes.add(node);
            this.nodes.put(node.name, myNodes);
        } else {
            ArrayList<Node> myNodes = nodes.get(node.name);
            Node scopeNode = myNodes.get(myNodes.size() - 1);

            if(scopeNode.type == "variable" && node.type == "variable"){
                if(((Var) node).value == null){
                    ((Var)scopeNode).addVarMention(node);
                    ((Var)node).assignVarDeclaration(scopeNode);
                    System.out.println("call " + node.name);
                } else {
                    myNodes.add(node); // assign;
                    System.out.println("assign " + node.name);
                }

            } else if(scopeNode.type == "function" && node.type == "function_call") {
                //pending

            } else if(scopeNode.type == "class" && node.type == "function_call") {
                //pending
            }
            this.nodes.replace(node.name, myNodes); //tho, i dont think it is necessary
        }

    }
    public Scope getParentScope(){
        return (this.parentScope == null)? this : this.parentScope;
    }
    public Node getScopeNode(){
        return this.scopeNode;
    }
}
