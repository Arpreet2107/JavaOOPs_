//The below Java program modifies the previous example to handle an ArithmeticException using try-catch, and finally blocks and keepsto the program running.
// Java program to demonstrates handling
// the exception using try-catch block

public class Main {
    public static void main(String[] args)
    {
        int n = 10;
        int m = 0;

        try {

            // Check if denominator is zero before division
            if (m == 0) {
                System.out.println("Error: Division by zero is not allowed!");
            } else {
                int ans = n / m;
                System.out.println("Answer: " + ans);
            }
        }
        catch (ArithmeticException e) {

            // Handling the exception
            System.out.println(
                "Error: Division by zero is not allowed!");
        }
        finally {
            System.out.println(
                "Program continues after handling the exception.");
        }
    }
}