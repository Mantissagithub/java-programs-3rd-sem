import java.io.*;
//reading java file
public class pgm65 {
    public static void main(String args[]) throws IOException{
        int i;
        FileReader fr = new FileReader("pgm64.java");
        while((i=fr.read())!=-1)
        System.out.print((char)i);
        fr.close();
    }
    
}