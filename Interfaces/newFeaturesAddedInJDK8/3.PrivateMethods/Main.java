/*Example: This example demonstrates the use of private methods in interfaces (introduced in JDK 8) that can be called by default methods within the same interface but are not accessible outside the interface.*/

interface Vehicle {
    // Private method for internal use
    private void startEngine() {
        System.out.println("Engine started.");
    }
    
    // Default method that uses the private method
    default void drive() {
         // Calls the private method
        startEngine(); 
        System.out.println("Vehicle is now driving.");
    }
}

class Car implements Vehicle {
    // Car class implements Vehicle interface and inherits the default method 'drive'
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        // This will call the default method, which in turn calls the private method
        car.drive();  
    }
}