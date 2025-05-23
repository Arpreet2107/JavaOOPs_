/*Example: This example demonstrates how interface inheritance works in Java, where one interface (B) extends another (A), and a class (GFG) implements all the methods from both interfaces.*/
interface A {
    void method1();
    void method2();
}

// B now includes method1
// and method2
interface B_Extended extends A {
    void method3();
}

// the class must implement
// all method of A and B_Extended.
class GFG implements B_Extended 
{
    @Override
    public void method1() {
        System.out.println("Method 1");
    }
  
    @Override
    public void method2() {
        System.out.println("Method 2");
    }
  
    @Override
    public void method3() {
        System.out.println("Method 3");
    }
  
  	public static void main(String[] args){
      	
      	// Instance of GFG class created
      	GFG x = new GFG();
      	
      	// All Methods Called
      	x.method1();
      	x.method2();
      	x.method3();
    }
}