// demonstration of single inheritance overriding
class Animal {
    void sound() {
        System.out.println("animals");
    }

}

class Cat extends Animal {
    void sound() {
        System.out.println("meow1");
    }

    void sound1() {
        System.out.println("meow2");
    }
}

public class pgm48 {
    public static void main(String[] args) {
        Cat o = new Cat();
        o.sound();
        o.sound1();

    }

}
