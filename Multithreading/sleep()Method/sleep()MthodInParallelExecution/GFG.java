// Example 3
// Java Program to illustrate Output Using sleep() Method
// in Parallel Execution

// Class 1
// Helper Class 1
class Shot extends Thread {

    // Method 1
    // public void show() {
    public void run()
    {

        // Iterating to print more number of times
        for (int i = 0; i < 5; i++) {

            // Print statement
            System.out.println("Shot");

            // Making thread to sleep using sleep() method

            // Try catch block for exceptions
            try {
                Thread.sleep(1000);
            }
            catch (Exception e) {
            }
        }
    }
}

// Class 2
// Helper Class 2 Hello
class Miss extends Thread {

    // Method 2
    // public void show() {
    public void run()
    {

        // Iterating to print more number of times
        for (int i = 0; i < 5; i++) {

            // Print statement
            System.out.println("Miss");

            // Making thread to sleep using sleep() method

            // Try catch block for exceptions
            try {
                Thread.sleep(1000);
            }
            catch (Exception e) {
            }
        }
    }
}

// Class 3
// Main class
public class GFG {

    // Method 3
    // Main method
    public static void main(String[] args)
    {

        // Creating objects in the main() method
        Shot obj1 = new Shot();
        Miss obj2 = new Miss();

        // Starting the thread objects
        // using start() method

        // start() method calls the run() method
        // automatically
        obj1.start();
        obj2.start();
    }
}