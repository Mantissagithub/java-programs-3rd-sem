//demonstration of private access modifier

class access {
    private int data = 40;

    private void msg() {
        System.out.println("Hello world");
    }
}

public class pgm35 {
    public static void main(String args[]) {
        A obj = new A();
        System.out.println(obj.data);
        obj.msg();
    }

}
