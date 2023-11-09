//pgm19
// using 3 ternary operator

import java.util.Scanner;

public class pgm19 {
    public static void main(String args[]) {
        int a, b, c, d, e;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        d = a < b ? a : b; // or in single statement
        e = d < c ? d : c; // d =(a<b)?(a<c?a:c):(b<c?b:c);

        System.out.println(e);

    }
}
