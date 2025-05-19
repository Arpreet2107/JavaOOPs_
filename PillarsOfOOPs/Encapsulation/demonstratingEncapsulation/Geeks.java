//Java program to demonstrate the encapsulation concept
class Person{
    //Encapsulating the name and age only approchable and used using methods definded
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age=age;
    }
}

//Driver class
public class Geeks{
    //main function 
    public static void main(String[] args){
        //Person object created
        Person p = new Person();
        p.setName("Sweta");
        p.setAge(20);

        //using methods to get the values from the variables
        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
    }
}