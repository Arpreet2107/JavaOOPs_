// Demonstrate working of getClass()
public class Geeks {
    public static void main(String[] args)
    {
        Object o = "GeeksForGeeks";
        Class<?> c = o.getClass();
        System.out.println("Class of Object o is: "
                           + c.getName());
    }
}