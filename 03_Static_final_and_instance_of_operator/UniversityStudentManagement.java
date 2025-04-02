import java.util.*;

public class UniversityStudentManagement {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 101, "A");
        Student s2 = new Student("Bob", 102, "B");

        if (s1 instanceof Student) s1.displayStudentDetails();
        if (s2 instanceof Student) s2.displayStudentDetails();

        Student.displayTotalStudents();
    }
}

class Student {
    private static String universityName = "Global University";
    private static int totalStudents = 0;
    private final int rollNumber;
    private String name;
    private String grade;

    public Student(String name, int rollNumber, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    public void displayStudentDetails() {
        System.out.println("University: " + universityName + ", Roll Number: " + rollNumber + 
                ", Name: " + name + ", Grade: " + grade);
    }
}
