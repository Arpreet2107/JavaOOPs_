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
        hm1.put(2, "For");
        hm1.put(3, "Geeks");

        for (Map.Entry<Integer, String> mapElement : hm1.entrySet()) {
            int key = mapElement.getKey();

            // Finding the value
            String value = mapElement.getValue();

            System.out.println(key + " : " + value);
        }
    }
}