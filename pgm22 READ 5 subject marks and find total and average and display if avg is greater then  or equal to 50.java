
// pgm22
// READ 5 subject marks and find total and average and display if avg is greater then  or equal to 50
import java.util.*;

public class pgm22 {
    public static void main(String args[]) {
        int a[] = new int[5];
        int i, total = 0, avg;
        try (Scanner in = new Scanner(System.in)) {
            for (i = 0; i < 5; i++) {
                a[i] = in.nextInt();
            }
        }

        for (i = 0; i < 5; i++) {
            total += a[i];
        }
        avg = total / 5;

        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);

        if (avg >= 50) {
            System.out.println("Average is greater than or equal to 50");
        } else {
            System.out.println("Average is less than 50");
        }

    }
}
