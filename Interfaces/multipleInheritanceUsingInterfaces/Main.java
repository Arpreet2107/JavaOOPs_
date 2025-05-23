/*Example: This example demonstrates how a class can implement multiple interfaces (Add and Sub) to provide functionality for both addition and subtraction operations.*/
interface Add{
    int add(int a,int b);
}

// Sub interface
interface Sub{
  	int sub(int a,int b);
}

// Calculator class implementing
// Add and Sub 
class Cal implements Add , Sub
{
	// Method to add two numbers
	@Override
	public int add(int a,int b){
		return a+b;
	}
  
	// Method to sub two numbers
	@Override
	public int sub(int a,int b){
		return a-b;
	}
  
}

public class Main{
    // Main Method
    public static void main (String[] args) 
    {
      	// instance of Cal class
      	Cal x = new Cal();
      
      	System.out.println("Addition : " + x.add(2,1));
      	System.out.println("Substraction : " + x.sub(2,1));
      
    }
}