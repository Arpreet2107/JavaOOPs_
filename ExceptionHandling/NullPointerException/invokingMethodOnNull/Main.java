// Invoking a method on null
// causes NullPointerException

public class Main {
    public static void main (String[] args) {
      
        // Initializing String variable 
        // with null value
        String s = null;

        // Checking if s.equals null
        try
        {
            // Check if s is not null before calling equals
            if ("gfg".equals(s))
                System.out.print("Same");
            else 
                System.out.print("Not Same");
        }
        catch(NullPointerException e)
        {
            System.out.print("NullPointerException Caught");
        }
    }
}