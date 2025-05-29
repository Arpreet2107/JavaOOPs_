import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Creating an empty LinkedHashSet
        LinkedHashSet<String> lh = new LinkedHashSet<>();

        // Adding elements to above Set
        // using add() method
        lh.add("Geek");
        lh.add("For");
        lh.add("Geeks");

        System.out.println("LinkedHashSet : " + lh);
    }
}