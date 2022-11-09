package gp.project;

import java.io.*;
import java.util.ArrayList;

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

    public void readProgram() {
        try {
            var new_ = spilt_tree(reader.readLine());
            System.out.print(new_);
        } catch (IOException e) {
            e.printStackTrace();
        }

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
            if (')' == program.charAt(start)) {
                return new Pair(start + 1,node);
            }
            else{
                for(int i = start ; i < program.length(); i++){
                    if(program.charAt(i) == ')' || program.charAt(i) == '('){
                        node.value = program.substring(start, i);
                    }
                }
            }
        }
        return null;
    }
    class Pair{
        public int position;
        public StringNode node;

        public Pair(int position, StringNode node) {
            this.position = position;
            this.node = node;
        }
    }
}

