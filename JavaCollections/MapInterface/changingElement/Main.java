// Java program to demonstrate
// the working of Map interface
import java.util.*;

public class Main {
    public static void main(String args[])
    {

        // Initialization of a Map
        // using Generics
        Map<Integer, String> hm1
            = new HashMap<>();

        // Inserting the Elements
        hm1.put(1, "Geeks");
        hm1.put(2, "Geeks");
        hm1.put(3, "Geeks");

        System.out.println("Initial Map: " + hm1);

        hm1.put(2, "For");

        System.out.println("Updated Map: " + hm1);
    }
}