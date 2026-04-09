// 1. Create a program to find the bonus of 10 employees based on their years of service and the
// total bonus amount the company Zara has to pay, along with the old and new salary.
// Hint =>
// a. Zara decides to give a bonus of 5% to employees whose year of service is more than 5
// years or 2% if less than 5 years
// b. Define a double array to save salary and years of service for each of the 10 employees
// c. Also define a double array to save the new salary and the bonus amount as well as
// variables to save the total bonus, total old salary, and new salary
// d. Define a loop to take input from the user. If salary or year of service is an invalid number
// then ask the use to enter again. Note in this case you will have to decrement the index
// counter
// e. Define another loop to calculate the bonus of 10 employees based on their years of
// service. Save the bonus in the array, compute the new salary, and save in the array.
// Also, the total bonus and total old and new salary can be calculated in the loop
// f. Print the total bonus payout as well as the total old and new salary of all the employees

import java.util.Scanner;

public class Employeebonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 10;

        double[] salary = new double[n];
        double[] years = new double[n];

        double[] bonus = new double[n];
        double[] newSalary = new double[n];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        for (int i = 0; i < n; i++) {

            System.out.println("\nEmployee " + (i + 1));

            System.out.print("Enter salary: ");
            salary[i] = sc.nextDouble();

            System.out.print("Enter years of service: ");
            years[i] = sc.nextDouble();

            // Validation
            if (salary[i] <= 0 || years[i] < 0) {
                System.out.println("Invalid input! Please enter again.");
                i--; // repeat same index
                continue;
            }
        }

        // Calculation
        for (int i = 0; i < n; i++) {

            if (years[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "\t" +
                    salary[i] + "\t\t" +
                    bonus[i] + "\t\t" +
                    newSalary[i]);
        }
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);
    }
}
