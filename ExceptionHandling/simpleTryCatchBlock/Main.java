public class Main {
    public static void main(String[] args) {
        try {
          
            // This will not throw an ArithmeticException
            int res = 10 / 2;
            System.out.println("Result: " + res);
        }
        // Here we are Handling the exception
        catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        }

        // This line will execute whether an exception
        // occurs or not
        System.out.println("I will always execute");
    }
}