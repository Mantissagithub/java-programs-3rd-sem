// pgm23
//Biggest among 10 numbers

import java.util.*;

public class pgm23 {
    public static void main(String args[]) {
        int a[] = new int[10]; // Corrected array size to 10
        int i;

        try (Scanner in = new Scanner(System.in)) {
            for (i = 0; i < 10; i++) {
                a[i] = in.nextInt();
            }
        }

        int largest = a[0]; // Initialize with the first element
        for (i = 1; i < 10; i++) { // Start the loop from index 1
            if (a[i] > largest) { // Compare with largest
                largest = a[i]; // Update largest
            }
        }
        System.out.println("The largest number is: " + largest);
    }
}
