//write 
import java.io.*;

public class pgm64{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=BufferedReader(isr);
        String content=br.readLine();
        try{
            FileWriter f=new FileWriter("output1.txt");
            f.write(content);
            f.close();
        }catch (IOException e) {
            System.out.println("error");
            e.printStackTrace();
          }
    }

    private static BufferedReader BufferedReader(InputStreamReader isr) {
        return null;
    }
}
