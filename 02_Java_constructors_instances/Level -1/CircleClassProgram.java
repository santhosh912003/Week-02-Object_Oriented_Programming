import java.util.*;

public class CircleClassProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double radius = sc.nextDouble();
        
        Circle obj1 = new Circle();
        Circle obj2 = new Circle(radius);
        
        System.out.println(obj1);
        System.out.println(obj2);
    }
}

class Circle {
    double radius;

    Circle() {
        this(1.0);
    }

    Circle(double radius) {
        this.radius = radius;
    }
    

    public String toString() {
        return "Circle with radius: " + radius;
    }
}
