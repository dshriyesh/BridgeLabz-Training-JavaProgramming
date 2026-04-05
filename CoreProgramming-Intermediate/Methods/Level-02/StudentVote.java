// Write a program to take user input for the age of all 10 students in a class and check
// whether the student can vote depending on his/her age is greater or equal to 18.
// Hint =>
// a. Create a class public class StudentVoteChecker and define a method public
// boolean canStudentVote(int age) which takes in age as a parameter and returns
// true or false
// b. Inside the method firstly validate the age for a negative number, if a negative return is
// false cannot vote. For valid age check for age is 18 or above return true; else return
// false;
// c. In the main function define an array of 10 integer elements, loop through the array by
// take user input for the student's age, call canStudentVote() and display the result

import java.util.Scanner;

public class StudentVote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] studentAges = new int[10];

        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            studentAges[i] = scanner.nextInt();
        }

        
        StudentVote checker = new StudentVote();

        for (int i = 0; i < studentAges.length; i++) {
            int age = studentAges[i];
            boolean canVote = checker.canStudentVote(age);

            if (canVote) {
                System.out.println("Student " + (i + 1) + " (Age: " + age + "): Can Vote");
            } else {
                System.out.println("Student " + (i + 1) + " (Age: " + age + "): Cannot Vote");
            }
        }

        scanner.close();
    }

    public boolean canStudentVote(int age) {
        if (age < 0) {
            return false;
        }

        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
