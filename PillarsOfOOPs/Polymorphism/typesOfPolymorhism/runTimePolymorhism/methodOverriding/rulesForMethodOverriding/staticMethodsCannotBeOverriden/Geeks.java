// Java program to show that
// if the static method is redefined by a derived
// class, then it is not overriding, it is hiding
class Parent {
    // Static method in base class
    // which will be hidden in subclass
    static void m1()
    {
        System.out.println("From parent "
                           + "static m1()");
    }
    // Non-static method which will
    // be overridden in derived class
    void m2()
    {
        System.out.println(
            "From parent "
            + "non - static(instance) m2() ");
    }
}

class Child extends Parent {
    // This method hides m1() in Parent
    static void m1()
    {
        System.out.println("From child static m1()");
    }

    // This method overrides m2() in Parent
    @Override public void m2()
    {
        System.out.println(
            "From child "
            + "non - static(instance) m2() ");
    }
}

// Driver class
public class Geeks {
    public static void main(String[] args)
    {
        Parent obj1 = new Child();

        // here parents m1 called.
        // bcs static method can not overriden
        Parent.m1();

        // Here overriding works
        // and Child's m2() is called
        obj1.m2();

        // Call Child's static m1() to use it and avoid the warning
        Child.m1();
    }
}