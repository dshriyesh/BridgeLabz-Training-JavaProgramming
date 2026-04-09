// 4. Rework the program 2, especially the Hint f where if index equals maxDigit, we break from
// the loop. Here we want to modify to Increase the size of the array i,e maxDigit by 10 if the
// index is equal to maxDigit. This is done to consider all digits to find the largest and
// second-largest number
// Hint =>
// a. In Hint f inside the loop if the index is equal to maxDigit, increase maxDigit and make
// digits array to store more elements.
// b. To do this, we need to create a new temp array of size maxDigit, copy from the current
// digits array the digits into the temp array, and assign the current digits array to the temp
// array
// c. Now the digits array will be able to store all digits of the number

import java.util.Scanner;

public class DynamicNumberDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();


        num = Math.abs(num);

        int maxDigit = 10;
        int[] digits = new int[maxDigit];

        int index = 0;

        // Extract digits with dynamic resizing
        while (num != 0) {

            if (index == maxDigit) {

                maxDigit += 10;

                int[] temp = new int[maxDigit];

                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }

                digits = temp; 
            }

            digits[index++] = num % 10;
            num = num / 10;
        }

        // largest and second largest
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
