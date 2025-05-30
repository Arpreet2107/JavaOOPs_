// Working of chained exceptions
public class Main {
    public static void main(String[] args) {
        try {
          
            // Creating an exception
            NumberFormatException ex = new NumberFormatException("Primary Exception");

            // Setting the cause of the exception
            ex.initCause(new NullPointerException("Root cause of the exception"));

            // Throwing the exception with a cause
            throw ex;
        } 
        catch (NumberFormatException ex) {
          
            // Displaying the primary exception
            System.out.println("Caught Exception: " + ex);

            // Displaying the root cause of the exception
            Throwable cause = ex.getCause();
            if (cause != null) {
                System.out.println("Cause of Exception: " + cause);
            } else {
                System.out.println("No cause for the exception.");
            }
        }
    }
}