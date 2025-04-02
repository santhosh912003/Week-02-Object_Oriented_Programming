
import java.util.*;

public class Q1{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the product name: ");
    String pname = sc.nextLine();
    System.out.println("Enter the price: ");
    double price = sc.nextDouble();
    
    Product obj = new Product(pname,price);
    System.out.println(obj.productName);
    
    obj.displayProductDetails();
    System.out.println(Product.totalProducts);
    
  }
}

class Product {
     String productName;
    private double price;
     static int totalProducts = 0;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    public void displayProductDetails() {
        System.out.println("Product Name: " + productName + ", Price: $" + price);
    }

    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
}
