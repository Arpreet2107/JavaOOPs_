// protected specifier for nested interface

class MyParent {
    protected interface Test {
        void show();
    }
}

class Child implements MyParent.Test {
    @Override
    public void show(){
        System.out.println("show method of interface");
    }
}

// Driver Class
public class Main 
{
    public static void main(String[] args)
    {
        MyParent.Test obj;
        Child t = new Child();
        obj = t;
        obj.show();
    }
}