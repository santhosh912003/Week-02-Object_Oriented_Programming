import java.util.*;

public class CheckPalindromeString{
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the text you wanna check for palindrome: ");
    String val = sc.nextLine();
    
    PalindromChecker obj = new PalindromChecker(val);
    obj.Display();
  }
}

class PalindromChecker{
  String text;
  
  public PalindromChecker(String text){
    this.text = text;
  }
  
  String reverse(){
    String temp = "";
    for(int i=this.text.length()-1;i>=0;i--){
      temp += this.text.charAt(i);
    }
    
    return temp;
  }
  
  boolean checker(String s1,String s2){
    return s1.equals(s2);
  }
  
  void Display(){
    String s2 = reverse();
    boolean flag = checker(this.text,s2);
    System.out.println("The given String is Palindrome: ? "+ flag);
  }
}