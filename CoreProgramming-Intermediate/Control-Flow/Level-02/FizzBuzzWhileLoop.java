// Rewrite the program 4 FizzBuzz using the while loop
import java.util.Scanner;
public class FizzBuzzWhileLoop {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        if (n > 0) {

            while(n>=1){

                if (n % 3 == 0 && n% 5 == 0) {
                    System.out.println("FizzBuzz");
                } 
                else if (n % 3 == 0) {
                    System.out.println("Fizz");
                } 
                else if (n % 5 == 0) {
                    System.out.println("Buzz");
                } 
                
                else {
                    System.out.println(n);
                }
                n--;
            }
        } else {
            System.out.println("Please enter a valid positive integer.");
        }
    }
}
