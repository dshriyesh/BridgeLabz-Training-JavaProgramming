// 10. Create a program to take a number as input find the frequency of each digit in the number
// using an array and display the frequency of each digit
// Hint =>
// a. Take the input for a number
// b. Find the count of digits in the number
// c. Find the digits in the number and save them in an array
// d. Find the frequency of each digit in the number. For this define a frequency array of size
// 10, Loop through the digits array, and increase the frequency of each digit
// e. Display the frequency of each digit in the number

import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        int og=number;
        int[] freq=new int[10];
        while(number>0){
            freq[number%10]++;
            number=number/10;
        }
        while(og>0){
            System.out.println("Frequency of "+og%10+" is "+freq[og%10]);
            og=og/10;
        }
    }
}
