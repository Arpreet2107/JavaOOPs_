// Java Program to illustrate Priority Threads
// Case 1: No priority is assigned (Default priority)

// Importing input output thread class
// Helper Class (Our thread  class)
class MyThread extends Thread {

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
class GFG {

    // Main driver method
    public static void main(String[] args)
    {

        // Creating objects of MyThread(above class)
        // in the main() method
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        // Case 1: Default Priority no setting
        t1.start();
        t2.start();
    }
}