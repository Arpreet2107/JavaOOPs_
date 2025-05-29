// Java code to illustrate How to Use StringBuffer in TreeSet
// with a Custom Comparator

import java.util.*;

// Main class
public class Main {

    // Main driver method
    public static void main(String[] args)
    {
        // Creating a TreeSet with a custom Comparator
        Set<StringBuffer> ts = new TreeSet<>((sb1, sb2) -> sb1.toString().compareTo(sb2.toString()));

        // Adding elements to the TreeSet
        ts.add(new StringBuffer("A"));
        ts.add(new StringBuffer("Z"));
        ts.add(new StringBuffer("L"));
        ts.add(new StringBuffer("B"));
        ts.add(new StringBuffer("O"));
        ts.add(new StringBuffer("1"));

        // Printing the elements
        System.out.println(ts); 
    }
}