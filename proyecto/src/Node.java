import Utilities.*;
import java.util.*;

public class Node {
    public String name, type;
    public Pair from, to;
    public static int counter;
    public int id;

    public Node parent;
    public ArrayList<Node> children = new ArrayList<>(); //children of this node

    public Node(Node parent, Pair from, Pair to) {
        this.parent = parent;
        this.from = from;
        this.to = to;
        this.counter++;
        this.id = counter;
    }

    public Node() {
        this.counter++;
        this.id = counter;
    } // empty node, just in case


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

    public String show() {
        return "{" +
                "type: " + this.type +
                ", id: " + this.id +
                ", parent_id:" + this.getParentId() +
                ", children_id: " + this.getChildrenIds().toString() +
                ", from: " + this.from.toString() +
                ", to: " +this.to.toString()
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
    public String show(){
        return super.show() + "}";
    }
}

/*
* Custom classes to handle other kind of things
* */

class Var extends Node {
    public Node value;
    public Var(Node parent, Pair from, Pair to, String name) {
        super(parent, from, to);
        this.name = name;
        this.type = "variable";
    }

    public void assignValue(Node value) {
        this.value = value;
    }
    @Override
    public String show() {
        return super.show() +
                ", name: " + this.name +
                ", value_id: " + ((this.value != null) ? this.value.id : "null") +
                "}";
    }
}

class Subscript extends Node {
    public Subscript(Node parent, Pair from, Pair to) {
        super(parent, from, to);
        this.type = "subscript";
    }

    @Override
    public String show(){
        return super.show() + "}";
    }
}

class List_ extends Node {
    public List_(Node parent, Pair from, Pair to) {
        super(parent, from, to);
        this.type="list";
    }
    @Override
    public String show() {
        return super.show() + "}";
    }
}


class Function extends Node {
    public ArrayList<Node> returns = new ArrayList<>();
    public ArrayList<Node> parameters = new ArrayList <>();

    public Function(Node parent, Pair from, Pair to, String name) {
        super(parent, from, to);
        this.name = name;
    }

    public boolean addParameter(Node parameter) {
        return parameters.add(parameter);
    }

    public boolean addReturn(Node value) {
        return returns.add(value);
    }

    @Override
    public String show() {
        return null;
    }
}

class Class extends Node {
    public String className = null;
    public Function constructor = null;

    public Class(Node parent, Pair from, Pair to, String className) {
        super(parent, from, to);
        this.type = "subscript";
        this.className = className;
    }

    @Override
    public String show() {
        return "{type: " + this.className + "}";
    }
}




/* Pendiente */
class For extends Node {
    public For(Node parent, Pair from, Pair to) {
        super(parent, from, to);
    }

    @Override
    public String show() {
        return null;
    }
}

class While extends Node {
    public While(Node parent, Pair from, Pair to) {
        super(parent, from, to);
    }

    @Override
    public String show() {
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
    public String show() {
        return null;
    }
}


