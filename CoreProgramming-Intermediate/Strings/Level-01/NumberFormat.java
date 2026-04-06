// Write a program to demonstrate NumberFormatException
// Hint =>
// a. Define a variable to take user input as a String
// b. Use Integer.parseInt() to generate this exception. Integer.parseInt() is a built-in
// function in java.lang.Integer class to extract the number from text. In case the text does
// not contain numbers the method will throw NumberFormatException which is a runtime
// exception
// c. Write a Method to generate the Exception. Use Integer.parseInt(text) to extract
// number from the text. This will generate a runtime exception and abruptly stop the
// program.
// d. Write the Method to demonstrate NumberFormatException. Use
// Integer.parseInt(text) to extract number from the text. This will generate a runtime
// exception. Use the try-catch block to handle the NumberFormatException as well as
// the generic runtime exception
// e. From the main Firstly call the method to generate the Exception then call the method to
// handle the RuntimeException

import java.util.Scanner;

public class NumberFormat {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a value: ");
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
        // This will throw NumberFormatException if input is not numeric
        int num = Integer.parseInt(text);
        System.out.println("Number: " + num);
    }

    public static void handleException(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println("Number: " + num);
        } 
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled: " + e);
        } 
        catch (RuntimeException e) {
            System.out.println("RuntimeException handled: " + e);
        }

        System.out.println("Program continues after handling exception...");
    }
}
