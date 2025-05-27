// Adding Elements
// Using addAll() method
/*The addAll() method of java.util.Collections class is used to add all the specified elements to the specified collection. Elements to be added may be specified individually or as an array.*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
      
        List<String> l = new ArrayList<>();

        // Adding elements to the list
        l.add("Shoes");
        l.add("Toys");

        // Add one or more elements
        Collections.addAll(l, "Fruits", "Bat", "Ball");

        for (int i = 0; i < l.size(); i++) {
            System.out.print(l.get(i) + " ");
        }
    }
}