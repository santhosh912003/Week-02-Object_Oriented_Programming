import java.util.*;

class Q2{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the course name: ");
    String cname = sc.nextLine();
    System.out.println("Enter the course duration: ");
    String duration = sc.nextLine();
    System.out.println("Enter the course fee: ");
    double fee = sc.nextDouble();
    sc.nextLine();
    System.out.println("Enter the Intitution name: ");
    String Iname = sc.nextLine();

    
    
    
    Course obj = new Course(cname,duration, fee);
    obj.displayCourseDetails();
    obj.updateInstituteName(Iname);
    obj.displayCourseDetails();
   
    
  }
}

class Course {
    private String courseName;
    private String duration;
    private double fee;
    private static String instituteName = "SRM Tech Institute";

    public Course(String courseName, String duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " months, Fee: $" + fee);
        System.out.println("Institute: " + instituteName);
    }

    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }
}

