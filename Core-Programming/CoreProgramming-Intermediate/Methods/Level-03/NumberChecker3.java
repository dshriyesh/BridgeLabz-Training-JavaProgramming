// Extend or Create a NumberChecker utility class and perform following task. Call from
// main() method the different methods and display results. Make sure all are static methods
// Hint =>
// a. Method to find the count of digits in the number and a Method to Store the digits of the
// number in a digits array
// b. Method to reverse the digits array
// c. Method to compare two arrays and check if they are equal
// d. Method to check if a number is a palindrome using the Digits. A palindrome number is a
// number that remains the same when its digits are reversed.
// e. Method to Check if a number is a duck number using the digits array. A duck number is a
// number that has a non-zero digit present in it

import java.util.Arrays;
import java.util.Scanner;

public class NumberChecker3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Digit count & array
        int count = digitCount(num);
        System.out.println("Digit Count: " + count);

        int[] digits = digitArray(num);
        System.out.println("Original Digits: " + Arrays.toString(digits));

        // Reverse array
        int[] reversed = reverseArray(digits);
        System.out.println("Reversed Digits: " + Arrays.toString(reversed));

        // Compare arrays
        boolean isEqual = compareArrays(digits, reversed);
        System.out.println("Arrays Equal? " + isEqual);

        // Palindrome check
        if (isPalindrome(digits)) {
            System.out.println(num + " is a Palindrome number");
        } else {
            System.out.println(num + " is NOT a Palindrome number");
        }

        // Duck number check
        if (isDuckNumber(digits)) {
            System.out.println(num + " is a Duck number");
        } else {
            System.out.println(num + " is NOT a Duck number");
        }

        sc.close();
    }

    // Count digits
    public static int digitCount(int num) {
        return String.valueOf(num).length();
    }

    // Convert number to digit array
    public static int[] digitArray(int num) {
        String str = String.valueOf(num);
        int[] arr = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i) - '0';
        }
        return arr;
    }

    // Reverse array
    public static int[] reverseArray(int[] arr) {
        int[] rev = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rev[i] = arr[arr.length - 1 - i];
        }
        return rev;
    }

    // Compare two arrays
    public static boolean compareArrays(int[] a, int[] b) {
        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    // Palindrome check using digits
    public static boolean isPalindrome(int[] arr) {
        int[] rev = reverseArray(arr);
        return compareArrays(arr, rev);
    }

    // Duck number check (contains at least one zero, not at first position)
    public static boolean isDuckNumber(int[] arr) {
        for (int i = 1; i < arr.length; i++) { // skip first digit
            if (arr[i] == 0) {
                return true;
            }
        }
        return false;
    }
}
