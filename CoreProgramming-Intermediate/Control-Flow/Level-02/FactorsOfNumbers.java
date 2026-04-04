// Create a program to find the factors of a number taken as user input.
// Hint =>
// a. Get the input value for a variable named number and check if it is a positive integer.
// b. Run a for loop from i = 1 to i < number. In each iteration of the loop, check if the number
// is perfectly divisible by i. If true, print the value of i.

import java.util.Scanner;

public class FactorsOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer to find its factors: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.print("The factors of " + number + " are: ");

            for (int i = 1; i <= number; i++) {

                if (number % i == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        } else {
            System.out.println("Invalid input. Please enter a positive integer greater than 0.");
        }
    }
}
