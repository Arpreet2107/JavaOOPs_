// Java Program for Method Overriding

// Class 1
// Helper class
class Parent {

    // Method of parent class
    void Print() {
        System.out.println("parent class");
    }
}

// Class 2
// Helper class
class subclass1 extends Parent {

    // Method
    void Print() { 
      System.out.println("subclass1"); 
    }
}

// Class 3
// Helper class
class subclass2 extends Parent {

    // Method
    @Override
    // Overriding method of parent class
    // with same name but different
    // implementation
    // This method will be called
    // when subclass2 object is created
    // and Print() method is called
    // This method will override the    
    // Print() method of parent class
    void Print() {
        System.out.println("subclass2");
    }
}

// Class 4
// Main class
public class Main {

    // Main driver method
    public static void main(String[] args) {

        // Creating object of class 1
        Parent a;

        // Now we will be calling print methods
        // inside main() method
        a = new subclass1();
        a.Print();

        a = new subclass2();
        a.Print();
    }
}