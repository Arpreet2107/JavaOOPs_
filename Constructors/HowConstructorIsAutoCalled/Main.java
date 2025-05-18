// Java Program to demonstrate Constructor usage
class Geeks {
  
    // Constructor
    Geeks()
    {
        super();
        System.out.println("Constructor Called");
    }

    // main function
    public static void main(String[] args)
    {
        Geeks geek = new Geeks();
        // Example usage: you can call methods or access fields here if defined
        // For demonstration, let's print a message using the created object
        System.out.println("Geeks object created: " + geek);
        // Now 'geek' is created and can be used if needed
    }
}