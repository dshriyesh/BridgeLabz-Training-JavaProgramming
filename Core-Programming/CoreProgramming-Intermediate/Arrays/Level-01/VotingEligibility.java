// Write a program to take user input for the age of all 10 students in a class and check
// whether the student can vote depending on his/her age is greater or equal to 18.
// Hint =>
// a. Define an array of 10 integer elements and take user input for the student's age.
// b. Loop through the array using the length property and for the element of the array check
// If the age is a negative number print an invalid age and if 18 or above, print The student
// with the age ___ can vote. Otherwise, print The student with the age ___ cannot vote.

import java.util.Scanner;
public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i=0;i<10;i++){
            System.out.print("Enter the age: ");
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<10;i++){
            if(arr[i]<0){
                System.out.println("Invalid age");
            }
            else if(arr[i]>=18){
                System.out.println("Student with age "+arr[i]+" can vote");
            }
            else{
                System.out.println("Student with age "+arr[i]+" cannot vote");
            }
        }
    }
}
