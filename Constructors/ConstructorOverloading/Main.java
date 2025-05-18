// Java Program to illustrate constructor overloading
// using same task (addition operation ) for different
// types of arguments

class Geeks {
    
    // constructor with one argument
    Geeks(String name)
    {
        System.out.println("Constructor with one "
                           + "argument - String: " + name);
    }

    // constructor with two arguments
    Geeks(String name, int age)
    {

        System.out.println(
            "Constructor with two arguments: "
            + " String and Integer: " + name + " " + age);
    }

    // Constructor with one argument but with different
    // type than previous
    Geeks(long id)
    {
        System.out.println(
            "Constructor with one argument: "
            + "Long: " + id);
    }
}

public class Main {
    // Driver method    
    // to test the above constructor
    // overloading
    public static void main(String[] args)
    {
        // Creating the objects of the class named 'Geek'
        // by passing different arguments

        // Invoke the constructor with one argument of
        // type 'String'.
        Geeks geek2 = new Geeks("Sweta");
        // Use geek2 to avoid 'never read' warning
        System.out.println(geek2);

        // Invoke the constructor with two arguments
        Geeks geek3 = new Geeks("Amiya", 28);
        System.out.println(geek3);

        // Invoke the constructor with one argument of
        // type 'Long'.
        Geeks geek4 = new Geeks(325614567);
                System.out.println(geek4);

    }
}