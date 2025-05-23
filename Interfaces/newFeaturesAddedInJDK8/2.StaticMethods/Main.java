// Example: This example demonstrates the use of static methods in interfaces (introduced in JDK 8), which can be called directly using the interface name without needing an instance.
interface MyTestInterface
{
    final int A = 10;
    static void display()
    {
        System.out.println("hello");
    }
}

// A class that implements the interface.
class TestClass implements MyTestInterface
{
    // Driver Code
    public static void main (String[] args)
    {
        MyTestInterface.display();
        // Create an instance of TestClass to use it
        TestClass obj = new TestClass();
        System.out.println("TestClass instance created: " + obj);
    }
}