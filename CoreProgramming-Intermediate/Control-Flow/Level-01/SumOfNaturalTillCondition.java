import java.util.Scanner;

public class SumOfNaturalTillCondition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number (n): ");
        int n = scanner.nextInt();

        // Check whether it's a Natural number
        if (n >= 1) {
            // Compute using formula n * (n + 1) / 2
            int formulaSum = n * (n + 1) / 2;

            //Compute using while loop
            int loopSum = 0;
            int current = 1;
            while (current <= n) {
                loopSum += current;
                current++;
            }
            System.out.println("Sum using Formula: " + formulaSum);
            System.out.println("Sum using While Loop: " + loopSum);

            if (formulaSum == loopSum) {
                System.out.println("Success! Both results are identical.");
            } else {
                System.out.println("Error: The results do not match.");
            }

        } else {
            System.out.println("The number " + n + " is not a natural number.");
        }
    }
}
