class Parent {
    void m1() throws RuntimeException
    {
        System.out.println("From parent m1()");
    }
}

class Child1 extends Parent {
    @Override void m1() throws RuntimeException
    {
        System.out.println("From child1 m1()");
    }
}

class Child2 extends Parent {
    @Override void m1() throws ArithmeticException
    {
        System.out.println("From child2 m1()");
    }
}

class Child3 extends Parent {
    @Override void m1()
    {
        System.out.println("From child3 m1()");
    }
}

class Child4 extends Parent {
    @Override void m1() throws Exception
    {
        // This will cause a compile-time error due to the
        // parent class method not declaring Exception
        System.out.println("From child4 m1()");
    }
}

public class MethodOverridingExample {
    public static void main(String[] args)
    {
        Parent p1 = new Child1();
        Parent p2 = new Child2();
        Parent p3 = new Child3();
        Parent p4 = new Child4();

        // Handling runtime exceptions for each child class
        // method
        try {
            p1.m1();
        }
        catch (RuntimeException e) {
            System.out.println("Exception caught: " + e);
        }

        try {
            p2.m1();
        }
        catch (RuntimeException e) {
            System.out.println("Exception caught: " + e);
        }

        try {
            p3.m1();
        }
        catch (Exception e) {
            System.out.println("Exception caught: " + e);
        }

        // Child4 throws a compile-time error due to
        // mismatched exception type
        try {
            p4.m1(); // This will throw a compile-time error
        }
        catch (Exception e) {
            System.out.println("Exception caught: " + e);
        }
    }
}