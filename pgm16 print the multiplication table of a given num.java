// pgm16
// print the multiplication table of a given num

import java.util.Scanner;

public class pgm16 {
    public static void main(String args[]) {
        int n, i;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        for (i = 1; i <= 10; i++) {
            System.out.println(i + " x " + n + " = " + (n * i));
        }
    }
}
