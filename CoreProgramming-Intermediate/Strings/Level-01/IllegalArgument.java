// 6. Write a program to demonstrate IllegalArgumentException
// Hint =>
// a. Define a variable of type String and take user input to assign a value
// b. Write a Method to generate the Exception. Here use the subString() and set the start
// index to be greater than the end index. This will generate a runtime exception and
// abruptly stop the program.
// c. Write the Method to demonstrate IllegalArgumentException. Here use the
// subString() and set the start index to be greater than the end index. This will generate
// a runtime exception. Use the try-catch block to handle the IllegalArgumentException
// and the generic runtime exception
// d. From the main Firstly call the method to generate the Exception then call the method to
// handle the RuntimeException

import java.util.Scanner;

public class IllegalArgument {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a string: ");
        String text = sc.next();

        try {
            generateException(text);
        } catch (Exception e) {
            System.out.println("Exception caught in main: " + e);
        }

        System.out.println("\nNow handling inside method:\n");

        handleException(text);

        sc.close();
    }

    public static void generateException(String text) {
        int start = 5;
        int end = 2; 
        System.out.println("Substring: " + text.substring(start, end));
    }

    public static void handleException(String text) {
        int start = 5;
        int end = 2;

        try {
            System.out.println("Substring: " + text.substring(start, end));
        } 
        catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled: " + e);
        } 
        catch (RuntimeException e) {
            System.out.println("RuntimeException handled: " + e);
        }

        System.out.println("Program continues after handling exception...");
    }
}
