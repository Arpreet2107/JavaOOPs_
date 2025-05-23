// Example: This example demonstrates level-wise implementation of interfaces and abstract classes, where each level adds more functionality, and the final class provides full implementation of all abstract methods.
// implementation Level wise

// Level 1
interface Bank {
    void deposit();
    void withdraw();
    void loan();
    void account();
}

// Level 2
abstract class Dev1 implements Bank {
    @Override
    public void deposit()
    {
        System.out.println("Your deposit Amount :" + 100);
    }
}

abstract class Dev2 extends Dev1 {
    @Override
    public void withdraw()
    {
        System.out.println("Your withdraw Amount :" + 50);
    }
}

// Level 3
class Dev3 extends Dev2 {
    @Override
    public void loan() {}

    @Override
    public void account() {}
}

// Level 4
public class Main 
{
    public static void main(String[] args)
    {
        Dev3 d = new Dev3();
        d.account();
        d.loan();
        d.deposit();
        d.withdraw();
    }
}