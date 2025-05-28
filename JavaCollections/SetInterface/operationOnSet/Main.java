// Java Program Demonstrating Operations on the Set
// such as Union, Intersection and Difference operations 

// Importing all utility classes
import java.util.*;

// Main class 
public class Main {
  
    // Main driver method 
    public static void main(String args[])
    {
        // Creating an object of Set class 
        // Declaring object of Integer type 
        Set<Integer> a = new HashSet<>();
      
        // Adding all elements to List 
        a.addAll(Arrays.asList(
            new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));
      
      // Again declaring object of Set class
      // with reference to HashSet
        Set<Integer> b = new HashSet<>();
        
      b.addAll(Arrays.asList(
            new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5 }));

        
        // To find union
        Set<Integer> u = new HashSet<>(a);
        u.addAll(b);
        System.out.print("Union of the two Set");
        System.out.println(u);

        // To find intersection
        Set<Integer> i = new HashSet<>(a);
        i.retainAll(b);
        System.out.print("Intersection of the two Set");
        System.out.println(i);

        // To find the symmetric difference
        Set<Integer> d = new HashSet<>(a);
        d.removeAll(b);
        System.out.print("Difference of the two Set");
        System.out.println(d);
    }
}