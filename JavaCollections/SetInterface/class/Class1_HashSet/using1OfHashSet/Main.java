// Java program to show the use of HashSet
import java.util.*;

// Main class
public class Main
{
    public static void main(String[] args) 
    {
        // Instantiate an object of HashSet
        HashSet<Integer> hs = new HashSet<>();

      	// Adding elements 
        hs.add(1);
        hs.add(2);
        hs.add(1);

        // Printing the Size and Element of HashSet
        System.out.println("HashSet Size: " + hs.size());
        System.out.println("Elements in HashSet: " + hs);
    }
}