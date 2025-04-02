import java.util.*;

public class HandleBookDetails{
  public static void main(String[] args){
    
   Books obj1 = new Books("Priates of the carabian","steve jobs",400000);
    Books obj2 = new Books("Game of thrones","messi",24545);
    
    obj1.Display();
    obj2.Display();
  }
}

class Books{
  
  String title;
  String author;
  double price;
  
  
  public Books(String title, String author, double price){
    this.title = title;
    this.author = author;
    this.price = price;
  }
  
  
  void Display(){
    System.out.printf("The Title of the Book is  %s and its author %s its price is %.2f",this.title, this.author, this.price);
    System.out.println();
  }
}