// Getting the size of a linked list
import java.io.*;
import java.util.LinkedList;

public class Main {
    
    public static void main(String args[]) {
        
        LinkedList<String> list = new LinkedList<String>();
        list.add("Geeks for Geeks ");
        list.add("is best ");
        
        // Displaying the size of the list
        System.out.println("The size of the linked list is: " + list.size());
    }
}