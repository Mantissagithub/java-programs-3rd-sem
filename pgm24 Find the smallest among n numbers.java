// pgm24
// Find the smallest among n numbers

import java.util.*;

public class pgm24 {
    public static void main(String args[]) {

        int i, n;
        try (Scanner in = new Scanner(System.in)) {
            n = in.nextInt();
            int a[] = new int[n];
            for (i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }

            int smallest = a[0]; // Assume the first element is the smallest

            for (i = 1; i < n; i++) {
                if (a[i] < smallest) {
                    smallest = a[i];
                }
            }

            System.out.println("The smallest number is: " + smallest);
        }
    }
}
