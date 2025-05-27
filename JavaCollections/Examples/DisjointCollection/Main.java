// Collections.disjoint() is used to check whether two specified collections are disjoint or not. More formally, two collections are disjoint if they have no elements in common. It returns true if the two collections do not have any element in common. 
// Working of Disjoint Function
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<String> l1 = new ArrayList<>();

        // Add elements to l1
        l1.add("Shoes");
        l1.add("Toys");
        l1.add("Horse");
        l1.add("Tiger");

        List<String> l2 = new ArrayList<>();

        // Add elements to l2
        l2.add("Bat");
        l2.add("Frog");
        l2.add("Lion");

        // Check if disjoint or not
        System.out.println(
            Collections.disjoint(l1, l2));
    }
}