import java.util.HashMap;

public class Main
{
    public static void main(String args[]) 
    {
        
      	// Create a Hashtable of String
      	// keys and Integer values
        HashMap<String, Integer> ht = new HashMap<>();

        // Adding elements to the Hashtable
        ht.put("One ", 1);
        ht.put("Two ", 2);
        ht.put("Three ", 3);
        
        // Displaying the Hashtable elements
        System.out.println("Hashtable Elements: " + ht);
    }
}