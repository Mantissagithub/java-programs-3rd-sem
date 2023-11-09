//demostration of throw

public class pgm60_throw {
    public static void checkNum(int num) {
        if (num < 0) {
            throw new ArithmeticException("num is -ve");
        } else {
            System.out.println((num * num));
        }
    }
    public static void main(String args[]){
        pgm60_throw o=new pgm60_throw();
        o.checkNum(0);
        System.out.println("Rest of the code.....");
    }

}

