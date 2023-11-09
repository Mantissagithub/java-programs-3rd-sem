//demonstration of try_catch_and_finally

import java.util.*;

public class pgm59_try_catch_and_finally {
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        String ptr = null;
        try {
            if (ptr.equals("scope")) {
                System.out.println("equal");
            } else {
                System.out.println("Not equal");
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("NullPointerException caught");
        } finally {
            System.out.println("Success");
        }
    }
}
