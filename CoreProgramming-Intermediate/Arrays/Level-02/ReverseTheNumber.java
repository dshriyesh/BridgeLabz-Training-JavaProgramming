// 5. Create a program to take a number as input and reverse the number. To do this, store the
// digits of the number in an array and display the array in reverse order
// Hint =>
// a. Take user input for a number.
// b. Find the count of digits in the number.
// c. Find the digits in the number and save them in an array
// d. Create an array to store the elements of the digits array in reverse order
// e. Finally, display the elements of the array in reverse order

import java.util.Scanner;

public class ReverseTheNumber {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = Math.abs(num); // handle negative
        int count = 0;
        int t = temp;

        while (t != 0) {
            t = t / 10;
            count++;
        }
        if (count == 0) count = 1;

        int[] digits = new int[count];

        int index = 0;
        while (temp != 0) {
            digits[index++] = temp % 10;
            temp = temp / 10;
        }

        if (index == 0) {
            digits[index++] = 0;
        }

        // reverse array
        int[] reverse = new int[count];

        for (int i = 0; i < count; i++) {
            reverse[i] = digits[count - 1 - i];
        }

        System.out.println("\nDigits stored:");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i] + " ");
        }

        System.out.println("\n\nReversed number (array form):");
        for (int i = 0; i < count; i++) {
            System.out.print(reverse[i] + " ");
        }
    }
}
