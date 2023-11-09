//read input using sytem.in convert it to primitive data tye and display it
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class pgm60 {
    public static void main(String args[])throws IOException
    {
        InputStreamReader isr= new InputStreamReader(System.in);
        
        BufferedReader br= new BufferedReader(isr);
        String str=br.readLine();

        int a=Integer.parseInt(str);
        String str1=br.readLine();

        float b=float.parseInt(str1);
        String str2=br.readLine();

        float c=float.parseInt(str2);
        String str3=br.readLine();

        char d=char.parseInt(str3);
        String str4=br.readLine();
    }
}
