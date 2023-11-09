//demostration file writer

import java.io.*;

public class pgm63 {
    public static void main(String args[]) throws IOException{
        String content="welcome";
        try{
            FileWriter f=new FileWriter("output1.txt");
            f.write(content);
            f.close();
        }catch (IOException e) {
            System.out.println("error");
            e.printStackTrace();
          }
    }
}
