// Java code to Illustrate Addition of Elements to TreeSet

// Importing utility classes
import java.util.*;

// Main class
public class Main{

    // Main driver method
    public static void main(String[] args)
    {
        // Creating a Set interface with
        // reference to TreeSet class
        // Declaring object of string type
        Set<String> ts = new TreeSet<>();

        // Elements are added using add() method
        ts.add("Geek");
        ts.add("For");
        ts.add("Geeks");

        // Print all elements inside object
        System.out.println(ts);
    }
}