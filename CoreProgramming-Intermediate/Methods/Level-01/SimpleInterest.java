// Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.
// Hint =>
// a. Simple Interest = Principal * Rate * Time / 100
// b. Take user input for principal, rate, time
// c. Write a method to calculate the simple interest given principle, rate and time as
// parameters
// d. Output “The Simple Interest is ___ for Principal ___, Rate of Interest ___ and Time ___”

import java.util.Scanner;
public class SimpleInterest {

    int calculatefunction(int p,int r,int t){
        return (p*r*t)/100;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter prinicipal amount: ");
        int principal = sc.nextInt();

        System.out.println("Enter rate: ");
        int rate = sc.nextInt();

        System.out.println("Enter time: ");
        int time = sc.nextInt();

        SimpleInterest obj = new SimpleInterest();

        int si = obj.calculatefunction(principal, rate, time);

        System.out.println("The Simple Interest is "+si+" for Principal "+principal+" , Rate of Interest "+rate+" and Time "+time);
    }
}
