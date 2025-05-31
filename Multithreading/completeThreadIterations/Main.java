// Example 2
// Java Program to Illustrate Complete Thread Iterations
// illustrating join() Method

// Importing input output classes
import java.io.*;

// Class 1
// Helper Class
class TickTock {

    // Member variable of this class
    int count;

    // Method of this Class
    public void increment()
    {

        // Increment count by unity
        // whenever this function is called
        count++;
    }
}

// Class 2
// Synchronization demo class
// Main Class
public class Main {

    // Main driver method
    public static void main(String[] args) throws Exception
    {

        // Creating an object of class TickTock in main()
        TickTock tt = new TickTock();

        // Now, creating an thread object
        // using Runnable interface
        Thread t1 = new Thread(new Runnable() {
            // Method
            // To begin the execution of thread
            public void run()
            {

                // Expression
                for (int i = 0; i < 1000; i++) {

                    // Calling object of above class
                    // in main() method
                    tt.increment();
                }
            }
        });

        // Making above thread created to start
        // via start() method which automatically
        // calls run() method
        t1.start();

        // Now we are making main() thread to wait so
        // that thread t1 completes it job
        // using join() method
        t1.join();

        // Print and display the count value
        System.out.println("Count : " + tt.count);
    }
}