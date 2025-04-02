import java.util.*;

class GroceryStoreApp {
    public static void main(String[] args) {
        Customer customer = new Customer("John Doe");
        customer.addProduct(new Product("Apple", 2, 3.0));
        customer.addProduct(new Product("Milk", 1, 2.5));

        BillGenerator.generateBill(customer);
    }
}

class Customer {
    private String name;
    private List<Product> products = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public String getName() {
        return name;
    }
}

class Product {
    private String name;
    private int quantity;
    private double price;

    public Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public double getTotalPrice() {
        return quantity * price;
    }
}

class BillGenerator {
    public static void generateBill(Customer customer) {
        double total = customer.getProducts().stream().mapToDouble(Product::getTotalPrice).sum();
        System.out.println("Customer: " + customer.getName() + ", Total Bill: $" + total);
    }
}
