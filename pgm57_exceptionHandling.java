
//demostration of exception Handling
import java.util.*;

public class pgm57_exceptionHandling {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a, b;

        try {
            a = in.nextInt();
            b = in.nextInt();
            int result = a / b;
            System.out.println(result);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception caught");
            e.printStackTrace();
        }
        System.out.println("rest of the code.......");
   
    }
}