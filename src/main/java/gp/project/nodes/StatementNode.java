package gp.project.nodes;

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
}
