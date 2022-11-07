package gp.project.nodes;

import gp.project.enums.NodeType;

public class IdNode extends Node {
    public String name;

    public IdNode(String name, int depth) {
        super(NodeType.ID, depth);
        this.name = name;
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
