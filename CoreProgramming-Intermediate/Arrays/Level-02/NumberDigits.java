// 3. Create a program to store the digits of the number in an array and find the largest and
// second largest element of the array.
// Hint =>
// a. Create a number variable and Take user input.
// b. Define an array to store the digits. Set the size of the array to maxDigit variable initially
// set to 10
// c. Create an integer variable index with the value 0 to reflect the array index.
// d. Use a loop to iterate until the number is not equal to 0.
// e. Remove the last digit from the number in each iteration and add it to the array.
// f. Increment the index by 1 in each iteration and if the index count equals maxDigit then
// break out of the loop and the remaining digits are not added to the array
// g. Define variable to store largest and second largest digit and initialize it to zero
// h. Loop through the array and use conditional statements to find the largest and second
// largest number in the array
// i. Finally display the largest and second-largest number

import java.util.Scanner;

public class NumberDigits {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];

        int index = 0;

        while (num != 0) {

            int digit = num % 10;
            digits[index++] = digit;

            num = num / 10;

            if (index == maxDigit) {
                break;
            }
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < index; i++) {

            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("\nDigits stored:");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }

        System.out.println("\n\nLargest digit: " + largest);

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("Second largest digit: Not available");
        } else {
            System.out.println("Second largest digit: " + secondLargest);
        }

    }
}
