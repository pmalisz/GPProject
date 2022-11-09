package gp.project;

import java.io.*;

public class Deserialize {

    public BufferedReader reader;

    Deserialize(String fileName){
        try{
            FileReader file = new FileReader(fileName);
            reader = new BufferedReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public char readCharFromFile(){
        try {
            return (char) reader.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public String readProgram(){
        try {
            return reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
