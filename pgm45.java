
//demonstration of static keyword

public class pgm45 {
    static int x = 10; //variable

    static int y;

    public static class DemoInnerClass { //method or function
        static int z = 10;
    }

    static {   //static initialization block
        System.out.println("static block initialized");
        y = x + 4;
    }

    public static void main(String args[]) {
        System.out.println(x);
        System.out.println(y);
        System.out.println(DemoInnerClass.z);

    }
}