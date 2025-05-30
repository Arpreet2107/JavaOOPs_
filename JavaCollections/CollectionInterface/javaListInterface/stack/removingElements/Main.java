// Java program to demonstrate the removing
// of the elements from the stack
import java.util.*;

public class Main {
    public static void main(String args[])
    {
        // Creating an empty Stack
        Stack<Integer> stack = new Stack<>();

        // Use add() method to add elements
        stack.push(10);
        stack.push(15);
        stack.push(30);
        stack.push(20);
        stack.push(5);

        // Displaying the Stack
        System.out.println("Initial Stack: " + stack);

        // Removing elements using pop() method
        System.out.println("Popped element: "
                           + stack.pop());
        System.out.println("Popped element: "
                           + stack.pop());

        // Displaying the Stack after pop operation
        System.out.println("Stack after pop operation "
                           + stack);
      
       System.out.println("Is stack empty? " + stack.empty()); 
       // Pop remaining elements
        stack.pop();
        stack.pop();
        stack.pop();

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.empty());
    }
}