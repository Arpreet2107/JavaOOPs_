// Java program to demonstrate overriding when
// superclass method does not declare an exception

class ParentClass {
    void m1() { System.out.println("From parent m1()"); }

    void m2() { System.out.println("From parent  m2()"); }
}

class Child extends ParentClass {
    @Override
    // no issue while throwing unchecked exception
    void m1() throws ArithmeticException
    {
        System.out.println("From child m1()");
    }

    @Override
    // compile-time error
    // issue while throwing checked exception
    void m2() throws Exception
    {
        System.out.println("From child m2");
    }
}

public class Main {
    public static void main(String[] args) {
        ParentClass obj = new Child();
        obj.m1();
        obj.m2(); // Call m2 to use the method
    }
}