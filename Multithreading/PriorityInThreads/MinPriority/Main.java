// Java Program to illustrate Priority Threads
// Case 3: MIN_PRIORITY

// Importing input output thread class
// Helper Class (Our thread  class)
class MyThread extends Thread {

    // run() method to transit thread from
    // runnable to run state
    public void run()
    {

        // Printing the current running thread via getName()
        // method using currentThread() method
        System.out.println("Running Thread : "
                           + currentThread().getName());

        // Print and display the priority of current thread
        // via currentThread() using getPriority() method
        System.out.println("Running Thread Priority : "
                           + currentThread().getPriority());
    }
}

// Class 2
// Main Class
public class Main {

    // Main driver method
    public static void main(String[] args)
    {

        // Creating objects of MyThread(above class)
        // in the main() method
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        // Setting priority to thread via NORM_PRIORITY
        // which set priority to 1 as least priority thread
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        // Setting default priority using
        // NORM_PRIORITY
        t1.start();
        t2.start();
    }
}