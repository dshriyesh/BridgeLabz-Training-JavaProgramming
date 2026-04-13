// Create a program to find the maximum number of handshakes among students.
// Hint =>
// a. Get integer input for the numberOfStudents variable.
// b. Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of
// possible handshakes.
// c. Write a method to use the combination formulae to calculate the number of handshakes
// d. Display the number of possible handshakes.

import java.util.Scanner;

public class Handshakes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        if (numberOfStudents >= 0) {
            int result = calculateHandshakes(numberOfStudents);
            System.out.println("The maximum number of handshakes is: " + result);
        } else {
            System.out.println("Number of students cannot be negative.");
        }

        scanner.close();
    }

    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }
}

