// Runnable Interface Implementation
public class Main
{
    private class RunnableImpl implements Runnable 
    {
      	// Overriding the run Method
      	@Override
        public void run()
        {
            System.out.println(Thread.currentThread().getName()
                             + ", executing run() method!");
        }
    }  
  
  	// Main Method
    public static void main(String[] args) 
    {    
      	System.out.println("Main thread is: "
                           + Thread.currentThread().getName());
      
      	// Creating Thread
        Thread t1 = new Thread(new Geeks().new RunnableImpl());
        
      	// Executing the Thread
      	t1.start();
    }
}