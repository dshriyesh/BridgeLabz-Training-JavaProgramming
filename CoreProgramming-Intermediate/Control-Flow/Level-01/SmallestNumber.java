// Write a program to check if the first is the smallest of the 3 numbers.
// I/P => number1, number2, number3
// O/P => Is the first number the smallest? ____
import java.util.Scanner;
public class SmallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        String ans = ((num1<num2) && (num1<num3))?"Yes":"No";

        System.out.println("Is the first number the smallest? "+ans);

    }
}
