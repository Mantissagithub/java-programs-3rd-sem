//demostration of throws

public class pgm61_throws {
    public static int divide(int n, int m) throws ArithmeticException {
        int div = n / m;
        return div;
    }

    public static void main(String args[]) {
        pgm61_throws o = new pgm61_throws();
        try {
            System.out.println(o.divide(100, 0));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("\nNubmer cant be divided with 0");
        }

        System.out.println("Rest of the code.....");
    }

}
