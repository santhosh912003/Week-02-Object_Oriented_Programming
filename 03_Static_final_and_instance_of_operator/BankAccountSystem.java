public class BankAccountSystem{

  public static void main(String[] args){
    
    bankAccount obj1 = new bankAccount("rajesh",12345,10000);
    bankAccount obj2 = new bankAccount("sanjay",2342,90909);
    bankAccount.getTotalAccounts();
    
    obj1.display();
    
    obj2.display();
    
  }  
}

class bankAccount {
  private static String BankName = "Indian Bank";
  private static int total_acc = 0;
  
  private String name;
  private final int acc_no;
  private double balance;
  
  
  public bankAccount(String name, int acc_no, double balance){
    this.name  = name;
    this.acc_no = acc_no;
    this.balance = balance;
    total_acc++;
  }
  
  
  static void getTotalAccounts(){
    System.out.println("The total number of accounts created so far is : "+total_acc);
  }
  
  
  void display(){
    if(this instanceof bankAccount){
      System.out.println("The account holder name is : "+this.name);
      System.out.println("The account number is : "+this.acc_no);
      System.out.println("The account balance is : "+this.balance);
    }
    else{
      System.out.println("Invalid object or instance");
    }
  }
  
  
  
}