// Write a program to demonstrate StringIndexOutOfBoundsException
// Hint =>
// a. Define a variable of type String and take user input to assign a value
// b. Write a Method to generate the Exception. Access the index using charAt() beyond the
// length of the String. This will generate a runtime exception and abruptly stop the
// program.
// c. Write the Method to demonstrate StringIndexOutOfBoundsException. Access the
// index using charAt() beyond the length of the String. Then write try catch block for
// Exception while accessing the String method
// d. From the main Firstly call the method to generate the Exception then call the method to
// handle the RuntimeException

import java.util.Scanner;

public class IndexOutOfBound {
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

        System.out.println("Character: " + text.charAt(text.length()));
    }

    public static void handleException(String text) {
        try {
            System.out.println("Character: " + text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception handled: " + e);
        }

        System.out.println("Program continues after handling exception...");
    }
}
