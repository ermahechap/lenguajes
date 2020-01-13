import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

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
        if(!this.nodes.containsKey(node.name)) {
            ArrayList<Node> myNodes = new ArrayList<>();
            myNodes.add(node);
            this.nodes.put(node.name, myNodes);
        } else {
            ArrayList<Node> myNodes = nodes.get(node.name);
            myNodes.add(node);
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
