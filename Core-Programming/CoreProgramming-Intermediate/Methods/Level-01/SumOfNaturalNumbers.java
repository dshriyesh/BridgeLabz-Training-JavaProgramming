// Write a program to find the sum of n natural numbers using loop
// Hint => Get integer input from the user. Write a Method to find the sum of n natural numbers
// using loop

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (n): ");
        int n = scanner.nextInt();

        if (n >= 0) {
            int result = findSum(n);
            System.out.println("The sum of the first " + n + " natural numbers is: " + result);
        } else {
            System.out.println("Invalid input. Please enter a positive integer.");
        }

        scanner.close();
    }

    public static int findSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
