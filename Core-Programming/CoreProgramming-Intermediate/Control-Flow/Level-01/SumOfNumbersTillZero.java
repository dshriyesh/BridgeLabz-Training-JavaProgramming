// 10. Write a program to find the sum of numbers until the user enters 0
import java.util.Scanner;
public class SumOfNumbersTillZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        int input;

        System.out.println("Enter numbers to sum (enter 0 to stop):");

        input = scanner.nextInt();

        while (input != 0) {
            total += input;

            // Ask the user to input again
            System.out.print("Current total: " + total + ". Enter next number: ");
            input = scanner.nextInt();
        }
        System.out.println("The final sum is: " + total);
    }
}
