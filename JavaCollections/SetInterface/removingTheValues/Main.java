
// Java Program Demonstrating Working of Set by
// Removing Element/s from the Set

// Importing all utility classes
import java.util.*;

// Main class
public class Main {

    // Main driver method
    public static void main(String[] args)
    {
        // Declaring object of Set of type String
        Set<String> h = new HashSet<>();

        // Elements are added
        // using add() method

        // Custom input elements
        h.add("A");
        h.add("B");
        h.add("C");
        h.add("B");
        h.add("D");
        h.add("E");

        // Printing initial Set elements
        System.out.println("Initial HashSet " + h);

        // Removing custom element
        // using remove() method
        h.remove("B");

        // Printing Set elements after removing an element
        // and printing updated Set elements
        System.out.println("After removing element " + h);
}
}
