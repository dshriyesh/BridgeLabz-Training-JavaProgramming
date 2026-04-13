// Create a program to find the power of a number.
// Hint =>
// a. Get integer input for two variables - number and power and check for positive integer
// b. Create a result variable with an initial value of 1.
// c. Run a for loop from i = 1 to i <= power. In each iteration of the loop, multiply

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Enter the base number: ");
        int number = scanner.nextInt();

        System.out.print("Enter the power (exponent): ");
        int power = scanner.nextInt();

        if (number >= 0 && power >= 0) {

            long result = 1;
            for (int i = 1; i <= power; i++) {
                result = result * number;
            }

            System.out.println(number + " raised to the power of " + power + " is: " + result);
        } else {
            System.out.println("Please enter positive integers.");
        }
    }
}
