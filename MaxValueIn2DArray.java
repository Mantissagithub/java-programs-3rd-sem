import java.util.*;

public class MaxValueIn2DArray {

    public static void main(String[] args) {
        // Create a scanner to read the 2D arrays from the user
        Scanner scanner = new Scanner(System.in);

        // Declare the 2D arrays
        int[][] array1 = new int[3][3];
        int[][] array2 = new int[3][3];

        // Prompt the user to enter the elements of array1
        System.out.println("Enter the elements of array1: ");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[0].length; j++) {
                array1[i][j] = scanner.nextInt();
            }
        }

        // Prompt the user to enter the elements of array2
        System.out.println("Enter the elements of array2: ");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[0].length; j++) {
                array2[i][j] = scanner.nextInt();
            }
        }

        // Get the maximum value from each row in array1
        int[] maxValueInArray1 = new int[array1.length];
        for (int i = 0; i < maxValueInArray1.length; i++) {
            maxValueInArray1[i] = getMaxValueInRow(array1, i);
        }

        // Get the maximum value from each row in array2
        int[] maxValueInArray2 = new int[array2.length];
        for (int i = 0; i < maxValueInArray2.length; i++) {
            maxValueInArray2[i] = getMaxValueInRow(array2, i);
        }

        // Compare the maximum values of array1 and array2
        int maxValue = 0;
        for (int i = 0; i < maxValueInArray1.length; i++) {
            if (maxValueInArray1[i] > maxValue) {
                maxValue = maxValueInArray1[i];
            }
        }
        for (int i = 0; i < maxValueInArray2.length; i++) {
            if (maxValueInArray2[i] > maxValue) {
                maxValue = maxValueInArray2[i];
            }
        }

        // Print the maximum values
        System.out.println("The maximum value in array1 is: " + maxValueInArray1[0]);
        System.out.println("The maximum value in array2 is: " + maxValueInArray2[0]);
        System.out.println("The maximum value after comparing array1 and array2 is: " + maxValue);
    }

    private static int getMaxValueInRow(int[][] array, int row) {
        int maxValue = array[row][0];
        for (int i = 1; i < array[0].length; i++) {
            if (array[row][i] > maxValue) {
                maxValue = array[row][i];
            }
        }
        return maxValue;
    }
}
