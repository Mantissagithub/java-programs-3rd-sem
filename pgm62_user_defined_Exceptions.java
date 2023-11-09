import java.io.*;

class MyException extends Exception {
    public MyException(String str) {
        super(str);
    }
}

public class pgm62_user_defined_Exceptions {
    public static void main(String args[]) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String str = br.readLine();\

        try {
            int m = Integer.parseInt(str);
            if (m > 0) {
                throw new MyException("Mark is positive");
            } else {
                throw new MyException("Mark is negative");
            }
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
