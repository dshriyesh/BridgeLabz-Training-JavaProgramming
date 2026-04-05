// Create a program to find the youngest friends among 3 Amar, Akbar and Anthony based on
// their ages and tallest among the friends based on their heights and display it
// Hint =>
// a. Take user input for age and height for the 3 friends and store it in two arrays each to
// store the values for age and height of the 3 friends
// b. Write a Method to find the youngest of the 3 friends
// c. Write a Method to find the tallest of the 3 friends

import java.util.Scanner;

public class HeightChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for " + names[i] + ":");
            System.out.print("Age: ");
            ages[i] = sc.nextInt();
            System.out.print("Height (in cm): ");
            heights[i] = sc.nextDouble();
        }

        //youngest
        int youngestIdx = findYoungestIndex(ages);
        System.out.println("\nThe youngest friend is: " + names[youngestIdx] + " (" + ages[youngestIdx] + " years old)");

        // c. Find tallest
        int tallestIdx = findTallestIndex(heights);
        System.out.println("The tallest friend is: " + names[tallestIdx] + " (" + heights[tallestIdx] + " cm)");

        sc.close();
    }

    // Method to find the index of the minimum age
    public static int findYoungestIndex(int[] ages) {
        int minIdx = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minIdx]) {
                minIdx = i;
            }
        }
        return minIdx;
    }

    public static int findTallestIndex(double[] heights) {
        int maxIdx = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxIdx]) {
                maxIdx = i;
            }
        }
        return maxIdx;
    }
}
