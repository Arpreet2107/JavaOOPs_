//Driver Code Starts
// working of interface inside a class
import java.util.*;

//Driver Code Ends
// Parent Class
class Parent {
  
  	// Nested Interface
    interface Test {
        void show();
    }
}

// Child Class
class Child implements Parent.Test {
    public void show()
//Driver Code Starts
    {
        System.out.println("show method of interface");
    }
}

class GFG 
{
    public static void main(String[] args)
    {
      	// instance of Parent class
      	// with Nested Interface
        Parent.Test obj;
      
      	// Instance of Child class
        Child t = new Child();
        
      	obj = t;
        obj.show();
    }
}
//Driver Code Ends