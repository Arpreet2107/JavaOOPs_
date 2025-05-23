// Animal is a Parent class
class Animal 
{
    public void eat()
    {
        System.out.println("Animal is eating");
    }
}

// Dog is derived from Animal class
class Dog extends Animal 
{
    public static void main(String args[])
    {
        // Creating object of Dog class
        Dog d = new Dog();

        // Dog can access eat() method
      	// of Animal class
        d.eat();
    }
}