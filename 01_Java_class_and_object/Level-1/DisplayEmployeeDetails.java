class DisplayEmployeeDetails{
  public static void main(String[] args){
    
    Employee obj1 = new Employee("Rajesh",1,400000);
    Employee obj2 = new Employee("Sanjay",4,24545);
    
    obj1.Display();
    obj2.Display();
  }
}

class Employee{
  
  String name;
  int id;
  int salary;
  
  
  public Employee(String name, int id, int salary){
    this.name = name;
    this.id = id;
    this.salary = salary;
  }
  
  
  void Display(){
    System.out.printf("The name of the Employee is  %s and his id is %d  and his salary is %s",this.name, this.id, this.salary);
    System.out.println();
  }
}