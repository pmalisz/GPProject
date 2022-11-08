package gp.project.nodes;

import gp.project.Serialize;
import gp.project.Tree;
import gp.project.enums.NodeType;

import java.util.List;
import java.util.Optional;

public class ProgramNode extends Node {

    public ProgramNode(Tree tree) {
        super(tree, NodeType.PROGRAM, 0, 0);
    }

    public ProgramNode(Tree tree, Node another) {
        super(tree, another);
    }

    public double run(List<Double> input) {
        // TODO (in the future)

        return input.get(input.size() - 1);
    }

    public void grow(int maxDepth) {
        int growFurther = Tree.rd.nextInt(2);
        StatementNode stNode = addStatementChild(maxDepth);
        stNode.grow(maxDepth);
        if (growFurther == 1)
            grow(maxDepth);
    }

    public void mutate() {
        // TODO
    }

    public Optional<Node> crossover(Node node) {
        int rand = Tree.rd.nextInt(tree.nodesCount);

        // TODO
        return Optional.empty();
    }

    @Override
    public void serialize(Serialize serialization){//handle exception
        serialization.addToBuffer("<");
        for (var x: children) {
            x.serialize(serialization);
        }
        serialization.addToBuffer(">");
    }
}
