// Write a program that takes a year as input and outputs the Year is a Leap Year or not
// Hint =>
// a. The LeapYear program only works for year >= 1582, corresponding to a year in the
// Gregorian calendar.
// b. Also Leap year is divisible by 4 and not divisible by 100 or divisible by 400
// c. Write a method to check for Leap Year using the conditions a and b

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year");
        } else {
            if (year < 1582) {
                System.out.println("The year " + year + " is before the Gregorian calendar (1582).");
            } else {
                System.out.println(year + " is not a Leap Year");
            }
        }

        scanner.close();
    }

    public static boolean isLeapYear(int year) {
        if (year < 1582) {
            return false;
        }

        // b. Divisible by 4 AND (not divisible by 100 OR divisible by 400)
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}
