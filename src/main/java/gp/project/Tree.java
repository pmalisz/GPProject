package gp.project;

import gp.project.nodes.ProgramNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tree {
    public static Random rd = new Random();
    public static List<Integer> numbers = new ArrayList<>();
    public List<String> variables = new ArrayList<>();
    public ProgramNode root = new ProgramNode(this);
    public int nodesCount = 1;

    public static void setSeed(long seed) {
        rd.setSeed(seed);
    }

    public static void addRandomNumber(int min, int max) {
        numbers.add(rd.nextInt(max - min + 1) + min);
    }

    public Tree() {
    }

    public Tree copy() {
        Tree copy = new Tree();
        copy.root = new ProgramNode(copy, root);
        return copy;
    }

    public void grow(int maxDepth) {
        root.grow(maxDepth);
    }

    public double run(List<Double> inputs) {
        return root.run(inputs);
    }

    public void crossover(Tree tree) {
        root.crossover(tree.root);
    }

    public void mutate() {
        root.mutate();
    }

    public void print() {
        root.print();
    }

    public void addVariables(String variable) {
        variables.add(variable);
    }

    public String getRandomVariable() {
        int varIdx = rd.nextInt(variables.size() + 1);
        if (varIdx == variables.size()) {
            addVariables("v" + varIdx);
        }

        return variables.get(varIdx);
    }
}
