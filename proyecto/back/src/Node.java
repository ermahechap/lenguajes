import Utilities.*;
import java.io.*;
import java.util.*;
import java.lang.Process;
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
    protected Scope scope; // just class declaration and function definition should use this, otherwise full scope lookup

    public String name, type;
    public Pair from, to;
    public static int counter;
    public int id;

    public Node parent;
    public ArrayList<Node> children = new ArrayList<>(); //children of this node

    public String wrapOnCommas(String str) { //this is an useless piece of shit that apparently everyone wants
        return "\"" + str + "\"";
    } //remove when webserver exists

    public void setScope(Scope scope){ this.scope = scope; }
    public Scope getScope() { return this.scope; }

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
            "\"type\": " + wrapOnCommas(this.type) +
            ", \"id\": " + this.id +
            ", \"parent_id\":" + this.getParentId() +
            ", \"children_id\": " + this.getChildrenIds().toString() +
            ", \"from\": " + ((from != null)? from.toString() : "null") +
            ", \"to\": " + ((to != null)? to.toString() : "null") +
            (( ("node number string boolean rule").contains(type) ) ? "}" : "");
    }
}

class Root extends Node {
    private static Root me = null;
    private  static String []builtin = {
            "abs", "all", "any", "ascii", "bin", "bool", "breakpoint", "bytearray", "bytes", "callable",
            "chr", "classmethod", "compile", "complex", "delattr", "dict", "dir", "divmod", "enumerate",
            "eval", "exec", "filter", "float", "format", "frozenset", "getattr", "globals", "hasattr",
            "hash", "help", "hex", "id", "input", "int", "isinstance", "issublcass", "iter", "len", "list",
            "locals", "map", "max", "memoryview", "min", "next", "object", "oct", "open", "ord", "pow", "print",
            "property", "range", "repr", "reversed", "round", "set", "setattr", "slice", "sorted", "staticmethod",
            "str", "sum", "super", "tuple", "type", "vars", "zip"
    };
    private static HashMap<String, Node> builtin_functions = new HashMap<>();
    // add from here https://docs.python.org/3/library/functions.html . This is verbose, but meh!
    private Root(Pair from, Pair to) {
        super(null, from, to);
        this.type = "ROOT";
        this.me = this;

        // creates built-in functions
        for(String name: builtin){
            Function function = new Function(null, from, to, name);
            ProcessBuilder pb = new ProcessBuilder("python", "namecheck.py", name); // /home/c3po/anaconda3/bin/python
            pb.directory(new File(System.getProperty("user.dir")));
            try{
                Process process = pb.start();
                BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
                process.waitFor();
                String line = reader.readLine();
                if(line !=null){
                    System.out.println(line);
                    function.info = (line.length() >100) ? line.substring(0, 100) + "...": line;
                }
            } catch (IOException | InterruptedException e) {
                System.out.println(e);
            }finally {
                if(function.info == null) function.info = "No Info!";
                builtin_functions.put(name, function);
            }
        }

    }

    public Node findBuiltinFunction(String str){
        return builtin_functions.get(str); // null if this does not exists
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
    public Node getVarDeclaration() {
        return this.varDeclaration;
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
                ", \"name\": " + wrapOnCommas(this.name) +
                ", \"value_id\": " + ((this.value != null) ? this.value.id : "null") +
                ", \"declared_id\": " + ((this.varDeclaration != null) ? this.varDeclaration.id : "null") +
                ", \"mentions_ids\": " + getVarMentions().toString() +
                "}";
    }
}

class VarReference extends Node {
    public Node reference;
    public VarReference(Node parent, Pair from, Pair to) {
        super(parent, from, to);
        this.type = "variable_reference";
    }

    public void setReference(Node reference) { this.reference = reference; }

    @Override
    public String toString(){
        return super.toString() +
            ", \"reference_id\": " + ((this.reference != null) ? this.reference.id : "null") +
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
            ", \"elements_ids\": " + getElementsIds() +
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
            ", \"elements_ids\": " + getDictIds() +
            "}";
    }
}


class Function extends Node {
    public ArrayList<Node> returns = new ArrayList<>();
    public ArrayList<Node> parameters = new ArrayList <>();
    public boolean isDefault = false;
    public String info;
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
        if (!isDefault){
            return super.toString() +
                ", \"name\": " + wrapOnCommas(this.name) +
                ", \"info\": " + ((this.info != null) ? wrapOnCommas(this.info) : "null") +
                "}";
        }
        return super.toString() +
            ", \"name\": " + wrapOnCommas(this.name) +
            ", \"parameters_ids\": " + this.getParametersIds() +
            "}";
    }
}


