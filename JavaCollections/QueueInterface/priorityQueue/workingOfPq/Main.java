 // Java program to demonstrate the
// working of PriorityQueue
import java.util.*;

public class Main{
    public static void main(String args[])
    {
        // Creating empty priority queue
        PriorityQueue<Integer> p = new PriorityQueue<>();

        // Adding items to the pQueue using add()
        p.add(10);
        p.add(20);
        p.add(15);

        // Printing the top element of PriorityQueue
        System.out.println(p.peek());

        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println(p.poll());

        // Printing the top element again
        System.out.println(p.peek());
    }
} 