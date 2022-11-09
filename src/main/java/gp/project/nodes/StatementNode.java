package gp.project.nodes;

import gp.project.Serialize;
import gp.project.Tree;
import gp.project.enums.NodeType;
import java.util.Optional;

public class StatementNode extends Node {
    public StatementNode(Tree tree, NodeType type, int depth, int number) {
        super(tree, type, depth, number);
    }

    public StatementNode(Tree tree, Node another) {
        super(tree, another);
    }

    public void grow(int maxDepth) {
        switch(this.type) {
            case IN:
                this.addIdChild();
                break;
            case OUT:
                this.addFactorChild();
                break;
            case IF:
                this.growIfAndWhileBase(maxDepth);
                int isElse = Tree.rd.nextInt(2);
                if (isElse == 1) {
                    StatementNode falseNode = addStatementChild(maxDepth);
                    falseNode.grow(maxDepth);
                }
                break;
            case WHILE:
                this.growIfAndWhileBase(maxDepth);
                break;
            case ASSIGN:
                this.addIdChild();
                ExpressionNode expNode = addExpressionChild();
                expNode.grow(maxDepth);
        }

    }

    private void growIfAndWhileBase(int maxDepth) {
        ExpressionNode expNode = addExpressionChild();
        expNode.grow(maxDepth);
        StatementNode trueNode = addStatementChild(maxDepth);
        trueNode.grow(maxDepth);
    }

    public void mutate() {
        clearChildren();
        type = NodeType.getRandomStatement();
        grow(depth);
    }

    public Optional<Node> crossover(Node node, int nodeNumber) {
        return Optional.empty();
    }

    public void serialize(Serialize serialization){
        switch(this.type) {
            case IN:
            case ASSIGN:
            case OUT:
                if (children.size() == 1) {
                    serialization.addToBuffer("(");
                    serialization.addToBuffer(this.type.toString());
                    children.get(0).serialize(serialization);
                    serialization.addToBuffer(")");

                }
                else{
                    serialization.addToBuffer("(");
                    children.get(0).serialize(serialization);
                    serialization.addToBuffer(this.type.toString());
                    children.get(1).serialize(serialization);
                    serialization.addToBuffer(")");

                }
                break;
            case IF:
                serialization.addToBuffer("(");
                serialization.addToBuffer("if");
                for (var x : children) {
                    x.serialize(serialization);
                }
                serialization.addToBuffer(")");
                break;
            case WHILE:
                serialization.addToBuffer("(");
                serialization.addToBuffer("while");
                for (var x : children) {
                    x.serialize(serialization);
                }
                serialization.addToBuffer(")");
                break;
        }
        }
    }

