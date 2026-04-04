// Write a Program to find the factorial of an integer entered by the user.

import java.util.Scanner;
public class FactorialOFNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int prod=1;
        while(num>1){
            prod=prod*num;
            num--;
        }
        System.out.println("factorial of the given number is "+prod);
    }
}
