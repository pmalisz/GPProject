package gp.project;

import gp.project.nodes.Node;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Serialize {


    public BufferedWriter writer;

    Serialize(String fileName){
        try {
            writer = new BufferedWriter(new FileWriter(fileName));
        }
         catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addToBuffer(char c){
        try {
            writer.append(c);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

}
