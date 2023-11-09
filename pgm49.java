//multilevel inheritance

// Base class
class A {
    public A() {
        System.out.println("class elec");
    }

    void elec() {
        System.out.println("Type=electronics");
    }
}

// Subclass of A
class B extends A {
    public B() {
        System.out.println("class grinder");
    }

    void grinder() {
        System.out.println("machine=grinder");
    }
}

// Subclass of B
class C extends B {
    public C() {
        System.out.println("class wet");
    }

    void wet() {
        System.out.println("tech=wetgrinding");
    }
}

public class pgm49 {
    public static void main(String[] args) {
        // Create an object of class C (the most specific subclass)
        C c = new C();
        c.elec();     // Call elec() from class A
        c.grinder();  // Call grinder() from class B
        c.wet();      // Call wet() from class C
    }
}
