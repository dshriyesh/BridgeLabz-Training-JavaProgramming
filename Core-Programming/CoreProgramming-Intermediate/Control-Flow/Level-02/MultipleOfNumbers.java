// Create a program to find all the multiples of a number taken as user input below 100.
// Hint =>
// a. Get the input value for a variable named number. Check the number is a positive integer
// and less than 100.
// b. Run a for loop backward: from i = 100 to i = 1.
// c. Inside the loop, check if i perfectly divide the number. If true, print the number and
// continue the loop.

import java.util.Scanner;

public class MultipleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its multiples below 100: ");
        int number = scanner.nextInt();

        if (number > 0 && number < 100) {
            System.out.println("Multiples of " + number + " below 100 (counting backwards):");

            for (int i = 100; i >= 1; i--) {

                if (i % number == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println(); 
        } else {
            System.out.println("Invalid input. Please enter a positive integer less than 100.");
        }
    }
}
