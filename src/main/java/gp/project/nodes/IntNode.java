package gp.project.nodes;

import gp.project.Serialize;
import gp.project.enums.NodeType;
import java.util.Random;

public class IntNode extends Node {
    public int value;

    public IntNode(int value, int depth) {
        super(NodeType.INT, depth);
        this.value = value;
    }

    @Override
    public void mutate() {

    }

    @Override
    public void crossover(Node node) {

        }
    @Override
    public void serialize(Serialize serialization){
        serialization.addToBuffer(Integer.toString(value));
        for (var x: children) {
            x.serialize(serialization);
        }
    }
}

