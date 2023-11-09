//pgm43

//example of abstract

abstract class Animal {
    public abstract void sound();
}

class Lion extends Animal {
    public void sound() {
        System.out.println("lion roar");
    }

}

class Tiger extends Animal {
    public void sound() {
        System.out.println("tiger roar");
    }

}

public class pgm43 {
    public static void main(String args[]) {
        Animal o1 = new Tiger();
        o1.sound();
        Animal o2 = new Lion();
        o2.sound();
    }
}