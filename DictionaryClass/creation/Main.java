import java.util.HashMap;
import java.util.Map;

public class Main{
    public static void main(String[] args) {
      
        // create a Dictionary instance 
        // create a Map instance 
        // using HashMap
        Map<String, Integer> d = new HashMap<>();
        // Adding key-value pairs
        // Adding key-value pairs
        d.put("A", 25);
        d.put("B", 30);
        d.put("C", 35);

        // Retrieving a value using a key
        System.out.println("Value of B: " + d.get("B")); 

        // Replacing an existing value
        int oldValue = d.put("C", 40);
        System.out.println("Old Value of C: " + oldValue); 

        // Removing a key-value pair
        d.remove("A");

        // Displaying remaining key-value pairs
        for (String key : d.keySet()) {
            System.out.println("Key: " + key + ", Value: " + d.get(key));
        }
    }
}