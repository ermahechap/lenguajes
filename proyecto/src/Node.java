import Utilities.*;
import sun.security.util.ArrayUtil;

import java.util.*;

/*
* Pending:
* Comprenhension // has its own scope
* sets - DONE
* tuples - DONE
* For - DONE
* While - DONE
 * function definition - DONE
 * If / else if / else
* function call
* global scope lookup
* imports (modules)
* lambdas (maybe, heck no)
* */

public class Node {
    public static ArrayList<Node> nodeDump = new ArrayList<>(); // this is intended to keep a reference of all nodes being created
    public String name, type;
    public Pair from, to;
    public static int counter;
    public int id;

    public Node parent;
    public ArrayList<Node> children = new ArrayList<>(); //children of this node

    public String wrapOnCommas(String str) { //this is an useless piece of shit that apparently everyone wants
        return "'" + str + "'";
    }

    public Node(Node parent, Pair from, Pair to) {
        if(parent != null) parent.addChild(this);
        this.parent = parent;
        this.from = from;
        this.to = to;
        this.counter++;
        this.id = counter;
        this.type = "node";
        this.nodeDump.add(this);

    }

    public boolean addChild(Node child) {
        return children.add(child);
    }

    private ArrayList<Integer> getChildrenIds() {
        ArrayList<Integer> child_ids = new ArrayList<>();
        for (Node child : children)
            child_ids.add(child.id);

        return child_ids;
    }

    private int getParentId() {
        return (this.parent == null) ? -1 : this.parent.id;
    }

    @Override
    public String toString() {
        return "{" +
                "type: " + wrapOnCommas(this.type) +
                ", id: " + this.id +
                ", parent_id:" + this.getParentId() +
                ", children_id: " + this.getChildrenIds().toString() +
                ", from: " + this.from.toString() +
                ", to: " +this.to.toString() +
                (( ("node number string boolean").contains(this.type) ) ? "}" : "")
                ;
    }
}

class Root extends Node {
    private static Root me = null;

    private Root(Pair from, Pair to) {
        super(null, from, to);
        this.type = "ROOT";
        this.me = this;
    }

    public static Root getRootInstance() { // Singleton, only one root
        if (me == null) {
            me = new Root(new Pair(-1, -1), new Pair(-1, -1));
            return me;
        }
        return me;
    }

    @Override
    public String toString(){
        return super.toString() + "}";
    }
}

/*
* Custom classes to handle other kind of things
* */

class Var extends Node {
    public Node value;
    private Node varDeclaration;
    private ArrayList<Node> varMentions = new ArrayList<>();

    public Var(Node parent, Pair from, Pair to, String name) {
        super(parent, from, to);
        this.name = name;
        this.type = "variable";
    }

    public void setValue(Node value) {
        this.value = value;
    }
    public void assignVarDeclaration(Node varDeclaration) {
        this.varDeclaration = varDeclaration;
    }
    public boolean addVarMention(Node varMention) {
        return this.varMentions.add(varMention);
    }

    private ArrayList<Integer> getVarMentions() {
        ArrayList<Integer> var_mentions = new ArrayList<>();
        for (Node varMention : varMentions)
            var_mentions.add(varMention.id);
        return var_mentions;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", name: " + wrapOnCommas(this.name) +
                ", value_id: " + ((this.value != null) ? this.value.id : "null") +
                ", declared_id: " + ((this.varDeclaration != null) ? this.varDeclaration.id : "null") +
                ", mentions_ids: " + getVarMentions().toString() +
                "}";
    }
}

class Subscript extends Node {
    public Subscript(Node parent, Pair from, Pair to) {
        super(parent, from, to);
        this.type = "subscript";
    }

    @Override
    public String toString(){
        return super.toString() + "}";
    }
}

class List_ extends Node {
    private ArrayList<Node> elements = new ArrayList<>();
    public List_(Node parent, Pair from, Pair to) {
        super(parent, from, to);
        this.type="list";
    }

    public boolean addElement(Node node){ return this.elements.add(node); }
    public ArrayList<Integer> getElementsIds() {
        ArrayList<Integer> ids = new ArrayList<>();
        this.elements.forEach(node -> ids.add(node.id));
        return ids;
    }

    @Override
    public String toString() {
        return super.toString() +
            ", elements_ids: " + getElementsIds() +
            "}";
    }
}

class Tuple extends List_ {
    public Tuple(Node parent, Pair from, Pair to){
        super(parent, from, to);
        this.type = "tuple";
    }
}

