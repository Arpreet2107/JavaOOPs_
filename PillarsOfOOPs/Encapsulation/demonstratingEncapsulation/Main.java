//Encapsulation is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit.
//It is a protective barrier that keeps the data safe within the object and prevents outside code from directly accessing it.
//Java program to demostrate Emcapsulation
//Encapsulation is one of the four fundamental Object Oriented Programming (OOP) concepts.
//The other three are inheritance, polymorphism, and abstraction.   
//Encapsulation is a protective barrier that keeps the data safe within the object and prevents outside code from directly accessing it.
//Encapsulation is achieved by declaring the variables of a class as private and providing public setter and getter methods to modify and view the variables' values.
//The getter method is used to get the data from the private variable.
//The setter method is used to set or modify the data in the private variable.
//In this example, we have created a class named Programmer with a private variable name.
//We have provided public setter and getter methods to modify and view the name variable.
//The main method creates an object of the Programmer class and sets the name variable using the setter method.
//Then it retrieves the name variable using the getter method and prints it to the console.

class Programmer{
    private String name;

    //Geter and Setter for Name
    //Getter method is used to get the data
    public String getName(){
        return name;
    }

    //Setter method is used to set or modify the data
    public void setName(String name){
        this.name=name;
    }
}

public class Main{
    public static void main(String[] args){
        //Creating an object of the class
        Programmer p=new Programmer();

        //Setting the value of name
        p.setName("Arpreet Mahala");

        //Getting the value of name
        System.out.println("Programmer Name: "+p.getName());
    }
}