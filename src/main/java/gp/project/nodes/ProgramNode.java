package gp.project.nodes;

import gp.project.Serialize;
import gp.project.Tree;
import gp.project.enums.NodeType;

import java.util.List;

public class ProgramNode extends Node {

    public ProgramNode(Tree tree) {
        super(tree, NodeType.PROGRAM, 0, 0);
    }

    public ProgramNode(Tree tree, Node another) {
        super(tree, another);
    }

    public int run(List<Integer> input) {
        // TODO (in the future)

        return input.get(input.size() - 1);
    }

    public void grow() {
        int growFurther = Tree.rd.nextInt(2);
        StatementNode stNode = addStatementChild();
        stNode.grow();
        if (growFurther == 1)
            grow();
    }

    public void mutate() {
        int rand = Tree.rd.nextInt(tree.nodesCount);
        Node nodeToMutate = getNodeByNumber(rand);
        if(nodeToMutate.type == NodeType.PROGRAM){
            clearChildren();
            grow();
            return;
        }

        nodeToMutate.mutate();
    }

    public void crossover(Node node) {
        int rand = Tree.rd.nextInt(tree.nodesCount - 1) + 1;
        crossoverFurther(node, rand);
    }

    @Override
    public void serialize(Serialize serialization){
        serialization.addToBuffer("(");
        for (var x: children) {
            x.serialize(serialization);
        }
        serialization.addToBuffer(")");
        serialization.addToBuffer(System.lineSeparator());
    }
}
