package gp.project.nodes;

import gp.project.Serialize;
import gp.project.Tree;
import gp.project.enums.NodeType;

import java.util.ArrayList;
import java.util.List;

public class Node {
    public Tree tree;
    public NodeType type;
    public String name;
    public int value;
    public int depth;
    public int number;
    public List<Node> children;

    public Node() {
        children = new ArrayList<>();
    }



    public Node(Tree tree, NodeType type, int depth, int number) {
        this();
        this.tree = tree;
        this.type = type;
        this.depth = depth;
        this.number = number;
    }

    public Node(Tree tree, Node another) {
        this(tree, another.type, another.depth, another.number);

        for(Node child : another.children) {
            switch(child.type) {
                case IN:
                case OUT:
                case IF:
                case WHILE:
                case ASSIGN:
                    this.children.add(new StatementNode(tree, child));
                    break;
                case ID:
                case INT:
                    this.children.add(new FactorNode(tree, child));
                    break;
                default:
                    this.children.add(new ExpressionNode(tree, child));
            }
        }
    }

    public List<Node> find(Class<?> type) {
        List<Node> nodes = new ArrayList<>();

        for(Node child : children) {
            if (child.getClass() == type) {
                nodes.add(child);
            }
        }

        return nodes;
    }

    public void print() {
        System.out.println(getStringToPrint() + this);

        for(Node child : children) {
            child.print();
        }
    }

    public String toString() {
        return type.toString();
    }

    protected String getStringToPrint() {
        return "-".repeat(Math.max(0, depth)) + "\\";
    }

    protected StatementNode addStatementChild(int maxDepth) {
        NodeType newType = depth < maxDepth - 1 ? NodeType.getRandomStatement() : NodeType.getRandomOneLineStatement();
        StatementNode stNode = new StatementNode(tree, newType, depth + 1, tree.nodesCount++);
        children.add(stNode);
        return stNode;
    }

    protected ExpressionNode addExpressionChild() {
        NodeType newType = NodeType.getRandomExpression();
        ExpressionNode expNode = new ExpressionNode(tree, newType, depth + 1, tree.nodesCount++);
        children.add(expNode);
        return expNode;
    }

    protected void addFactorChild() {
        NodeType intOrId = NodeType.getRandomFactor();
        if (intOrId == NodeType.ID) {
            addIdChild();
        } else {
            addIntChild();
        }
    }

    protected void addIdChild() {
        this.children.add(new FactorNode(tree, tree.getRandomVariable(), depth + 1, tree.nodesCount++));
    }

    protected void addIntChild() {
        int intIdx = Tree.rd.nextInt(Tree.numbers.size());
        this.children.add(new FactorNode(tree, Tree.numbers.get(intIdx), depth + 1, tree.nodesCount++));
    }

    public void serialize(Serialize serialization) { //DFS

    }
}
