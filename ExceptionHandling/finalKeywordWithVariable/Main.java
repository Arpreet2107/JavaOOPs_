// Java Program to demonstrate 
// the final keyword with variable
public class Main{
    public static void main(String[] args)
    {
        // Non final variable
        int a = 5;

        // final variable
        final int b = 6;

        // modifying the non final variable
        a++;

        // modifying the final variable
        // Immediately gives Compile Time error
        b++;
    }
}