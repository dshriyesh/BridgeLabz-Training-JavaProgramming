// 10. Write a program FizzBuzz, take a number as user input and if it is a positive integer loop
// from 0 to the number and save the number, but for multiples of 3 save "Fizz" instead of the
// number, for multiples of 5 save "Buzz", and for multiples of both save "FizzBuzz". Finally,
// print the array results for each index position in the format Position 1 = 1, ..., Position 3 =
// Fizz,...
// Hint =>
// a. Create a String Array to save the results and
// b. Finally, loop again to show the results of the array based on the index position

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int num = sc.nextInt();
        if (num <= 0) {
            System.out.println("Error: Please enter a positive number!");
            return;
        }

        // Step a: Create array
        String[] result = new String[num + 1];

        // Step b: Fill array
        for (int i = 1; i <= num; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                result[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                result[i] = "Fizz";
            } else if (i % 5 == 0) {
                result[i] = "Buzz";
            } else {
                result[i] = String.valueOf(i);
            }
        }

        // Step c: Display results
        System.out.println("\nFizzBuzz Result:");
        for (int i = 1; i <= num; i++) {
            System.out.println("Position " + i + " = " + result[i]);
        }
    }
}
