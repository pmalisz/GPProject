//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package gp.project.nodes;

import gp.project.Tree;
import gp.project.enums.NodeType;
import java.io.PrintStream;
import java.util.List;
import java.util.Optional;

public class FactorNode extends Node {
    public FactorNode(Tree tree, int value, int depth, int number) {
        super(tree, NodeType.INT, depth, number);
        this.value = value;
    }

    public FactorNode(Tree tree, String name, int depth, int number) {
        super(tree, NodeType.ID, depth, number);
        this.name = name;
    }

    public FactorNode(Tree tree, Node another) {
        super(tree, another);
        switch(another.type) {
            case ID:
                this.name = another.name;
                break;
            case INT:
                this.value = another.value;
        }

    }

    public void mutate() {
        NodeType intOrId = NodeType.getRandomFactor();
        if (intOrId == NodeType.ID) {
            this.type = NodeType.ID;
            this.name = tree.getRandomVariable();
        } else {
            this.type = NodeType.INT;
            this.value = Tree.numbers.get(Tree.rd.nextInt(Tree.numbers.size()));
        }
    }

    public Optional<Node> crossover(Node node, int nodeNumber) {
        if (number != nodeNumber) {
            return Optional.empty();
        } else {
            List<Node> properNodes = node.find(this.getClass());
            if (properNodes.isEmpty()) {
                return Optional.empty();
            } else {
                int rand = Tree.rd.nextInt(properNodes.size());
                return Optional.of(properNodes.get(rand));
            }
        }
    }

    @Override
    public void print() {
        if (type == NodeType.ID)
            System.out.println(getStringToPrint() + name);
        else
            System.out.println(getStringToPrint() + value);
    }
}
