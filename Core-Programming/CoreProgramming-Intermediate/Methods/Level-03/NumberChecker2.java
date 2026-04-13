// Extend or Create a NumberChecker utility class and perform following task. Call from
// main() method the different methods and display results. Make sure all are static methods
// Hint =>
// a. Method to find the count of digits in the number and a Method to Store the digits of the
// number in a digits array
// b. Method to find the sum of the digits of a number using the digits array
// c. Method to find the sum of the squares of the digits of a number using the digits array.
// Use Math.pow() method
// d. Method to Check if a number is a harshad number using a digits array. A number is
// called a Harshad number if it is divisible by the sum of its digits. For e.g. 21
// e. Method to find the frequency of each digit in the number. Create a 2D array to store the
// frequency with digit in the first column and frequency in the second column.

import java.util.Scanner;

public class NumberChecker2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Digit count & array
        int count = digitCount(num);
        System.out.println("Digit Count: " + count);

        int[] digits = digitArray(num);

        // Sum of digits
        int sum = sumOfDigits(digits);
        System.out.println("Sum of digits: " + sum);

        // Sum of squares
        int sumSquares = sumOfSquares(digits);
        System.out.println("Sum of squares: " + sumSquares);

        // Harshad number
        if (isHarshadNumber(num, digits)) {
            System.out.println(num + " is a Harshad number");
        } else {
            System.out.println(num + " is not a Harshad number");
        }

        // Frequency of digits
        int[][] freq = digitFrequency(digits);
        System.out.println("Digit Frequency:");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i][1] > 0) {
                System.out.println("Digit " + freq[i][0] + " → " + freq[i][1] + " times");
            }
        }

        sc.close();
    }

    // Count digits
    public static int digitCount(int num) {
        return String.valueOf(num).length();
    }

    // Store digits in array
    public static int[] digitArray(int num) {
        String str = String.valueOf(num);
        int[] arr = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i) - '0';
        }
        return arr;
    }

    // Sum of digits
    public static int sumOfDigits(int[] arr) {
        int sum = 0;
        for (int digit : arr) {
            sum += digit;
        }
        return sum;
    }

    // Sum of squares of digits
    public static int sumOfSquares(int[] arr) {
        int sum = 0;
        for (int digit : arr) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Harshad number check
    public static boolean isHarshadNumber(int num, int[] arr) {
        int sum = sumOfDigits(arr);
        return num % sum == 0;
    }

    // Frequency of digits (0–9)
    public static int[][] digitFrequency(int[] arr) {
        int[][] freq = new int[10][2];

        // Initialize digits
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i; // digit
            freq[i][1] = 0; // frequency
        }

        // Count frequency
        for (int digit : arr) {
            freq[digit][1]++;
        }

        return freq;
    }
}
