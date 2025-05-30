// Java program to demonstrate the
// working of a TreeSet
import java.util.*;

public class Main {

    // Main Method
    public static void main(String args[])
    {
        // Creating TreeSet and
        // adding elements
        TreeSet<String> ts = new TreeSet<>();

        ts.add("Geeks");
        ts.add("For");
        ts.add("Geeks");
        ts.add("Is");
        ts.add("Very helpful");

        // Traversing elements
        Iterator<String> itr = ts.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}