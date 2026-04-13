// 8. Write a program to demonstrate ArrayIndexOutOfBoundsException
// Hint =>
// a. Define a variable of array of names and take input from the user
// b. Write a Method to generate the Exception. Here access index larger then the length of
// the array. This will generate a runtime exception and abruptly stop the program.
// c. Write the Method to demonstrate ArrayIndexOutOfBoundsException. Here access
// index larger then the length of the array. This will generate a runtime exception. Use the
// try-catch block to handle the ArrayIndexOutOfBoundsException and the generic
// runtime exception
// d. From the main Firstly call the method to generate the Exception then call the method to
// handle the RuntimeException

import java.util.Scanner;

public class ArrayIndexOutOfBond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[] names = new String[n];

        System.out.println("Enter names:");
        for (int i = 0; i < n; i++) {
            names[i] = sc.nextLine();
        }

        try {
            generateException(names);
        } catch (Exception e) {
            System.out.println("Exception caught in main: " + e);
        }

        System.out.println("\nNow handling inside method:\n");

        handleException(names);

        sc.close();
    }

    public static void generateException(String[] arr) {
        // Access index beyond array length
        System.out.println("Accessing element: " + arr[arr.length]);
    }

    public static void handleException(String[] arr) {
        try {
            System.out.println("Accessing element: " + arr[arr.length]);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled: " + e);
        } 
        catch (RuntimeException e) {
            System.out.println("RuntimeException handled: " + e);
        }

        System.out.println("Program continues after handling exception...");
    }
}
