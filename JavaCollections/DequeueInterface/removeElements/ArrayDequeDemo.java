// Java program to demonstrate the
// removal of elements in deque
import java.util.*;

public class ArrayDequeDemo {
  
    public static void main(String[] args)
    {
        // Initializing an deque
        Deque<String> dq = new ArrayDeque<>();

        // add() method to insert
        dq.add("For");
        dq.addFirst("Geeks");
        dq.addLast("Geeks");

        System.out.println(dq);
      
        System.out.println(dq.pop());
      
        System.out.println(dq.poll());
      
        System.out.println(dq.pollFirst());
      
        System.out.println(dq.pollLast());
    }
}