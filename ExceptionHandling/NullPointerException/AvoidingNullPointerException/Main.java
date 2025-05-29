// Avoiding NullPointerException

// Java program to demonstrate
// how to avoid NullPointerException
public class Main {
    public static void main (String[] args) {
      
        // Initializing String variable 
        // with null value
        String s = null;

        // Checking if s is null
        // using try catch
        try
        {
            if ("gfg".equals(s))
                System.out.print("Same");
            else 
                System.out.print("Not Same");            
        }
        catch(NullPointerException e)
        {
            System.out.print("Caught NullPointerException");
        }
    }
}