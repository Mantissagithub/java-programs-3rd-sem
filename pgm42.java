// pgm42
// demonstrtion of abstract class and abstrct method

abstract class Bike {
    abstract void run();
}

class Honda extends Bike {
    void run() {
        System.out.println("running");
    }
}

class pgm42 {
    public static void main(String args[]) {
        Bike o = new Honda();
        o.run();
    }
}