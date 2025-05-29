// Demonstration of NullPointerException in Java
public class Geeks {
  
    public static void main(String[] args) {
      
        // Reference set to null
        String s = null; 
      
        // Throws NullPointerException
        System.out.println(s.length()); 
    }
}