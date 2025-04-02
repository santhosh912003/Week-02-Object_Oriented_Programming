import java.util.Scanner;

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter roll number: ");
        int rollNumber = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter CGPA: ");
        double CGPA = sc.nextDouble();
        sc.nextLine();

        System.out.println("Enter research topic for postgraduate student: ");
        String researchTopic = sc.nextLine();

        PostgraduateStudent pgStudent = new PostgraduateStudent(rollNumber, name, CGPA, researchTopic);
        
        System.out.println("\nBefore CGPA Update:");
        pgStudent.displayPostgraduateDetails();

        System.out.println("\nEnter new CGPA: ");
        double newCGPA = sc.nextDouble();
        pgStudent.setCGPA(newCGPA);

        System.out.println("\nAfter CGPA Update:");
        pgStudent.displayPostgraduateDetails();
        sc.close();
    }
}

class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}
class PostgraduateStudent extends Student {
    private String researchTopic;

    public PostgraduateStudent(int rollNumber, String name, double CGPA, String researchTopic) {
        super(rollNumber, name, CGPA);
        this.researchTopic = researchTopic;
    }

    public void displayPostgraduateDetails() {
        System.out.println("Postgraduate Student Details:");
        displayDetails();
        System.out.println("Research Topic: " + researchTopic);
    }
}
