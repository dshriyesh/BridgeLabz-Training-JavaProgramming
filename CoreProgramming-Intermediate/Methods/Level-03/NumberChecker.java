// Extend or Create a NumberChecker utility class and perform following task. Call from
// main() method the different methods and display results. Make sure all are static methods
// Hint =>
// a. Method to Find the count of digits in the number
// b. Method to Store the digits of the number in a digits array
// c. Method to Check if a number is a duck number using the digits array. A duck number is a
// number that has a non-zero digit present in it
// d. Method to check if the number is a armstrong number using the digits array. Armstrong
// number is a number that is equal to the sum of its own digits raised to the power of the
// number of digits. Eg: 153 = 1^3 + 5^3 + 3^3
// e. Method to find the largest and second largest elements in the digits array. Use
// Integer.MIN_VALUE to initialize the variable.
// f. Method to find the the smallest and second smallest elements in the digits array. Use
// Integer.MAX_VALUE to initialize the variable.

import java.util.Scanner;

public class NumberChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        System.out.println("Count of digits is: " + digitCount(num));

        int[] arr = digitArray(num);

        // Duck number
        if (isDuckNumber(arr)) {
            System.out.println(num + " is a Duck number");
        } else {
            System.out.println(num + " is not a Duck number");
        }

        // Armstrong number
        if (isArmstrongNumber(arr, num)) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }

        // Largest & second largest
        int[] largest = largestValue(arr);
        System.out.println("Largest: " + largest[0] + ", Second Largest: " + largest[1]);

        // Smallest & second smallest
        int[] smallest = smallestValue(arr);
        System.out.println("Smallest: " + smallest[0] + ", Second Smallest: " + smallest[1]);

        sc.close();
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

    // Count digits
    public static int digitCount(int num) {
        return String.valueOf(num).length();
    }

    // Duck number check (at least one zero)
    public static boolean isDuckNumber(int[] arr) {
        for (int digit : arr) {
            if (digit == 0) {
                return true;
            }
        }
        return false;
    }

    // Armstrong number check
    public static boolean isArmstrongNumber(int[] arr, int num) {
        int power = arr.length;
        int sum = 0;

        for (int digit : arr) {
            sum += Math.pow(digit, power);
        }

        return sum == num;
    }

    // Largest and second largest
    public static int[] largestValue(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }
        return new int[]{max, secondMax};
    }

    // Smallest and second smallest
    public static int[] smallestValue(int[] arr) {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < min) {
                secondMin = min;
                min = num;
            } else if (num < secondMin && num != min) {
                secondMin = num;
            }
        }
        return new int[]{min, secondMin};
    }
}