package gp.project;

import gp.project.enums.NodeType;
import gp.project.nodes.*;

import java.io.*;

public class Deserialize {

    public BufferedReader reader;

    Deserialize(String fileName) {
        try {
            FileReader file = new FileReader(fileName);
            reader = new BufferedReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public char readCharFromFile() {
        try {
            return (char) reader.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public StringNode readProgram() {
        try {
            return spilt_tree(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public StringNode spilt_tree(String program){
        return splitToNodes(program,1).node;
    }

    Pair splitToNodes(String program, int start) {
        var node = new StringNode("");
        while(start < program.length()){
            if ('(' == program.charAt(start)) {
                Pair pair = splitToNodes(program, start + 1);
                node.list.add(pair.node);
                start = pair.position;
            }
            else if (')' == program.charAt(start)) {
                return new Pair(start + 1, node);
            }
            else{
                for(int i = start ; i < program.length(); i++){
                    if(program.charAt(i) == ')' || program.charAt(i) == '('){
                        node.value = program.substring(start, i);
                        start = i;
                        break;
                    }
                }
            }
        }
        return null;
    }

    public Node traversePreOrder(StringNode root_string, Node root, Tree tree) {
        for (var node_: root_string.list) {
            var child = checkType(node_,tree);

            traversePreOrder(node_,root,tree);
        }
    }

    private Node checkType(StringNode node, Tree tree) {
        Node actual = new Node();
        switch (node.value) {
            case ("in"):
                actual = new StatementNode(tree, NodeType.IN);
                break;
            case ("out"):
                actual = new StatementNode(tree, NodeType.OUT);
                return  actual;
            case ("if"):
                actual = new StatementNode(tree, NodeType.IF);
                return  actual;
            case ("while"):
                actual = new StatementNode(tree, NodeType.WHILE);
                return  actual;

            case ("="):
                actual = new StatementNode(tree, NodeType.ASSIGN);
                return  actual;

            case ("+"):
                actual = new ExpressionNode(tree, NodeType.IN);
                return  actual;

            case ("-"):
                actual = new ExpressionNode(tree, NodeType.MINUS);
                return  actual;

            case ("/"):
                actual = new ExpressionNode(tree, NodeType.DIV);
                return  actual;
            case ("*"):
                actual = new ExpressionNode(tree, NodeType.TIMES);
                return  actual;

            case (">"):
                actual = new ExpressionNode(tree, NodeType.GREATER);
                return  actual;

            case ("<"):
                actual = new ExpressionNode(tree, NodeType.LESS);
                return  actual;

            case ("&&"):
                actual = new ExpressionNode(tree, NodeType.AND);
                return  actual;

            case ("||"):
                actual = new ExpressionNode(tree, NodeType.OR);
                return  actual;

            case ("!"):
                actual = new ExpressionNode(tree, NodeType.NOT);
                return  actual;

            case ("=="):
                actual = new ExpressionNode(tree, NodeType.EQUAL);
                return  actual;

            case ("!="):
                actual = new ExpressionNode(tree, NodeType.NOT_EQUAL);
                return  actual;

            case ("-?(0|[1-9]\\d*)"):
                int number = Integer.parseInt(node.value);
                actual = new FactorNode(tree, NodeType.INT,number);
                return  actual;

            default:
                actual = new FactorNode(tree, NodeType.ID, node.value);
                return  actual;
        }
        return  null;
    }

    public Tree makeTree(StringNode root) {
        var tree = new Tree();
        var programRoot = new ProgramNode(tree);
        var node = traversePreOrder(root,programRoot, tree);
        return tree;
    }


    static class Pair{
        public int position;
        public StringNode node;

        public Pair(int position, StringNode node) {
            this.position = position;
            this.node = node;
        }
    }
}

