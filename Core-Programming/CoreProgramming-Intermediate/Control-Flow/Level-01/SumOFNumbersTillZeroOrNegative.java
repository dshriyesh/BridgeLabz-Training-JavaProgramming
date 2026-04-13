// Rewrite the program 10 to find the sum until the user enters 0 or a negative number using
// while loop and break statement
import java.util.Scanner;
public class SumOFNumbersTillZeroOrNegative {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        int total = 0;
        int input;

        System.out.println("Enter numbers to sum (enter 0 to stop):");

        input = scanner.nextInt();

        while (true) {
            if(input<=0) break;
            total += input;

            // Ask the user to input again
            System.out.print("Current total: " + total + ". Enter next number: ");
            input = scanner.nextInt();
        }
        System.out.println("The final sum is: " + total);
    }
}
