// Java program to demonstrate
// the working of Map interface
import java.util.*;

public class Main {

    public static void main(String args[])
    {

        // Initialization of a Map
        // using Generics
        Map<Integer, String> hm1
            = new HashMap<Integer, String>();

        // Inserting the Elements
        hm1.put(1, "Geeks");
        hm1.put(2, "For");
        hm1.put(3, "Geeks");
        hm1.put(4, "For");

        System.out.println(hm1);

        hm1.remove(4);

        System.out.println(hm1);
    }
}