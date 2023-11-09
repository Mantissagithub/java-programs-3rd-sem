//single inheritance example
class bank {
    private String name;
    private double bal;

    public bank(String name, double bal) {
        this.name = name;
        this.bal = bal;
    }

    public void det() {
        System.out.print(name);
    }

    public void dep(double amt) {
        bal += amt;
    }

    public void withd(double amt) {
        if (bal >= amt) {
            bal -= amt;
        } else {
            System.out.println("Insufficient amout");
        }

    }

    public double bala() {
        return bal;
    }
}

class sav extends bank {
    public sav(String name, double bal) {
        super(name, bal);
    }

    public void withd(double amt) {
        if ((bala() - amt) < 100) {
            System.out.println("\n" + "maintain min bal $100");
        } else {
            super.withd(amt);
        }

    }

}

public class pgm50 {
    public static void main(String[] args) {
        sav o = new sav("NAVU", 100);
        o.det();
        o.dep(50);
        System.out.println("\n" + o.bala());
        o.withd(10);
        System.out.println(o.bala());
    }

}