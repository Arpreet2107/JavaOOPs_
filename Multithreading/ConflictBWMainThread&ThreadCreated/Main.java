// Java Program to illustrate Output Conflict between
// Execution of Main thread vs Thread created

// count = 1 if main thread executes first
// count = 1 if created thread executes first

// Importing basic required libraries
// Helper Class extending Thread class
class MyThread extends Thread {

    // Declaring and initializing initial count to zero
    int count = 0;

    // Method 1
    // To increment the count above by unity
    void increment() { count++; }

    // Method 2
    // run method for thread invoked after
    // created thread has started
    @Override
    public void run()
    {

        // Call method in this method
        increment();

        // Print and display the count
        System.out.println("Count : " + count);
    }
}

// Class 2
public class Main{

    // Main driver method
    public static void main(String[] args)
    {
        // Creating the above our Thread class object
        // in the main() method
        MyThread t1 = new MyThread();

        // start() method to start execution of created
        // thread that will look for run() method
        t1.start();
    }
}