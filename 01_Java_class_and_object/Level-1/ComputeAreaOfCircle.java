class ComputeAreaOfCircle{
  public static void main(String[] args){
    
    Circle obj1 = new Circle(5.9);
    obj1.circumference();
    obj1.area();
  }
}

class Circle{
  double radius;
  
  
  public Circle(double radius){
    this.radius= radius;
  }
  
  
  
  void circumference(){
    double cir = 2 * 3.14 * this.radius;
    System.out.printf("The circumference of the circle of the radius %.2f is %.2f",this.radius ,cir);
    System.out.println();
  }
  void area(){
    double area = 3.14 * this.radius* this.radius;
    System.out.printf("The area of the circle of the radius %.2f is %.2f",this.radius,area);
    System.out.println();
  }
}