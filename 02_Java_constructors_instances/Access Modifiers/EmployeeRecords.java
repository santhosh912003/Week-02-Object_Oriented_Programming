import java.util.Scanner;

public class EmployeeRecords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee ID: ");
        int employeeID = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Department: ");
        String department = sc.nextLine();

        System.out.println("Enter Initial Salary: ");
        double salary = sc.nextDouble();

        Manager manager = new Manager(employeeID, department, salary);

        System.out.println("\nEmployee ID: " + manager.employeeID);
        System.out.println("Department: " + manager.department);
        System.out.println("Salary: $" + manager.getSalary());

        System.out.println("\nEnter New Salary: ");
        double newSalary = sc.nextDouble();
        manager.setSalary(newSalary);

        System.out.println("\nUpdated Salary: $" + manager.getSalary());

        sc.close();
    }
}

class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
class Manager extends Employee {
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }
}

