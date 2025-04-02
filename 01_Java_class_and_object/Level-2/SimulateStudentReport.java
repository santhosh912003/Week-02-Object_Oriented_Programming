import java.util.*;



public class SimulateStudentReport{
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the name of the student: ");
      String name = sc.nextLine();
      System.out.println("Enter his/her roll_no: ");
      int roll = sc.nextInt();
      System.out.println("Enter his 5 subjects  marks one by one ");
      int[] m = new int[5];
      for(int i=0;i<5;i++){
        m[i] = sc.nextInt();
  }
  
  Student obj = new Student(name,roll, m);
  obj.display();
  }
  
}

class Student{
  String name;
  int roll_no;
  int[] marks;
  
  public Student(String name,int roll_no, int[] marks){
    this.name  = name;
    this.roll_no = roll_no;
    this.marks = marks;
    
  }
  
  
  void display(){
    String g = grade(this.marks);
    System.out.printf("The name if the student is %s, his marks are %s and his grade is %s",
    this.name,Arrays.toString(this.marks),g);
    
  }
  
  
  String grade(int[] marks){
    int sum = 0;
    for(int num : marks){
      sum += num;
    }
    
    double percentage  = (double) sum/marks.length;
    
    if(percentage>=90){
      return "Grade A";
    }
    else if(percentage >= 80){
      return "Grade B";
    }
    else if(percentage >= 70){
      return "Grade C";
    }
    else if (percentage >=60){
      return "Grade D" ;
    }
    else{
      return "Grade F";
    }
  
  }
  
  
  
}