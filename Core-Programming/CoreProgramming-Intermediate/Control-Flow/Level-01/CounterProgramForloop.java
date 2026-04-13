// Rewrite counter program to do the countdown using the for-loop
import java.util.Scanner;
public class CounterProgramForloop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the countdown starting number: ");
        int counter = scanner.nextInt();

        System.out.println("Preparing for takeoff...");
        for(int i=counter;i>=1;i--) {
            // c. Print the value of the counter
            System.out.println(i + "...");
        }
    }
}
