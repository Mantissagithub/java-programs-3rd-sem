
//read file content
import java.io.*;

public class pgm61 {
    public static void main(String args[]) throws IOException
    { 
    int ch;
    FileInputStream fin= new FileInputStream("/Users/navam/OneDrive - vit.ac.in/VIT COURSE PAGE MATERIAL sem 3/JAVA programming/Prog/SEM3 embedded/src/hi.txt");
    while ((ch=fin.read())!=-1)
    System.out.print((char)ch);
    fin.close();
}
}
