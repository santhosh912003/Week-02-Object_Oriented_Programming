import java.util.*;

public class ShoppingCartSystem {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 1000, 2);
        Product p2 = new Product("Smartphone", 800, 1);

        if (p1 instanceof Product) p1.displayProductDetails();
        if (p2 instanceof Product) p2.displayProductDetails();

        Product.updateDiscount(10);
        p1.displayProductDetails();
        p2.displayProductDetails();
    }
}

class Product {
    private static double discount = 0.0;
    private final int productID;
    private String productName;
    private double price;
    private int quantity;
    private static int idCounter = 1;

    public Product(String productName, double price, int quantity) {
        this.productID = idCounter++;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public double getFinalPrice() {
        return price * quantity * (1 - discount / 100);
    }

    public void displayProductDetails() {
        System.out.println("Product ID: " + productID + ", Name: " + productName + ", Price: $" + price +
                ", Quantity: " + quantity + ", Discount: " + discount + "%, Final Price: $" + getFinalPrice());
    }
}
