// Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on
// their ages and the tallest among the friends based on their heights
// Hint =>
// a. Take user input for the age and height of the 3 friends and store it in a variable
// b. Find the smallest of the 3 ages to find the youngest friend and display it
// c. Find the largest of the 3 heights to find the tallest friend and display it

import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter details for Amar:");
        System.out.print("Age: ");
        int ageAmar = sc.nextInt();
        System.out.print("Height (cm): ");
        double heightAmar = sc.nextDouble();

        System.out.println("\nEnter details for Akbar:");
        System.out.print("Age: ");
        int ageAkbar = sc.nextInt();
        System.out.print("Height (cm): ");
        double heightAkbar = sc.nextDouble();

        System.out.println("\nEnter details for Anthony:");
        System.out.print("Age: ");
        int ageAnthony = sc.nextInt();
        System.out.print("Height (cm): ");
        double heightAnthony = sc.nextDouble();

        String youngest;
        if (ageAmar <= ageAkbar && ageAmar <= ageAnthony) {
            youngest = "Amar";
        } else if (ageAkbar <= ageAmar && ageAkbar <= ageAnthony) {
            youngest = "Akbar";
        } else {
            youngest = "Anthony";
        }

        String tallest;
        if (heightAmar >= heightAkbar && heightAmar >= heightAnthony) {
            tallest = "Amar";
        } else if (heightAkbar >= heightAmar && heightAkbar >= heightAnthony) {
            tallest = "Akbar";
        } else {
            tallest = "Anthony";
        }

        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);
    }
}
