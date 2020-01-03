import java.util.ArrayList;
import java.util.HashMap;

// https://www.geeksforgeeks.org/scope-resolution-in-python-legb-rule/
public class Scope {
    HashMap<String, ArrayList<Node> > context = new HashMap<>();
    public Scope parentScope;
    public ArrayList<Scope> childrenScope = new ArrayList<>();

    public Scope (Scope parentScope){
        this.parentScope = parentScope;
    }

    public boolean addChild(Scope childScope){
        return this.childrenScope.add(childScope);
    }

    public boolean addElementToContext(Node node){
        String nodeClass = node.getClass().toString();
        if()
        return false
    }
}
