// multiple inheritance in interfaces

interface intfA 
{
    void geekName();
}

interface intfB 
{
    void geekInstitute();
}

// always remember that interfaces always 
// extends interface but a class always 
// implements a interface
interface intfC extends intfA, intfB {
    void geekBranch();
}

// class implements both interfaces and provides
// implementation to the method.
class sample implements intfC 
{
    @Override
    public void geekName() {
        System.out.println("Rohit"); 
    }

    @Override
    public void geekInstitute() {
        System.out.println("JIIT");
    }

    @Override
    public void geekBranch() { 
        System.out.println("CSE"); 
    }

    public static void main(String[] args)
    {
        sample ob1 = new sample();

        // calling the method implemented
        // within the class.
        ob1.geekName();
        ob1.geekInstitute();
        ob1.geekBranch();
    }
}