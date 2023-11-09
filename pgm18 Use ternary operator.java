//pgm18
//Use ternary operator

import java.util.Scanner;

public class pgm18 {
    public static void main(String args[]) {
        int a, b, c;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        c = a < b ? a : b; // if a is small then a or b

        System.out.println(c);
    }
}
