// 13. Rewrite the program to find all the multiples of a number below 100 using while loop.
// Hint =>
// a. Get the input value for a variable named number. Check the number is a positive integer
// and less than 100.
// b. Create a counter variable and assign counter = number - 1; Use a while till the
// counter is > 1
// c. Inside the loop, check if the counter perfectly divides the number. If true, print the
// number and continue the loop.

import java.util.Scanner;

public class MultipleOfNumberWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (1-99): ");
        int number = scanner.nextInt();

        if (number > 0 && number < 100) {
            int counter = number - 1;

            System.out.println("Finding values below " + number + " that divide it perfectly:");
            while (counter > 1) {
                if (number % counter == 0) {
                    // Print the counter value
                    System.out.println(counter);
                }
                counter--;
            }
        } else {
            System.out.println("Please enter a positive integer less than 100.");
        }
    }
}
