// Java Program to Illustrate TreeMap Class

// Importing required classes
import java.util.*;

// Main class
public class Main {

    // Main driver method
    public static void main(String[] args)
    {

        // Creating an empty TreeMap
        Map<String, Integer> m = new TreeMap<>();

        // Inserting custom elements in the Map
        // using put() method
        m.put("Sweta", 10);
        m.put("Amiya", 30);
        m.put("Gudly", 20);

        // Iterating over Map using for each loop
        for (Map.Entry<String, Integer> e : m.entrySet())

            System.out.println(e.getKey() + " "
                               + e.getValue());
    }
}