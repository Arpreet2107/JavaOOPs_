// Java program to demonstrate inheritance in
// interfaces.
import java.io.*;

interface IntfA 
{
    void geekName();
}

interface IntfB extends IntfA 
{
    void geekInstitute();
}

// class implements both interfaces and provides
// implementation to the method.
class Sample implements IntfB 
{
  
    @Override 
    public void geekName() {
        System.out.println("Rohit");
    }

    @Override 
    public void geekInstitute() {
        System.out.println("JIIT");
    }

    public static void main(String[] args)
    {
        Sample ob1 = new Sample();

        // calling the method implemented
        // within the class.
        ob1.geekName();
        ob1.geekInstitute();
    }
}