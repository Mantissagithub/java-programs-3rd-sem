//pgm40

//method as final

class Honda {
    
    public final void mykey1() {
        System.out.println("honda");
    }
}

class Bike extends Honda {
    public void mykey1() {
        System.out.println("bike");
    }
}

class pgm40 {
    public static void main(String args[]) {
        Bike o = new Bike();
        o.mykey1();
    }

}