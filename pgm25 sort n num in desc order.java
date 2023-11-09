//pgm25
//sort n num in desc order

import java.util.*;

public class pgm25 {
    public static void main(String args[]) {

        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int largest = a[0];
        for (int i = 0; i < n; i++) {

            if (a[i] > largest) {
                largest = a[i];
                b[i] = a[i];

            }

        }

        for (int i = 0; i < n; i++) {
            System.out.println(b[i]);
        }

    }
}