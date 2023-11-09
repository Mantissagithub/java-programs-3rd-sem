//pgm41

//variable as final

class Honda {
    final int a = 100;

    public void mykey1() {
        System.out.println(a);
    }
}

class Bike extends Honda {
    int b = 200;

    public void mykey1() {
        System.out.println(b);
    }
}

class pgm41 {
    public static void main(String args[]) {
        Bike o = new Bike();
        o.a = 120;
        o.b = 220;
        o.mykey1();
    }

}