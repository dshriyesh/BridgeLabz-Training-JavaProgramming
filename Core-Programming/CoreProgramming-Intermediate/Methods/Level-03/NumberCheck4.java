// Extend or Create a NumberChecker utility class and perform following task. Call from
// main() method the different methods and display results. Make sure all are static methods
// Hint =>
// a. Method to Check if a number is prime number. A prime number is a number greater than
// 1 that has no positive divisors other than 1 and itself.
// b. Method to Check if a number is a neon number. A neon number is a number where the
// sum of digits of the square of the number is equal to the number itself
// c. Method to Check if a number is a spy number. A number is called a spy number if the
// sum of its digits is equal to the product of its digits
// d. Method to Check if a number is an automorphic number. An automorphic number is a
// number whose square ends with the number itself. E.g. 5 is an automorphic number
// e. Method to Check if a number is a buzz number. A buzz number is a number that is either
// divisible by 7 or ends with 7

import java.util.Scanner;

public class NumberCheck4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // a. Prime
        if (isPrime(num)) {
            System.out.println(num + " is a Prime number");
        } else {
            System.out.println(num + " is NOT a Prime number");
        }

        // b. Neon
        if (isNeon(num)) {
            System.out.println(num + " is a Neon number");
        } else {
            System.out.println(num + " is NOT a Neon number");
        }

        // c. Spy
        if (isSpy(num)) {
            System.out.println(num + " is a Spy number");
        } else {
            System.out.println(num + " is NOT a Spy number");
        }

        // d. Automorphic
        if (isAutomorphic(num)) {
            System.out.println(num + " is an Automorphic number");
        } else {
            System.out.println(num + " is NOT an Automorphic number");
        }

        // e. Buzz
        if (isBuzz(num)) {
            System.out.println(num + " is a Buzz number");
        } else {
            System.out.println(num + " is NOT a Buzz number");
        }

        sc.close();
    }

    // a. Prime number
    public static boolean isPrime(int num) {
        if (num <= 1) return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // b. Neon number
    public static boolean isNeon(int num) {
        int square = num * num;
        int sum = 0;

        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }

        return sum == num;
    }

    // c. Spy number
    public static boolean isSpy(int num) {
        int sum = 0;
        int product = 1;

        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            product *= digit;
            num /= 10;
        }

        return sum == product;
    }

    // d. Automorphic number
    public static boolean isAutomorphic(int num) {
        int square = num * num;
        int temp = num;

        while (temp > 0) {
            if (temp % 10 != square % 10) {
                return false;
            }
            temp /= 10;
            square /= 10;
        }
        return true;
    }

    // e. Buzz number
    public static boolean isBuzz(int num) {
        return (num % 7 == 0) || (num % 10 == 7);
    }
}
