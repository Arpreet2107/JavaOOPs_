// Superclass without exception declaration
class ParentClass {
    void method() {
        System.out.println("ParentClass method executed");
    }
}

// Subclass declaring an unchecked exception
class SubClass extends ParentClass {
    @Override
    void method() throws ArithmeticException {
        System.out.println("SubClass method executed");
        throw new ArithmeticException("Exception in SubClass");
    }

    public static void main(String[] args) {
        ParentClass s = new SubClass();
        try {
            s.method();
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}