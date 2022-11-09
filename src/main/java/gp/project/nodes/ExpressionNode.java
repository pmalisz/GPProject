package gp.project.nodes;

import gp.project.Serialize;
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
        boolean growFurther = children.isEmpty() && type != NodeType.NOT;
        if (depth >= maxDepth - 1) {
            rand = 0;
        }

        if (rand == 0) {
            addFactorChild();
        } else {
            ExpressionNode expNode = addExpressionChild();
            expNode.grow(maxDepth);
        }

        if (growFurther) {
            grow(maxDepth);
        }
    }

    public void mutate()
    {
        NodeType newExpressionNode = NodeType.getRandomExpression();
        // TODO:
    }

    public Optional<Node> crossover(Node node, int nodeNumber)
    {
        return Optional.empty();
        // TODO:
    }


    public void serialize(Serialize serialization) {
        serialization.addToBuffer("(");
        if (children.size() == 1) {
            serialization.addToBuffer(this.type.toString());
            children.get(0).serialize(serialization);
        }
        else{
            children.get(0).serialize(serialization);
            serialization.addToBuffer(this.type.toString());
            children.get(1).serialize(serialization);
            }
        serialization.addToBuffer(")");
        }
    }
