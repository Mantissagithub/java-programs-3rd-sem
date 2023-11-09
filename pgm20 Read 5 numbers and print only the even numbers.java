//pgm20
//Read 5 numbers and print only the even numbers

import java.util.*;

public class pgm20 {
    public static void main(String args[]) {
        int a[] = new int[5];
        int i;
        Scanner in = new Scanner(System.in);

        for (i = 0; i < 5; i++) {
            a[i] = in.nextInt();
        }

        for (i = 0; i < 5; i++) {
            if (a[i] % 2 == 0) // only even num
            {
                System.out.println(a[i]);
            }

        }
    }
}
