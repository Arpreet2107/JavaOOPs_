// Collections.sort() is used to sort the elements present in the specified list of Collections in ascending order. Collections.reverseOrder() is used to sort in descending order.
// Sorting a Collections using sort() method
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> l = new ArrayList<>();

        // Adding elements to the list
        // using add() method
        l.add("Shoes");
        l.add("Toys");

        // Adding one or more 
        // element using addAll()
        Collections.addAll(l, "Fruits", "Bat", "Mouse");

        // Sorting according to default ordering
        // using sort() method
        Collections.sort(l);

        // Printing the elements
        for (int i = 0; i < l.size(); i++) {
            System.out.print(l.get(i) + " ");
        }

        System.out.println();

        // Sorting according to reverse ordering
        Collections.sort(l, Collections.reverseOrder());

        // Printing the reverse order
        for (int i = 0; i < l.size(); i++) {
            System.out.print(l.get(i) + " ");
        }
    }
}