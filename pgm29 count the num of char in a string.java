// pgm29
//count the num of char in a string

import java.util.*;

public class pgm29 {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        String s1;
        s1 = in.next();
        char[] charArray = s1.toCharArray();
        int count = 0;
        for (char c : charArray) {
            count++;
        }
        System.out.println(count);
    }

}   