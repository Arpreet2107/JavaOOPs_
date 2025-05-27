// Interface in Another Interface
// An interface can be declared inside another interface also. We mention the interface as Parent.Test where Parent is the name of the interface in which it is nested and Test is the name of the interface to be implemented. 
// working of interface inside another interface
// import java.util.*;

// Nested Interface-Interface
interface Parent {
    interface Test {
        void show();
    }
}

class Child implements Parent.Test {
    @Override
    // Implementing the show method of the nested interface
    public void show() {
        System.out.println("show method of interface");
    }
}


// Main Class
public class Main
{
    public static void main(String[] args)
    {
        Parent.Test obj;
        Child t = new Child();
        obj = t;
        obj.show();
    }
}