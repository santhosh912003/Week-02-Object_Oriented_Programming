import java.util.*;

public class BookClassProgram{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the book name: ");
    String name = sc.nextLine();
    System.out.println("enter the author name: ");
    String author = sc.nextLine();
    System.out.println("enter the book price: ");
    double price = sc.nextDouble();
    sc.nextLine();
    
    Book obj1 = new Book();
    Book obj2 = new Book(name, author, price);
    
    
    System.out.println(obj1.toString());
    System.out.println(obj2.toString());
  }
}

class Book {
    String title;
    String author;
    double price;

    Book() {
        this.title = "undefiend default value";
        this.author = "undefiend default value";
        this.price = 0.0;
    }

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Book: " + title + " by " + author + ", Price: $" + price;
    }
}