package gp.project;

import gp.project.nodes.Node;

import java.io.*;

public class Serialize {

    public FileWriter writer;

    Serialize(String fileName){
        try {
            File file = new File(fileName);
            writer =  new FileWriter(file, true);
        }
         catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addToBuffer(String s){
        try {
            writer.write(s);
            writer.flush();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }


}
