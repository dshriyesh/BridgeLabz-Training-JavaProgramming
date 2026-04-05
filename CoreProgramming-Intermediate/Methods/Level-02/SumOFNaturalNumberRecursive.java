// Write a program to find the sum of n natural numbers using recursive method and compare
// the result with the formulae n*(n+1)/2 and show the result from both computations is correct.
// Hint =>
// a. Take the user input number and check whether it's a Natural number
// b. Write a Method to find the sum of n natural numbers using recursion
// c. Write a Method to find the sum of n natural numbers using the formulae n*(n+1)/2
// d. Compare the two results and print the result

import java.util.*;
public class SumOFNaturalNumberRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number (n): ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive natural number.");
        } else {
            // result from recursive method
            int recursiveResult = sumRecursive(n);
            
            // result from formula method
            int formulaResult = sumFormula(n);

            // Compare results
            System.out.println("Result using Recursion: " + recursiveResult);
            System.out.println("Result using Formula: " + formulaResult);

            if (recursiveResult == formulaResult) {
                System.out.println("Both computations are correct and match!");
            } else {
                System.out.println("The results do not match.");
            }
        }
        
    }

    // Recursive Method
    public static int sumRecursive(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumRecursive(n - 1);
    }

    // Formula Method: n * (n + 1) / 2
    public static int sumFormula(int n) {
        return (n * (n + 1)) / 2;
    }
}
