// Java Program to Demonstrate
// Need of try-catch Clause
public class Main {

    public static void main(String[] args) {
      
        // Taking an array of size 4
        int[] arr = new int[4];
        // Assign values to the array
        for (int j = 0; j < arr.length; j++) {
            arr[j] = j * 10;
        }

        // Now this statement will cause an exception
        int i = arr[4];
        System.out.println("Value at index 4: " + i);

        // This statement will never execute
        // as above we caught with an exception
        System.out.println("Hi, I want to execute");
    }
}