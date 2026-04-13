
// Write a Program to check if the given number is a prime number or not
// Hint =>
// a. A number that can be divided exactly only by itself and 1 are Prime Numbers,
// b. Prime Numbers checks are done for numbers greater than 1
// c. Loop through all the numbers from 2 to the user input number and check if the reminder
// is zero. If the reminder is zero break out from the loop as the number is divisible by some
// other number and is not a prime number.
// d. Use the isPrime boolean variable to store the result

import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        boolean isPrime = true;
        for(int i=2;i<number;i++){
            if(number%i==0){
                isPrime=false;
            }
        }
        if(!isPrime){
            System.out.println(number+" Is not a prime number");
        }else{
            System.out.println(number+" is a prime number");
        }
    }   
}
