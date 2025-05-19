//kJava program to illutrate the concept of single inheritance
import java.io.*;
import java.lang.*;
import java.util.*;

//Parent class 
class One{
    public void print_greek(){
        System.out.println("Hello! My name is Arpreet.");
    }
}

class Two extends One{
    public void print_for(){
        System.out.println("Im going to arise, each and every second as the time counts");
    }
    //Driver class
    public class Main{
        //Main function
        public static void main( String[] args){
            Two g = new Two();
            g.print_greek();
            g.print_for();
        }
    }
}