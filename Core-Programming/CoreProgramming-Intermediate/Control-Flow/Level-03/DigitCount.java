// Create a program to count the number of digits in an integer.
// Hint =>
// a. Get an integer input for the number variable.
// b. Create an integer variable count with value 0.
// c. Use a loop to iterate until number is not equal to 0.
// d. Remove the last digit from number in each iteration
// e. Increase count by 1 in each iteration.
// f. Finally display the count to show the number of digits

import java.util.Scanner;
public class DigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        int count = 0;
        while(number>0){
            count++;
            number=number/10;
        }
        System.out.println("number of digits are: "+count);
    }
}
