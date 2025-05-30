// A Java program to demonstrate that overridden
// method can be called from sub-class
// Base Class
class Parent {
    void show() { System.out.println("Parent's show()"); }
}

// Inherited class
class Child extends Parent {
    // This method overrides show() of Parent
    @Override void show()
    {
        super.show();
        System.out.println("Child's show()");
    }
}

// Driver class
public class Main{
    public static void main(String[] args)
    {
        Parent o = new Child();
        o.show();
    }
}