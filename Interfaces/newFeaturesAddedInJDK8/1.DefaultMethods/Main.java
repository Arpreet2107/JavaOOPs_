/*Example: This example demonstrates the use of default methods in interfaces (introduced in JDK 8) to provide a method implementation within the interface itself.*/
// interfaces can have methods from JDK 1.8 onwards
interface MyTestInterface
{
    final int A = 10;
    
    default void display() {
        System.out.println("hello");
    }
}

// A class that implements the interface.
class TestClass implements MyTestInterface
{
    // Driver Code
    public static void main (String[] args) {
        TestClass t = new TestClass();
        t.display();
    }
}