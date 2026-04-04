// Write a program to check if the first, second, or third number is the largest of the three.
import java.util.Scanner;
public class LargestOfThree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        double num1 = sc.nextDouble();
        
        System.out.print("Enter number 2: ");
        double num2 = sc.nextDouble();
        
        System.out.print("Enter number 3: ");
        double num3 = sc.nextDouble();

        // Logical checks
        boolean isFirstLargest = (num1 >= num2) && (num1 >= num3);
        boolean isSecondLargest = (num2 >= num1) && (num2 >= num3);
        boolean isThirdLargest = (num3 >= num1) && (num3 >= num2);

        System.out.println("Is the first number the largest? " + isFirstLargest);
        System.out.println("Is the second number the largest? " + isSecondLargest);
        System.out.println("Is the third number the largest? " + isThirdLargest);

    }
}
