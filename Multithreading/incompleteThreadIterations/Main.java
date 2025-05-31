// Example 1
// Java Program to illustrate Incomplete Thread Iterations
// Returning Counter Value to Zero 
// irrespective of iteration bound

// Importing input output classes
import java.io.*;

// Class 1
// Helper Class
class TickTock {

    // Member variable of this class
    int count;

    // Method of this Class
    // It increments counter value whenever called
    public void increment()
    {
        // Increment count by unity
        // i.e count = count + 1;
        count++;
    }
    //
}

// Class 2
// Synchronization demo class
// Main Class
public class Main{

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
                for (int i = 0; i < 10000; i++) {

                    // Calling object of above class
                    // in main() method
                    tt.increment();
                }
            }
        });

        // Making above thread created to start
        // via start() method which automatically
        // calls run() method in Ticktock class
        t1.start();

        // Print and display the count
        System.out.println("Count : " + tt.count);
    }
}