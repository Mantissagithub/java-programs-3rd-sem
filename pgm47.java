// demonstration of single inheritance

class A {
    int a, b;

    void display() {
        System.out.println("class A =" + (a + b));
    }

}

class B extends A {
    int c;

    void show() {
        System.out.println("class B =" + c);
    }
}

class pgm47 {
    public static void main(String args[]) {
        B obj = new B();
        obj.a = 10;
        obj.b = 20;
        obj.c = 30;
        obj.display();
        obj.show();
    }

}
