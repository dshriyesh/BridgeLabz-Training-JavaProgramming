// Write a program to count down the number from the user input value to 1 using a while loop
// for a rocket launch

import java.util.Scanner;
public class CounterProgramm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the countdown starting number: ");
        int counter = scanner.nextInt();

        System.out.println("Preparing for takeoff...");
        while (counter >= 1) {
            // c. Print the value of the counter
            System.out.println(counter + "...");

            counter--;
        }
    }
}
