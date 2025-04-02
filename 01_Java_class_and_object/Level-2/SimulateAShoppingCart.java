import java.util.*;

public class SimulateAShoppingCart{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int index = 5;
    while(index>0){
      System.out.println("Enter the Item name: ");
      String name = sc.nextLine();
      System.out.println("Enter the price of that Item: ");
      double p = sc.nextDouble();
      sc.nextLine();
      System.out.println("Enter the Quantity: ");
      int q = sc.nextInt();
      sc.nextLine();
      
      Item it = new Item(name,p,q);
      Cart.AddToCart(it);
      
      index--;
    }
    
    Cart.Total();
  }
}

class Item{
  String name;
  double price;
  int q;
  
  public Item(String name, double price, int q){
    this.name = name;
    this.price = price;
    this.q = q;
  }
}

class Cart{
  static ArrayList<Item> cart = new ArrayList<>();
  
  static void AddToCart(Item it){
    cart.add(it);
    System.out.printf("Item %s is added successfully!",it.name);
    System.out.println();
    return;
  }
  
  static void Total(){
    double sum = 0;
    for(Item num : cart){
      sum += num.q*num.price;
    }
    
    System.out.printf("The total amount for the cart is: %.3f",sum);
    System.out.println();
  }
  
}