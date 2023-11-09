//pgm21
//Read 5 numbers and print it in reverse

import java.util.*;

public class pgm21 {
    public static void main(String args[]) {
        int a[] = new int[5];
        int i;
        Scanner in = new Scanner(System.in);

        for (i = 0; i < 5; i++) {
            a[i] = in.nextInt();
        }

        for (i = 4; i >= 0; i--) {
            System.out.print(a[i]);
        }
    }
}
