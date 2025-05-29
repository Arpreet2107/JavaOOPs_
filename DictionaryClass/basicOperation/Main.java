import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main{
    public static void main(String[] args) {

        // Create a Map instance 
        // using HashMap
        Map<String, String> d = new HashMap<>();

        // Add key-value pairs 
        d.put("Java", "1");
        d.put("Python", "2");

        print(d);

        // Retrieve a value using its key
        String v = d.get("Java");
        System.out.println("\nValue for key 'Java': " + v);

        // Check the number of key-value pairs
        System.out.println("Size of dictionary: " + d.size());

        // Check if the dictionary is empty
        System.out.println("Is dictionary empty? " + d.isEmpty());

        // Remove a key-value pair for given key 
        System.out.println("\nRemoving key 'Python'...");
        d.remove("Python");
        print(d);

        // Retrieve all keys 
        Set<String> keys = d.keySet();
        for (String k : keys) {
            System.out.println("Key: " + k);
        }

        // Retrieve all values 
        for (String value : d.values()) {
            System.out.println("Value: " + value);
        }
    }

    // Utility method to print all 
    // key-value pairs in the dictionary
    private static void print(Map<String, String> d) {
        for (Map.Entry<String, String> entry : d.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}