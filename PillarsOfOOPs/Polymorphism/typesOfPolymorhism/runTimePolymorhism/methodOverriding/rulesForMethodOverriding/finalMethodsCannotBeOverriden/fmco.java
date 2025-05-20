// A Java program to demonstrate that
// final methods cannot be overridden

class Parent {
    // Can't be overridden
    final void show() {}
}

class Child extends Parent {
    // This would produce error
    // void show() {}
}

public class fmco {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.show();

        // Using Child to avoid "never used" warning
        Child c = new Child();
        c.show();
    }
}