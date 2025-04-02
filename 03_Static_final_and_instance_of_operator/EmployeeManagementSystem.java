public class EmployeeManagementSystem{

  public static void main(String[] args){
    
    employee obj1 = new employee("rajesh",2134,"developer");
    employee obj2 = new employee("sanjay",213443,"mobile eveloper");
    
    employee.displayTotalEmployees();
    obj1.display();
    
    obj2.display();
    
    
    
  }  
}

class employee {
    private static String companyName = "Tech Corp";
    private static int totalEmployees = 0;

    private final int id;
    private String name;
    private String designation;

    public employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total employees in " + companyName + ": " + totalEmployees);
    }

    public void display() {
        if (this instanceof employee) {
            System.out.println("Company: " + companyName);
            System.out.println("Employee Name: " + this.name);
            System.out.println("Employee ID: " + this.id);
            System.out.println("Designation: " + this.designation);
        }
    }
}
