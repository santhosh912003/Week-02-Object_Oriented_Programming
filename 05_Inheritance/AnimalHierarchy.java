import java.util.*;

public class AnimalHierarchy{
  public static void main(String[] args){
    Animal obj  = new Animal("Rajesh",22);
    Dog obj1 = new Dog("Ramu",3);
    Cat obj2 = new Cat("tom",4);
    Bird obj3 = new Bird("crow", 2);
    
    obj.makeSound();
    obj1.makeSound();
    obj2.makeSound();
    obj3.makeSound();
    
    
  }
}

class Animal{
  String name; 
  int age;
  
  public Animal(String name, int age){
    this.name = name;
    this.age = age;
  }
  
  public void makeSound(){
    System.out.println("the animal moves its mouth");
  }
}

class Dog extends Animal{
  public Dog(String name, int age){
    super(name, age);
  }
  
  public void makeSound(){
    System.out.println("the dog barks");
  }
}
class Bird extends Animal{
    public Bird(String name, int age){
    super(name, age);
  }
  
  
  public  void makeSound(){
    System.out.println("the Bird chirps");
  }
}
class Cat extends Animal{
  public Cat(String name, int age){
    super(name, age);
  }
  public  void makeSound(){
    System.out.println("the Cat meows");
  }
}