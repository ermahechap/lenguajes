import Utilities.*;
import java.util.*;

public abstract class Node {
    public Node parent = null;
    public ArrayList<Node> children = new ArrayList<>(); //children of this node

    public String type = null;
    public Pair from, to;
    public static int id;

    public Node(Node parent, Pair from, Pair to) {
        this.parent = parent;
        this.from = from;
        this.to = to;
        this.id++;
    }

    public boolean addChild(Node child) {
        return children.add(child);
    }

    public abstract String show();
}

/*
* Custom classes to handle other kind of things
* */

class Root extends Node {
    private static Root me = null;

    private Root(Node parent, Pair from, Pair to) {
        super(parent, from, to);
        this.type = "ROOT";
        this.me = this;
    }

    public static Root getRootInstance() { // Singleton, only one root
        if (me == null) {
            me = new Root(null, new Pair(-1, -1), new Pair(-1, -1));
            return me;
        }
        return me;
    }

    @Override
    public String show(){
        return "{" +
                "type: ROOT," +
                "id: " + this.id + ", " +
                "parent_id: -1" +
                "}";
    }
}

class Var extends Node {
    public Node value = null;
    public Var(Node parent, Pair from, String type) {
        super(parent, from, new Pair(-1, -1));
        this.type = "variable";
    }

    public void setTo(Pair to){
        this.to = to;
    }

    @Override
    public String show() {
        return null;
    }
}


class Function extends Node {
    public ArrayList<Node> returns = new ArrayList<>();
    public ArrayList<Node> parameters = new ArrayList <>();

    public Function(Node parent, Pair from, Pair to) {
        super(parent, from, to);
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


