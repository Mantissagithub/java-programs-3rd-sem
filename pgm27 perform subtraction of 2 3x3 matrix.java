//pgm27
//perform subtraction of 2 3x3 matrix

import java.util.*;

public class pgm27 {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int c[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("a" + "[" + i + "]" + "[" + j + "]" + "=");
                a[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("b" + "[" + i + "]" + "[" + j + "]" + "=");
                b[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] - b[i][j];
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(c[i][j] + "\t");
            }
            System.out.println();
        }

    }

}