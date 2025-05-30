// Abstract Class declared
abstract class Animal {
    private final String name;

    public Animal(String name) { 
      this.name = name; 
    }

    public abstract void makeSound();

    public String getName() { 
      return name; 
    }
}

// Abstracted class
class Dog extends Animal {
    public Dog(String name) { 
      super(name); 
    }

    @Override
    public void makeSound()
    {
        System.out.println(getName() + " barks");
    }
}

// Abstracted class
class Cat extends Animal {
    public Cat(String name) { 
      super(name); 
    }

    @Override
    // Overriding the abstract method
    public void makeSound()
    {
        System.out.println(getName() + " meows");
    }
}

// Driver Class
public class Geeks {
  
    // Main Function
    public static void main(String[] args)
    {
        Animal myDog = new Dog("ABC");
        Animal myCat = new Cat("XYZ");

        myDog.makeSound();
        myCat.makeSound();
    }
}