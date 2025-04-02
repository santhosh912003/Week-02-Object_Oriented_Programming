import java.util.Scanner;

public class BookLibrarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ISBN: ");
        String ISBN = sc.nextLine();

        System.out.println("Enter Book Title: ");
        String title = sc.nextLine();

        System.out.println("Enter Author Name: ");
        String author = sc.nextLine();

        System.out.println("Enter File Size (MB) for E-Book: ");
        double fileSize = sc.nextDouble();

        EBook ebook = new EBook(ISBN, title, author, fileSize);
        
        System.out.println("\nBook Details:");
        ebook.displayDetails();

        System.out.println("\nE-Book Specific Details:");
        ebook.displayEBookDetails();

        System.out.println("\nEnter new Author Name: ");
        sc.nextLine(); 
        String newAuthor = sc.nextLine();
        ebook.setAuthor(newAuthor);

        System.out.println("\nUpdated Book Details:");
        ebook.displayDetails();

        sc.close();
    }
}
class Book {
    public String ISBN;
    protected String title;
    private String author;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void displayDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
class EBook extends Book {
    private double fileSize; // in MB

    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    public void displayEBookDetails() {
        System.out.println("E-Book Details:");
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("File Size: " + fileSize + " MB");
    }
}
