package gp.project.nodes;

import gp.project.Serialize;
import gp.project.enums.NodeType;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Node {
    public NodeType type;
    public int depth;
    public List<Node> children;

    public Node() {
        children = new ArrayList<>();
    }

    public Node(NodeType type, int depth) {
        this();
        this.type = type;
        this.depth = depth;
    }

    public Node(NodeType type, int depth, List<Node> children) {
        this(type, depth);
        this.children = children;
    }

    public Node(Node another) {
        this.type = another.type;
        this.depth = another.depth;
        this.children = List.copyOf(another.children);
    }

    public void visitToSerialize(Serialize serialization){ //DFS + merge string to serialize with this function to keep ending tags
        for (var x: children) {
            stringToSerialize(serialization);
            x.visitToSerialize(serialization);
        }
    }

    public int grow() {
        return -1;
    }

    public void mutate() { }

    public void crossover(Node node) { }

    public void addChild(Node node) {
        children.add(node);
    }

    public Node copy() {
        List<Node> copiedChildren = new ArrayList<>();

        for (Node child : this.children)
            copiedChildren.add(child.copy());

        return new Node(type, depth, copiedChildren);
    }

    public void print() {
        System.out.println("-".repeat(Math.max(0, this.depth)) + '/' + this);

        for(Node child : children)
            child.print();
    }

    public String toString() {
        return this.type.toString();
    }

    public String stringToSerialize(Serialize serialization) { //function to serialize every node
        try{return "";}
    }
}
