import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Instantiate an object of Set
        // Since LinkedHashSet implements Set
        // Set points to LinkedHashSet
        Set<String> lh = new LinkedHashSet<>();

        lh.add("Geek");
        lh.add("For");
        lh.add("Geeks");
        lh.add("A");
        lh.add("B");
        lh.add("Z");

        // Iterating though the LinkedHashSet
        // using iterators
        Iterator<String> itr = lh.iterator();

        while (itr.hasNext())
            System.out.print(itr.next() + ", ");

        System.out.println();

        // Using enhanced for loop for iteration
        for (String s : lh)
            System.out.print(s + ", ");
        System.out.println();
    }
}