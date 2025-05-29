// Java program to demonstrate the
// creation of queue object using the
// PriorityQueue class
import java.util.*;

public class Main {

    public static void main(String args[])
    {
        // Creating empty priority queue
        Queue<Integer> pq
            = new PriorityQueue<>();

        // Adding items to the pQueue
        // using add()
        pq.add(10);
        pq.add(20);
        pq.add(15);

        // Printing the top element of
        // the PriorityQueue
        System.out.println(pq.peek());

        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println(pq.poll());

        // Printing the top element again
        System.out.println(pq.peek());
    }
}