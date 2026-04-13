// Extend or Create a NumberChecker utility class and perform following task. Call from
// main() method the different methods and display results. Make sure all are static methods
// Hint =>
// a. Method to Check if a number is a perfect number. Perfect numbers are positive integers
// that are equal to the sum of their proper divisors
// b. Method to find the number is an abundant number. A number is called an abundant
// number if the sum of its proper divisors is greater than the number itself
// c. Method to find the number is a deficient number. A number is called a deficient number if
// the sum of its proper divisors is less than the number itself
// d. Method to Check if a number is a strong number. A number is called a strong number if
// the sum of the factorial of its digits is equal to the number itself

import java.util.Scanner;

public class NumberChecker5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // a. Perfect number
        if (isPerfect(num)) {
            System.out.println(num + " is a Perfect number");
        } else {
            System.out.println(num + " is NOT a Perfect number");
        }

        // b. Abundant number
        if (isAbundant(num)) {
            System.out.println(num + " is an Abundant number");
        } else {
            System.out.println(num + " is NOT an Abundant number");
        }

        // c. Deficient number
        if (isDeficient(num)) {
            System.out.println(num + " is a Deficient number");
        } else {
            System.out.println(num + " is NOT a Deficient number");
        }

        // d. Strong number
        if (isStrong(num)) {
            System.out.println(num + " is a Strong number");
        } else {
            System.out.println(num + " is NOT a Strong number");
        }

        sc.close();
    }

    // Helper: sum of proper divisors
    public static int sumOfDivisors(int num) {
        int sum = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum;
    }

    // a. Perfect number
    public static boolean isPerfect(int num) {
        return sumOfDivisors(num) == num;
    }

    // b. Abundant number
    public static boolean isAbundant(int num) {
        return sumOfDivisors(num) > num;
    }

    // c. Deficient number
    public static boolean isDeficient(int num) {
        return sumOfDivisors(num) < num;
    }

    // d. Strong number
    public static boolean isStrong(int num) {
        int temp = num;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }

        return sum == num;
    }

    // Helper: factorial
    public static int factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }
}
