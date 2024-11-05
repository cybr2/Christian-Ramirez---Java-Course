package Practice.Day_One;
import java.util.Scanner;

public class Person {
    //fields
    String name;
    int age;

    //constructor
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    //method
    public void greetings() {
        System.out.printf("Hi, my name is %s and I am %d years of age.%n", name, age);
    }

    //instantiation of object
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        Person person_one = new Person(name, age);
        System.out.println(person_one.name);
        System.out.println(person_one.age);
        person_one.greetings();
        scanner.close();
    }


}
