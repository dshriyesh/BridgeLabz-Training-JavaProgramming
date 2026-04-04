// Write a program to check whether a number is positive, negative, or zero.
import java.util.Scanner;

public class NumberSignCheck {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        if(num>0){
            System.out.println("Number is positive");
        }
        else if(num<0){
            System.out.println("Number is negative");
        }
        else{
            System.out.println("Number is equal to 0");
        }
    }
}
