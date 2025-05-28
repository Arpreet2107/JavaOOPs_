// Java program to demonstrate the
// creation of the set object
// using the EnumSet class
import java.util.*;

enum Arp { CODE, LEARN, CONTRIBUTE, QUIZ, MCQ }
;

public class Main {

    public static void main(String[] args)
    {
        // Creating a set
        Set<Arp> s1;

        // Adding the elements
        s1 = EnumSet.of(Arp.QUIZ, Arp.CONTRIBUTE,
                          Arp.LEARN, Arp.CODE);

        System.out.println("Set 1: " + s1);
    }
}