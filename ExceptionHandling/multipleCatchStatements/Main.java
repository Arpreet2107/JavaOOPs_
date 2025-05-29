// Java Program to Demonstrate try catch block 
// with multiple catch statements
public class Main {
    public static void main(String[] args) {
        try {

            // ArithmeticException
            int res = 10 / 0;
            System.out.println("Result: " + res);

            // NullPointerException
            String s = null;
            if (s != null) {
                System.out.println(s.length());
            } else {
                System.out.println("String is null");
            }
        }
        catch (ArithmeticException e) {
            System.out.println(
                "Caught ArithmeticException: " + e);
        }
        catch (NullPointerException e) {
            System.out.println(
                "Caught NullPointerException: " + e);
        }
    }
}