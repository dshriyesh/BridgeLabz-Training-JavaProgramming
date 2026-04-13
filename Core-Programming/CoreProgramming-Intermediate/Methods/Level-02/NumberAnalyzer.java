// Write a program to take user input for 5 numbers and check whether a number is positive or
// negative. Further for positive numbers check if the number is even or odd. Finally compare
// the first and last elements of the array and display if they are equal, greater, or less
// Hint =>
// a. Write a Method to Check whether the number is positive or negative
// b. Write a Method to check whether the number is even or odd
// c. Write a Method to compare two numbers and return 1 if number1 > number2 or 0 if both
// are equal or -1 if number1 < number2
// d. In the main program, Loop through the array using the length call the method
// isPositive() and if positive call method isEven() and print accordingly
// e. If the number is negative, print negative.
// f. Finally compare the first and last element of the array by calling the method compare()
// and display if they are equal, greater, or less

import java.util.Scanner;

public class NumberAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            int val = numbers[i];
            
            // if positive or negative
            if (isPositive(val)) {
                // If positive, check if even or odd
                if (isEven(val)) {
                    System.out.println(val + " is Positive and Even");
                } else {
                    System.out.println(val + " is Positive and Odd");
                }
            } else {
                System.out.println(val + " is Negative");
            }
        }

        //first and last elements
        int comparison = compare(numbers[0], numbers[numbers.length - 1]);

        if (comparison == 1) {
            System.out.println("First element is greater than the last.");
        } else if (comparison == 0) {
            System.out.println("First and last elements are equal.");
        } else {
            System.out.println("First element is less than the last.");
        }

    }

    //Method to check positive or negative
    public static boolean isPositive(int num) {
        return num >= 0;
    }

    //Method to check even or odd
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    // Compare method
    public static int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1;
        } else if (num1 == num2) {
            return 0;
        } else {
            return -1;
        }
    }
}
