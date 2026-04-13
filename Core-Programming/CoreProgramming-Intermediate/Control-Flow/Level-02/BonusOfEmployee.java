// Create a program to find the bonuses of employees based on their years of service.
// Hint =>
// a. Zara decided to give a bonus of 5% to employees whose year of service is more than 5
// years.
// b. Take salary and year of service in the year as input.
// c. Print the bonus amount.

import java.util.Scanner;
public class BonusOfEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int salary = sc.nextInt();
        int yearOfService = sc.nextInt();

        if(yearOfService>5){
            System.out.println("Bonus amount is 5%");
        }else{
            System.out.println("Bonus amount is less thn 5%");
        }
    }
}
