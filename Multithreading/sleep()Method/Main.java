// Example 1
// Java Program to illustrate Output Without sleep() Method

// Class 1
// Helper Class 1
class Shot extends Thread {

    // Method 1
    public void show() {

        // Iterating to print more number of times
        for (int i = 0; i < 5; i++) {

            // Print statement whenever method
            // of this class is called
            System.out.println("Shot");

        }
    }
}

// Class 2
// Helper Class 2
class Miss extends Thread {

    // Method 2
    public void show() {

        // Iterating to print more number of times
        for (int i = 0; i < 5; i++) {

            // Print statement whenever method
            // of this class is called
            System.out.println("Miss");

        }
    }

}

// Class 3
// Main class
public class Main{

    // Method 3
    // Main method
    public static void main(String[] args) {

        // Creating objects in the main() method
        // of class 1 and class 2
        Shot obj1 = new Shot();
        Miss obj2 = new Miss();

        // Calling methods of the class 1 and class 2
        obj1.show();
        obj2.show();

    }
}