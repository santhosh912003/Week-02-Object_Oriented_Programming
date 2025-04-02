import java.util.*;

public class PersonClassProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the person's name: ");
        String name = sc.nextLine();
        System.out.println("Enter the person's age: ");
        int age = sc.nextInt();

        Person obj1 = new Person();
        Person obj2 = new Person(name, age);
        Person obj3 = new Person(obj2);

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
    }
}

class Person {
    String name;
    int age;

    Person() {
        this("Unknown", 0);
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    public String toString() {
        return "Person: " + name + ", Age: " + age;
    }
}