class FunctionReference extends Node{
    public Node calledFunction;

    public FunctionReference(Node parent, Pair from, Pair to){
        super(parent, from, to);
        this.type = "function_reference";
    }

    public void setCalledFunction(Node calledFunction) {
        this.calledFunction = calledFunction;
    }

    @Override
    public String toString(){
        return super.toString() +
            ", \"called_function_id\": " + ((this.calledFunction != null) ? this.calledFunction.id : "null") +
            (( this.type.equals("function_reference") ) ? "}" : "");
    }
}

class FunctionCall extends FunctionReference {
    public ArrayList<Node> parameters = new ArrayList<>();

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
            ", \"parameters_ids\": " + this.getParametersIds().toString() +
            "}";
    }
}

class ClassReference extends Node {
    public Node calledClass;

    public void setCalledClass(Node calledClass) {
        this.calledClass = calledClass;
    }
    public ClassReference(Node parent, Pair from, Pair to){
        super(parent, from, to);
        this.type = "class_reference";
    }
    @Override
    public String toString() {
        return super.toString() +
            ", \"called_class_id\": " + ((this.calledClass != null) ? this.calledClass.id : "null") +
            ((this.type.equals("class_reference")) ? "}" : "");
    }
}


class ClassCall extends ClassReference {
    public ArrayList<Node> parameters = new ArrayList<>(); // might or might not have these

    public ClassCall(Node parent, Pair from, Pair to) {
        super(parent, from, to);
        this.type = "class_call";
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
    public String toString() {
        return super.toString() +
            ", \"parameters_ids\": " + this.getParametersIds().toString() +
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
                ", \"name\": " + wrapOnCommas(this.name) +
                ", \"constructor_id\": " + ((this.constructor == null)? "null" : this.constructor.id) +
                ", \"inherits_id\": " + ((this.inherits == null)? "null" : this.inherits.id) +
                "}";
    }
}


class For extends Node {
    private Node rule;
    public For(Node parent, Pair from, Pair to) {
        super(parent, from, to);
        this.type = "for";
    }

    @Override
    public String toString() {
        return super.toString() +
            ", \"rule\": " + this.rule.id +
            "}";
    }

    public Node getRule() {
        return rule;
    }

    public void setRule(Node rule) {
        this.rule = rule;
        this.rule.type = "rule_block";
    }
}

class While extends Node {
    private Node rule;
    public While(Node parent, Pair from, Pair to) {
        super(parent, from, to);
        this.type = "while_block";
    }

    public Node getRule() {
        return rule;
    }

    public void setRule(Node rule) {
        this.rule = rule;
        this.rule.type = "rule";
    }

    @Override
    public String toString() {
        return super.toString() +
            ", \"rule\": " + this.rule.id +
            "}";
    }
}



class IfBlock extends Node {
    private ArrayList<Node> conditions = new ArrayList<>();

    public IfBlock(Node parent, Pair from, Pair to) {
        super(parent, from, to);
        this.type = "if_block";
    }
    public ArrayList<Integer> getConditionsIds() {
        ArrayList<Integer> ids = new ArrayList<>();
        conditions.forEach((x)->ids.add(x.id));
        return ids;
    }

    public boolean setCondition(Node condition) {
        return this.conditions.add(condition);
    }

    @Override
    public String toString() {
        return super.toString() +
            ", name: " + getConditionsIds() +
            "}";
    }
}

class Condition extends Node{
    private Node rule;
    public Condition(Node parent, Pair from, Pair to) {
        super(parent, from, to);
        this.type = "condition";
    }

    public Node getRule() {
        return rule;
    }

    public void setRule(Node rule) {
        this.rule = rule;
        this.rule.type = "rule";
    }

    @Override
    public String toString() {
        return super.toString() +
            ", \"rule\": " + ((this.rule != null) ? this.rule.id : "null") +
            "}";
    }
}



/* UTILITIES */

//composed node

class Composed extends Node {
    public boolean finished = true; // true means we can't expand more from here
    public Composed(Node parent, Pair from, Pair to) {
        super(parent, from, to);
        this.type = "composed";
    }

    @Override
    public String toString() {
        return super.toString() + "}";
    }
}

class ComposedReference extends Node {
    private Node reference;
    public ComposedReference(Node parent, Pair from, Pair to) {
        super(parent, from, to);
        this.type = "composed";
    }

    public void setReference(Node reference){ this.reference = reference; }

    @Override
    public String toString() {
        return super.toString() +
            ", \"referenced_id\": " + ((reference == null) ? "null": this.reference.id) +
            "}";
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
                ", \"returns_ids\": " + this.getRetunsIds() +
                "}";
    }

}