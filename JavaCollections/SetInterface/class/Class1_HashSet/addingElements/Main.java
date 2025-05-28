// Java program to Adding Elements to HashSet
import java.util.*;

// Main class
public class Main{
    public static void main(String[] args)
    {  
        // Creating an empty HashSet of string entities
        HashSet<String> hs = new HashSet<>();

        // Adding elements using add() method
        hs.add("Geek");
        hs.add("For");
        hs.add("Geeks");

        // Printing all string entries inside the Set
        System.out.println("HashSet : " + hs);
    }
}