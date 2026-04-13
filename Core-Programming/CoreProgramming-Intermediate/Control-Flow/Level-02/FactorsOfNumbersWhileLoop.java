// Rewrite the above program 7 to find the factors of a number using the while loop
// Hint =>
// a. Get the input value for a variable named number and check if it is a positive integer.
// b. Create a counter variable and run the _**while**_ loop till the counter is less than the
// user input number. In each iteration of the loop, check if the number is perfectly divisible
// by the counter. If true, print the value of the counter.

import java.util.Scanner;
public class FactorsOfNumbersWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number > 0) {
  
            int counter = 1;
            
            System.out.print("The factors of " + number + " are: ");
            while (counter <= number) {
   
                if (number % counter == 0) {
                    System.out.print(counter + " ");
                }

                counter++;
            }
            System.out.println();
        } else {
            System.out.println("The number " + number + " is not a positive integer.");
        }
    }
}
