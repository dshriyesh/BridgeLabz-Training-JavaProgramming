// Write a program to check whether a number is positive, negative, or zero.
// Hint => Get integer input from the user. Write a Method to return -1 for negative number, 1
// for positive number and 0 if number is zero

import java.util.Scanner;

public class NumberSignCheck {

    int checkNumber(int number) {
        if (number > 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int inputNumber = scanner.nextInt();

        NumberSignCheck obj = new NumberSignCheck();
        int status = obj.checkNumber(inputNumber);

        if (status == 1) {
            System.out.println(inputNumber + " is a Positive number.");
        } else if (status == -1) {
            System.out.println(inputNumber + " is a Negative number.");
        } else {
            System.out.println("The number is Zero.");
        }

    }
}
