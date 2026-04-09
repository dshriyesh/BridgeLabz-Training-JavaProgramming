// 6. An organization took up an exercise to find the Body Mass Index (BMI) of all the persons in
// the team. For this create a program to find the BMI and display the height, weight, BMI and
// status of each individual
// Hint =>
// a. Take input for a number of persons
// b. Create arrays to store the weight, height, BMI, and weight status of the persons
// c. Take input for the weight and height of the persons
// d. Calculate the BMI of all the persons and store them in an array and also find the weight
// status of the persons
// e. Display the height, weight, BMI, and weight status of each person
// f. Use the table to determine the weight status of the person

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[] weight = new double[n]; 
        double[] height = new double[n]; 
        double[] bmi = new double[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nPerson " + (i + 1));

            System.out.print("Enter weight (kg): ");
            weight[i] = sc.nextDouble();

            System.out.print("Enter height (meters): ");
            height[i] = sc.nextDouble();

            // validation
            if (weight[i] <= 0 || height[i] <= 0) {
                System.out.println("Invalid input! Re-enter.");
                i--;
            }
        }

        for (int i = 0; i < n; i++) {

            bmi[i] = weight[i] / (height[i] * height[i]);

            bmi[i] = Math.round(bmi[i] * 100.0) / 100.0;

            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] < 25) {
                status[i] = "Normal";
            } else if (bmi[i] < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "\t" +
                    height[i] + "\t" +
                    weight[i] + "\t" +
                    bmi[i] + "\t" +
                    status[i]);
        }
    }
}
