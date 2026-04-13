// Write a program to find the smallest and the largest of the 3 numbers.
// Hint =>
// a. Take user input for 3 numbers
// b. Write a single method to find the smallest and largest of the three numbers

import java.util.Scanner;

public class SmallestAndLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int n2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int n3 = scanner.nextInt();

        int[] results = findSmallestAndLargest(n1, n2, n3);

        System.out.println("Smallest number: " + results[0]);
        System.out.println("Largest number: " + results[1]);

        scanner.close();
    }

    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = number1;
        int largest = number1;

        if (number2 < smallest) smallest = number2;
        if (number3 < smallest) smallest = number3;

        if (number2 > largest) largest = number2;
        if (number3 > largest) largest = number3;

        return new int[]{smallest, largest};
    }
}
