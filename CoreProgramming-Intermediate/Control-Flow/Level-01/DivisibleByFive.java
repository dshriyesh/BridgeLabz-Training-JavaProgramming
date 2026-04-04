// Write a program to check if a number is divisible by 5
// I/P => number
// O/P => Is the number ___ divisible by 5? ___

import java.util.Scanner;
public class DivisibleByFive{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        
        boolean ans = num%5==0?true:false;

        System.out.printf("Is the number %d divisible by 5? %b%n", num, ans);
    }
}