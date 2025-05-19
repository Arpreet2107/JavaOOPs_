package PillarsOfOOPs.Inheritance.typesOfINheritance.hybridInheritance;

// Interface representing common functionality for Mammals
interface Mammal {
    void giveBirth(); // Abstract method: How mammals reproduce
    void hasHair();
}

// Interface representing common functionality for WingedCreatures
interface WingedCreature {
    void fly(); // Abstract method: How winged creatures move
}

// 1. Single Inheritance: Animal is the base class
class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// 2. Single Inheritance: Dog inherits from Animal
class Dog extends Animal implements Mammal {
    String breed;

    public Dog(String name, String breed) {
        super(name); // Call the constructor of the Animal class
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void bark() {
        System.out.println(name + " is barking.");
    }

    @Override
    public void giveBirth() {
        System.out.println(name + " gives birth to live puppies.");
    }

    @Override
    public void hasHair() {
        System.out.println(name + " has hair.");
    }
}

// 3. Single Inheritance: Bat inherits from Animal AND implements Mammal and WingedCreature
class Bat extends Animal implements Mammal, WingedCreature {
    int wingSpan;

    public Bat(String name, int wingSpan) {
        super(name);
        this.wingSpan = wingSpan;
    }

    @Override
    public void giveBirth() {
        System.out.println(name + " gives birth to live young.");
    }

    @Override
    public void hasHair() {
        System.out.println(name + " has hair.");
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying with a wing span of " + wingSpan + " cm.");
    }
    public void echolocate() {
        System.out.println(name + " is using echolocation.");
    }
}

// 4. Single Inheritance: Fruit class
class Fruit {
    String name;
    public Fruit(String name){
        this.name = name;
    }
    public void grow(){
        System.out.println(name + " is growing");
    }

}
// 5. Single Inheritance: Mango inherits from Fruit and Implements WingedCreature.  This is not logical
//   but is done to demonstrate Hybrid Inheritance.  A class cannot implement an interface and extend a class
//   at the same level.
class Mango extends Fruit implements WingedCreature{
    public Mango(String name){
        super(name);
    }

    @Override
    public void fly(){
        System.out.println("Mango " + name + " is NOT flying");
    }
}
public class HybridInheritanceExample {
    public static void main(String[] args) {
        // Creating objects of different classes
        Dog dog1 = new Dog("Buddy", "Golden Retriever");
        Bat bat1 = new Bat("Dracula", 30);
        dog1.eat();
        dog1.sleep();
        dog1.bark();
        dog1.giveBirth();
        dog1.hasHair();
        System.out.println("Breed: " + dog1.getBreed());
        dog1.sleep();
        dog1.bark();
        dog1.giveBirth();
        dog1.hasHair();

        // Calling methods of Bat
        System.out.println("\n--- Bat ---");
        bat1.eat();
        bat1.sleep();
        bat1.fly();
        bat1.giveBirth();
        bat1.hasHair();
        bat1.echolocate();

        // Calling methods of Mango.
        System.out.println("\n--- Mango ---");
        Mango mango = new Mango("Alphonso");
        mango.grow();
        mango.fly(); // Mango should not be able to fly, but it can because of the interface.

        //Demonstrate Polymorphism
        System.out.println("\n--- Polymorphism Example ---");
        Animal myAnimal1 = new Dog("Charlie", "Labrador");  //Upcasting
        Animal myAnimal2 = new Bat("Zappy", 25);    //Upcasting

        myAnimal1.eat(); //Calls Dog's eat (inherited from Animal)
        myAnimal2.eat(); //Calls Bat's eat (inherited from Animal)

        Mammal mammal1 = new Dog("Max", "German Shepherd"); //Upcasting via interface
        Mammal mammal2 = new Bat("Luna", 28);  //Upcasting via interface

        mammal1.giveBirth(); //Calls Dog's giveBirth
        mammal2.giveBirth(); //Calls Bat's giveBirth

        //Demonstrate that you cannot create an instance of an Interface
        // Mammal myMammal = new Mammal(); //This is not allowed.  Interfaces cannot be instantiated.

    }
}

/*
Explanation of Hybrid Inheritance in Java:

Hybrid Inheritance:
- It is a combination of more than one type of inheritance.
- Java does not directly support multiple inheritance between classes (like in C++).
- Java achieves a form of hybrid inheritance using a combination of single inheritance (with classes) and interfaces.

In this example:
1. Single Inheritance:
    - Class Animal is the base class.
    - Class Dog inherits from Animal.
    - Class Bat inherits from Animal.
    - Class Fruit is a base class
    - Class Mango inherits from Fruit
2. Interface Implementation:
    - Interface Mammal defines the behavior of mammals.
    - Interface WingedCreature defines the behavior of winged creatures.
    - Class Dog implements Mammal.
    - Class Bat implements both Mammal and WingedCreature.
    - Class Mango implements WingedCreature.

How Hybrid Inheritance is Achieved:
- The Bat class forms the hybrid part. It inherits from Animal (single inheritance) and also implements the interfaces Mammal and WingedCreature.
- The Dog class inherits from Animal and implements Mammal.
- The Mango class inherits from Fruit and implements WingedCreature

Key Points:
- Java uses classes for single inheritance (extends keyword).
- Java uses interfaces to define contracts that classes can implement (implements keyword).  A class can implement multiple interfaces.
- This combination allows creating a hierarchy that resembles hybrid inheritance.
- Interfaces help in achieving polymorphism (using methods of different classes through a common interface type).
- Diamond Problem: Java avoids the "diamond problem" (which occurs in languages with multiple class inheritance) by not allowing a class to inherit from multiple classes.  Interfaces do not have this problem.
- In the main method, objects of Dog, Bat, and Mango are created and their methods are called to demonstrate the inheritance and interface implementation.
*/
