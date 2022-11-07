package gp.project.nodes;

import gp.project.enums.NodeType;

import java.util.List;

public class IntNode extends Node {
    public int value;

    public IntNode(int value, int depth) {
        super(NodeType.INT, depth);
        this.value = value;
    }

    @Override
    public void mutate() {
        // TODO
    }

    @Override
    public void crossover(Node node) {
        // TODO
    }
}
