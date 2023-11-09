//read Character 
import java.io.*;
public class pgm62 {
    public static void main(String args[]) throws IOException{
        int i;
        FileReader fr = new FileReader("output.txt");
        while((i=fr.read())!=-1)
        System.out.print((char)i);
        fr.close();
    }
}
