//final keyword in method

class my {
    final void mykey() {
        System.out.println("we hi");
    }
}

class pgm39 extends my {
    @Override
    void mykey() { // Attempting to override a final method, which will result in a compilation error
        System.out.println("Overridden method in pgm39");
    }

    public static void main(String args[]) {
        my o = new my();
        o.mykey();
    }
}
