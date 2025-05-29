// Ternary operator to avoid NullPointerException

public class Main {
    public static void main(String[] args) {
      
        // Initializing String variable
        // with null value
        String s = null;
        String m
            = (s == null) ? "" : s.substring(0, 5);

        System.out.println(m);

        // Initializing String variable
        // with null value
        s = "Geeksforgeeks";
        m = (s == null) ? "" : s.substring(0, 5);
        System.out.println(m);
    }
}