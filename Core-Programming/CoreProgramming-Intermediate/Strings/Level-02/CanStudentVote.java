// Write a program to take user input for the age of all 10 students in a class and check
// whether the student can vote depending on his/her age is greater or equal to 18.
// Hint =>
// a. Create a method to define the random 2-digit age of several students provided as
// method parameters and return a 1D array of ages of n students
// b. Create a method that takes an array of age as a parameter and returns a 2D String array
// of age and a boolean true or false to indicate can and cannot vote. Inside the method
// firstly validate the age for a negative number, if a negative cannot vote. For valid age
// check for age is 18 or above to set true to indicate can vote.
// c. Create a method to display the 2D array in a tabular format.
// d. Finally, the main function takes user inputs, calls the user-defined methods, and displays
// the result.

import java.util.Scanner;

public class CanStudentVote {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 10; 

        int[] ages = new int[n];
        System.out.println("Enter ages of 10 students:");

        for (int i = 0; i < n; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        String[][] result = checkVotingEligibility(ages);


        display(result);

        sc.close();
    }

    public static int[] generateRandomAges(int n) {
        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            ages[i] = (int)(Math.random() * 90) + 10; // 10–99
        }

        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {

        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {

            int age = ages[i];

            result[i][0] = String.valueOf(age);

            if (age < 0) {
                result[i][1] = "false"; 
            } else if (age >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }

        return result;
    }
    public static void display(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean canVote = Boolean.parseBoolean(arr[i][1]);
            System.out.println(arr[i][0] + "\t" + canVote);
        }
    }
}
