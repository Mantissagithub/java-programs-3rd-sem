//pgm31
//count the number of lower,upper,digit,and special in given String

import java.util.*;

public class pgm31 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        char[] a = s1.toCharArray();
        int u = 0, l = 0, d = 0, s = 0;
        for (char c : a) {
            if (c >= '0' && c <= '9') {// 48-57
                d++;
            } else if (c >= 'a' && c <= 'z') {// 97-122
                l++;
            } else if (c >= 'A' && c <= 'Z') {// 65-90
                u++;
            } else {
                s++;
            }
        }
        System.out.println("upper=" + u);
        System.out.println("lower=" + l);
        System.out.println("digit=" + d);
        System.out.println("special=" + s);
    }
}
