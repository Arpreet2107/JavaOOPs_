// A Java Program to show implementation
// of Stack using ArrayDeque
import java.util.*;

    public class Main { 
    public static void main (String[] args) {
        Deque<Character> stack = new ArrayDeque<>();
        stack.push('A');
        stack.push('B');
        System.out.println(stack.peek());
        System.out.println(stack.pop());
    }
}