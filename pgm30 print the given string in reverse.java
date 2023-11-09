// pgm30
//print the given string in reverse

import java.util.*;

public class pgm30 {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        String s1;
        s1 = in.next();
        char[] a = s1.toCharArray();
        //String rev=""
        for (int i = a.length; i > 0; i--) {
            /*for(i=s1.lenght()-1;i>=0;i--)
                {
                    rev=rev+s1.charAt(i);
                }*/
            System.out.print(a[i - 1]);
        }

    }

}