
//demonstratiion of try and catch
import java.util.*;

public class pgm58_try_and_catch{
    public static void main(String args[]) {
        String a[] = new String[4];
        Scanner in = new Scanner(System.in);
        try {
            for (int i = 0; i < 4; i++) {
                a[i] = in.next();
            }
            System.out.println("printing 5 names");
            for (int i = 0; i <= a.length; i++) {
                System.out.println(a[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("exception caugth:accessing 5th");
        }
        System.out.println("rest of the code...............................");
    }
}
