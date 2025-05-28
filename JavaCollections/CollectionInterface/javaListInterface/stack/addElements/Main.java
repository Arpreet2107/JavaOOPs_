// Java program to add the
// elements in the stack

public class Main{
  
    // Main Method
    public static void main(String[] args)
    {

        // Default initialization of Stack
        java.util.Stack<String> stack1 = new java.util.Stack<>();

        // Initialization of Stack
        // using Generics
        java.util.Stack<String> stack2 = new java.util.Stack<>();

        // pushing the elements
        stack1.push("4");
        stack1.push("All");
        stack1.push("Geeks");

        stack2.push("Geeks");
        stack2.push("For");
        stack2.push("Geeks");

          // Printing the Stack Elements
        System.out.println(stack1);
        System.out.println(stack2);
    }
}