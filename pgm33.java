
//pgm33
//
import java.util.Scanner;

class Emp {
    String empname;
    int empid;
    int empsal;
    int empbon;

    Emp(String empname, int empid, int empsal, int empbon) {
        this.empname = empname;
        this.empid = empid;
        this.empsal = empsal;
        this.empbon = empbon;
    }

    public String getName() {
        return empname;
    }

    public int getId() {
        return empid;
    }

    public int getSal() {
        return empsal;
    }

    public int getBon() {
        return empbon;
    }
}

public class pgm33 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee ID: ");
        int id = scanner.nextInt();

        System.out.print("Enter employee salary: ");
        int sal = scanner.nextInt();

        System.out.print("Enter employee bonus: ");
        int bon = scanner.nextInt();

        // Create an Emp object with user input values
        Emp e = new Emp(name, id, sal, bon);

        // Retrieve information using getter methods
        String empName = e.getName();
        int empId = e.getId();
        int empSal = e.getSal();
        int empBon = e.getBon();

        // Print the retrieved information
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Salary: " + empSal);
        System.out.println("Employee Bonus: " + empBon);

        scanner.close();
    }
}
