public class EmployeeDetails {
    public static void main(String[] args) {
        
        Manager mgr = new Manager("Alice", 101, 90000, 5);
        mgr.display();

        Developer dev = new Developer("Bob", 102, 75000, "Java");
        dev.display();

        Intern intern = new Intern("Charlie", 103, 20000, "Machine Learning");
        intern.display();
    }
}

class Employee {
    String name;
    int id;
    int salary;

    public Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
}

class Manager extends Employee {
    int teamSize;

    public Manager(String name, int id, int salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize; // Fixed missing semicolon
    }

    void display() {
        System.out.println("This is the manager with team size: " + this.teamSize);
    }
}

class Developer extends Employee {
    String programming;

    public Developer(String name, int id, int salary, String lang) {
        super(name, id, salary);
        this.programming = lang;
    }

    void display() {
        System.out.println("This is the developer with programming language: " + this.programming);
    }
}

class Intern extends Employee {
    String domain;

    public Intern(String name, int id, int salary, String domain) {
        super(name, id, salary);
        this.domain = domain;
    }

    void display() {
        System.out.println("This is the intern with the domain: " + this.domain);
    }
}
