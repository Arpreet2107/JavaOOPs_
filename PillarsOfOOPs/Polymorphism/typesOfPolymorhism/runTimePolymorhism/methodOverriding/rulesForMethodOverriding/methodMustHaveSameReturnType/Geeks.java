class SuperClass {
    public Object method()
    {
        System.out.println(
            "This is the method in SuperClass");
        return new Object(); 
    }
}

class SubClass extends SuperClass {
    // Covariant return type
    // The return type of the method in the subclass
    @Override
    public String method()
    {
        System.out.println(
            "This is the method in SubClass");
        return "Hello, World!";
      // having the Covariant return type
    }
}

public class Geeks {
    public static void main(String[] args)
    {
        SuperClass obj1 = new SuperClass();
        obj1.method();

        SubClass obj2 = new SubClass();
        obj2.method();
    }
}