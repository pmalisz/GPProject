package gp.project;

import java.io.*;

public class Serialize {

    public FileWriter writer;
    public StringBuffer string = new StringBuffer();

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

    public void addToBuffers(String s){
        try {
            writer.write(s);
            writer.flush();
            string.append(s);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
