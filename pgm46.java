///demonstration of array of objects

class Student {
    String name;
    int Rollno;

    Student(String name, int Rollno) {
        this.name = name;
        this.Rollno = Rollno;

    }
}

class pgm46 {
    public static void main(String args[]) {
        Student[] st = new Student[3];

        st[0] = new Student("n1", 3);
        st[1] = new Student("n2", 4);
        st[2] = new Student("n3", 5);

        for (int i = 0; i < st.length; i++) {
            System.out.println("Name:" + st[i].name + "\t" + "Rollno:" + st[i].Rollno);
        }

    }
}