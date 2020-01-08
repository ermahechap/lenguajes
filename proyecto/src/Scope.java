import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

// https://www.geeksforgeeks.org/scope-resolution-in-python-legb-rule/
public class Scope {
    HashMap<String, ArrayList<Node> > context = new HashMap<>();
    public Scope parentScope; //who is my parent
    public ArrayList<Scope> childrenScope = new ArrayList<>(); // children scopes
    public HashMap<String,ArrayList<Node>> nodes = new HashMap<>(); // K = node name, V = referenced places into scope

    public Scope (Scope parentScope){
        this.parentScope = parentScope;
    }

    public boolean addChild(Scope childScope){
        return this.childrenScope.add(childScope);
    }

    public boolean addNodeToScope(Node node){
        String nodeTypes[] ={"variable", "function", "class"};
        if ( Arrays.stream(nodeTypes).anyMatch(x-> node.type.equals(x)) ){
            if(!this.nodes.containsKey(node.type)) {
                ArrayList<Node> myNodes = new ArrayList<>();
                myNodes.add(node);
                this.nodes.put(node.type, myNodes);
            } else {
                ArrayList<Node> myNodes = nodes.get(node.type);
                myNodes.add(node);
                this.nodes.replace(node.type, myNodes); //tho, i dont think it is necessary
            }
            return true;
        }
        return false;
    }
}
