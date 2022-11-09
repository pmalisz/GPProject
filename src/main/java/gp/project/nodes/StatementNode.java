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
    }

    public Optional<Node> crossover(Node node, int nodeNumber) {
        return Optional.empty();
    }

    public void serialize(Serialize serialization){
        switch(this.type) {
            case IN:
//                children.get(0).serialize(serialization);
//                serialization.addToBuffer(" in ");
//                children.get(1).serialize(serialization);

            case OUT:

//                children.get(0).serialize(serialization);
//                serialization.addToBuffer(" out ");
//                children.get(1).serialize(serialization);
            case IF:
                serialization.addToBuffer(" if( ");
                for (var x : children) {
                    x.serialize(serialization);
                }
                serialization.addToBuffer(") ");
            case WHILE:
                serialization.addToBuffer(" while( ");
                for (var x : children) {
                    x.serialize(serialization);
                }
                serialization.addToBuffer(") ");
            case ASSIGN:
//                children.get(0).serialize(serialization);
//                serialization.addToBuffer(" = ");
//                children.get(1).serialize(serialization);
        }
    }
}
