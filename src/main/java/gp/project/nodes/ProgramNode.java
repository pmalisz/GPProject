package gp.project.nodes;

import gp.project.enums.NodeType;

import java.util.List;

public class ProgramNode extends Node {

    public ProgramNode() {
        super(NodeType.PROGRAM, 0);
    }

    public double run(List<Double> input) {
        // TODO run program and return output (for the future)

        return input.get(input.size() - 1);
    }

    @Override
    public int grow() {
        // TODO

        return -1;
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
