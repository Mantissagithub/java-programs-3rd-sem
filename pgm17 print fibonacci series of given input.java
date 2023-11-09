// pgm17
// print fibonacci series of given input

import java.util.Scanner;

public class pgm17 {
    public static void main(String args[]) {
        int n, i, a = 0, b = 1, temp;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        System.out.println(a);
        System.out.println(b);
        for (i = 0; i <= n; i++) {
            temp = a + b;
            a = b;
            b = temp;

            System.out.println(temp);
        }

    }
}
