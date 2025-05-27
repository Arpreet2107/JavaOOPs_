// Collections.binarySearch() method returns the position of an object in a sorted list. To use this method, the list should be sorted in ascending order, otherwise, the result returned from the method will be wrong. If the element exists in the list, the method will return the position of the element in the sorted list, otherwise, the result returned by the method would be the - (insertion point where the element should have been present if exist)-1). 
// Binary Search using Collections.binarySearch()
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Geeks {

    public static void main(String[] args) {

        List<String> l = new ArrayList<>();

        // Adding elements to object
        // using add() method
        l.add("Shoes");
        l.add("Toys");
        l.add("Horse");
        l.add("Ball");
        l.add("Grapes");

        // Sort the List
        Collections.sort(l);

        // BinarySearch on the List
        System.out.println(
            "The index of Horse is: "
            + Collections.binarySearch(l, "Horse"));

        // BinarySearch on the List
        System.out.println(
            "The index of Dog is: "
            + Collections.binarySearch(l, "Dog"));
    }
}