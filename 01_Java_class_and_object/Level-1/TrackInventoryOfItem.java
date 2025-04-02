import java.util.*;

public class TrackInventoryOfItem{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Items obj1 = new Items(1, "Rice",40);
    

    obj1.Display();
    
    System.out.println("Enter the quantity of the item: ");
    int val = sc.nextInt();
    obj1.Total(val);
  }
}

class Items{
  
  int Itemcode;
  String name;
  double price;
  
  
  public Items(int Itemcode, String name, double price){
    this.Itemcode = Itemcode;
    this.name = name;
    this.price = price;
  }
  
  void Total(int val){
    double t = val * this.price;
    System.out.printf("the total price of the item %S for the given quantity %d is  %.2f",this.name, val, t);
    System.out.println();
  }
  
  
  void Display(){
    System.out.printf("The ItemCode of the Item is %d and its name is  %s its price is %.2f",this.Itemcode, this.name, this.price);
    System.out.println();
  }
}