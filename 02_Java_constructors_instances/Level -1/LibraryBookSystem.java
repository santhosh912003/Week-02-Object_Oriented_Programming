import java.util.*;

public class LibraryBookSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter book title: ");
        String title = sc.nextLine();
        System.out.println("Enter author name: ");
        String author = sc.nextLine();
        System.out.println("Enter book price: ");
        double price = sc.nextDouble();

        LibraryBook obj1 = new LibraryBook("Java Basics", "John Doe", 15.99);
        LibraryBook obj2 = new LibraryBook(title, author, price);

        System.out.println(obj1);
        System.out.println(obj2);

        System.out.println(obj1.borrow());
        System.out.println(obj2.borrow());
        
        System.out.println(obj1);
        System.out.println(obj2);
    }
}

class LibraryBook {
    String title;
    String author;
    double price;
    private boolean available;

    LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        available = true;
    }

    String borrow() {
        if (available) {
            available = false;
            return "Book borrowed successfully!";
        }
        return "Book is not available.";
    }

    public String toString() {
        return "Book: " + title + " by " + author + ", Price: $" + price + ", Status: " + (available ? "Available" : "Not Available");
    }
}
