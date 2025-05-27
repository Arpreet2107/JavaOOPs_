import java.lang.Cloneable;

// Making class A cloneable using
// cloneable interface
class A implements Cloneable
{
    int i;
  
    // A class constructor
    public A(int i) {
        this.i = i;
    }

    // Overriding clone() method
    // by simply calling Object class
    // clone() method.
    @Override
    protected Object clone() 
      throws CloneNotSupportedException
    {
        return super.clone();
    }
}

public class Test
{
    public static void main(String[] args)
        throws CloneNotSupportedException
    {
        A a = new A(20);

        // cloning 'a' and holding
        // new cloned object reference in b

        // down-casting as clone() return type is Object
        A b = (A)a.clone();

        System.out.println(b.i);
    }
}