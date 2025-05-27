// The copy() method of Collections class is used to copy all the elements from one list into another. After the operation, the index of each copied element in the destination list will be identical to its index in the source list. The destination list must be at least as long as the source list. If it is longer, the remaining elements in the destination list are unaffected.
// Copying Elements using copy() method
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> l1 = new ArrayList<>();

        // Add elements
        l1.add("Shoes");
        l1.add("Toys");
        l1.add("Horse");
        l1.add("Tiger");

        // Print the elements
        System.out.println(
            "The Original Destination list is: ");

        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i) + " ");
        }
        System.out.println();

        // Create source list
        List<String> l2 = new ArrayList<>();

        // Add elements
        l2.add("Bat");
        l2.add("Frog");
        l2.add("Lion");

        // Copy the elements from source to destination
        Collections.copy(l1, l2);

        // Printing the modified list
        System.out.println(
            "The Destination List After copying is: ");

        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i) + " ");
        }
    }
}