class Dictionary extends Node {
    private ArrayList<Pair <Node, Node> > pairs = new ArrayList<>(); //key, value;
    public Dictionary(Node parent, Pair from, Pair to) {
        super(parent, from, to);
        this.type = "dictionary";
    }
    public void addPairs (Node k, Node v) {
        this.pairs.add(new Pair<>(k,v));
    }

    public ArrayList<Pair<Integer, Integer>> getDictIds(){
        ArrayList<Pair<Integer, Integer>>ids = new ArrayList<>();
        pairs.forEach(nodeNodePair -> ids.add(new Pair<>(nodeNodePair.x.id, nodeNodePair.y.id)));
        return ids;
    }
    @Override
    public String toString() {
        return super.toString() +
            ", elements_ids: " + getDictIds() +
            "}";
    }
}


class Function extends Node {
    public ArrayList<Node> returns = new ArrayList<>();
    public ArrayList<Node> parameters = new ArrayList <>();

    public Function(Node parent, Pair from, Pair to, String name) {
        super(parent, from, to);
        this.name = name;
        this.type = "function";
    }

    public boolean addParameter(Node parameter) {
        return parameters.add(parameter);
    }

    public boolean addReturn(Node value) {
        return returns.add(value);
    }

    public ArrayList<Integer> getParametersIds(){
        ArrayList<Integer> ids = new ArrayList<>();
        this.parameters.forEach((n)->ids.add(n.id));
        return ids;
    }

    @Override
    public String toString() {
        return super.toString() +
            ", name: " + wrapOnCommas(this.name) +
            ",parameters_ids: " + this.getParametersIds() +
            "}";
    }
}

class FunctionCall extends Node {
    public ArrayList<Node> parameters = new ArrayList<>();
    public Function calledFunction;

    public FunctionCall(Node parent, Pair from, Pair to){
        super(parent, from, to);
        this.type = "function_call";
    }

    public boolean addParameter(Node parameter) {
        return parameters.add(parameter);
    }

    public ArrayList<Integer> getParametersIds(){
        ArrayList<Integer> ids = new ArrayList<>();
        for(Node node : this.parameters) {
            ids.add(node.id);
        }
        return ids;
    }
    @Override
    public String toString(){
        return super.toString() +
            ", parameters_ids: " + this.getParametersIds().toString() +
            ", called_function_id: " + ((this.calledFunction != null) ? this.calledFunction.id : "null") +
            "}";
    }
}


class Class extends Node {
    public Function constructor;
    public Class inherits;

    public Class(Node parent, Pair from, Pair to, String className) {
        super(parent, from, to);
        this.type = "class";
        this.name = className;
    }

    public void setConstructor(Function constructor){ this.constructor = constructor; }
    public void setInherits(Class inherits){ this.inherits = inherits; }

    @Override
    public String toString() {
        return super.toString() +
                ", name: " + wrapOnCommas(this.name) +
                ", constructor_id: " + ((this.constructor == null)? "null" : this.constructor.id) +
                ", inherits_id: " + ((this.inherits == null)? "null" : this.inherits.id) +
                "}";
    }
}


/* Pendiente */

class For extends Node {
    public Node Rule;

    public For(Node parent, Pair from, Pair to) {
        super(parent, from, to);
    }

    @Override
    public String toString() {
        return null;
    }
}

class While extends Node {
    public While(Node parent, Pair from, Pair to) {
        super(parent, from, to);
    }

    @Override
    public String toString() {
        return null;
    }
}



class If extends Node {
    public ArrayList<If> else_if = new ArrayList<>();
    public Node condition = null;
    public If(Node parent, Pair from, Pair to) {
        super(parent, from, to);
    }

    @Override
    public String toString() {
        return null;
    }
}




/* UTILITIES */

//composed node

class Composed extends Node {
    public Composed(Node parent, Pair from, Pair to) {
        super(parent, from, to);
        this.type = "composed";
    }

    @Override
    public String toString() {
        return super.toString() + "}";
    }
}


//composed node element

class ComposedElement extends Node {
    public ComposedElement(Node parent, Pair from, Pair to) {
        super(parent, from, to);
        this.type = "composed_element";
    }
    @Override
    public String toString() {
        return super.toString() + "}";
    }
}

class ReturnNode extends Node{
    private ArrayList<Node> returns = new ArrayList<>();
    public ReturnNode(Node parent, Pair from, Pair to) {
        super(parent, from, to);
        this.type = "return";
    }

    public boolean addReturn(Node node){ return this.returns.add(node); }
    public ArrayList<Integer> getRetunsIds() {
        ArrayList<Integer> ids = new ArrayList<>();
        returns.forEach((node -> ids.add(node.id)));
        return ids;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", returns_ids: " + this.getRetunsIds() +
                "}";
    }

}