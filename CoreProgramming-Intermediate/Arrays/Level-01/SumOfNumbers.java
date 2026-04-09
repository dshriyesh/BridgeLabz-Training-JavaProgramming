// Write a program to store multiple values in an array up to a maximum of 10 or until the user
// enters a 0 or a negative number. Show all the numbers as well as the sum of all numbers
// Hint =>
// a. Create a variable to store an array of 10 elements of type double as well as a variable to
// store the total of type double initializes to 0.0. Also, the index variable is initialized to 0
// for the array
// b. Use infinite while loop as in while (true)
// c. Take the user entry and check if the user entered 0 or a negative number to break the
// loop
// d. Also, break from the loop if the index has a value of 10 as the array size is limited to 10.
// e. If the user entered a number other than 0 or a negative number inside the while loop
// then assign the number to the array element and increment the index value
// f. Take another for loop to get the values of each element and add it to the total
// g. Finally display the total value

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] arr = new double[10]; // max 10 elements
        double total = 0.0;
        int index = 0;

        while (true) {

            System.out.print("Enter a number: ");
            double num = sc.nextDouble();

            if (num <= 0) {
                break;
            }

            if (index == 10) {
                System.out.println("Array is full!");
                break;
            }

            // Store value
            arr[index] = num;
            index++;
        }

        System.out.println("\nEntered Numbers:");
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
            total += arr[i];
        }

        System.out.println("\n\nTotal Sum = " + total);
    }
}
