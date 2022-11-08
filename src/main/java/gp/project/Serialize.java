package gp.project;

import gp.project.nodes.Node;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Serialize {

    public Node root;
    public BufferedWriter writer;

    Serialize(Node root, String fileName) throws IOException {
        try {
            this.root = root;
            writer = new BufferedWriter(new FileWriter(fileName));
        }
         catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void serialize(Node root) throws IOException {
        writer.append("<");
        //root.serialize()
    }
}
