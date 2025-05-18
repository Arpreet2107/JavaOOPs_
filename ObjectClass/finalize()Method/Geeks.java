// Demonstrate working of finalize()
public class Geeks {
    public static void main(String[] args) {
      
        Geeks t = new Geeks();
        System.out.println(t.hashCode());

        t = null;

        // calling garbage collector
        System.gc();

        System.out.println("end");
    }

    @Override protected void finalize()
    {
        System.out.println("finalize method called");
    }
}