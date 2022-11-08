package gp.project.nodes;

import gp.project.Tree;
import gp.project.enums.NodeType;
import java.util.Optional;

public class ExpressionNode extends Node {
    public ExpressionNode(Tree tree, NodeType type, int depth, int number) {
        super(tree, type, depth, number);
    }

    public ExpressionNode(Tree tree, Node another) {
        super(tree, another);
    }

    public void grow(int maxDepth) {
        int rand = Tree.rd.nextInt(2);
        boolean growFurther = this.children.isEmpty() && this.type != NodeType.NOT;
        if (this.depth >= maxDepth - 1) {
            rand = 0;
        }

        if (rand == 0) {
            this.addFactorChild();
        } else {
            ExpressionNode expNode = this.addExpressionChild();
            expNode.grow(maxDepth);
        }

        if (growFurther) {
            this.grow(maxDepth);
        }

    }

    public void mutate() {
    }

    public Optional<Node> crossover(Node node, int nodeNumber) {
        return Optional.empty();
    }
}
