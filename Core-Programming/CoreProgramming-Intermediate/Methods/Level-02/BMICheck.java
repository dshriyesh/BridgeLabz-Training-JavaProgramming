// 10. An organization took up the exercise to find the Body Mass Index (BMI) of all the persons in
// the team of 10 members. For this create a program to find the BMI and display the height,
// weight, BMI and status of each individual
// Hint =>
// a. Take user input in double for the weight (in kg) of the person and height (in cm) for the
// person and and store it in the corresponding 2D array of 10 rows and 3 columns. The
// First Column storing the weight, the second column storing the height in cm and the third
// column is the BMI
// b. Create a Method to find the BMI of every person and populate the array. Use the formula
// BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm to meter
// c. Create a Method to determine the BMI status using the logic shown in the figure below.
// and return the array of all the persons BMI Status.

import java.util.Scanner;

public class BMICheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] data = new double[10][3];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for person " + (i + 1));

            System.out.print("Weight (kg): ");
            data[i][0] = sc.nextDouble();

            System.out.print("Height (cm): ");
            data[i][1] = sc.nextDouble();
        }

        calculateBMI(data);

        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < 10; i++) {
            double bmi = data[i][2];
            String status = getBMIStatus(bmi);

            System.out.println("Person " + (i + 1));
            System.out.printf("Weight: %.2f kg\n", data[i][0]);
            System.out.printf("Height: %.2f cm\n", data[i][1]);
            System.out.printf("BMI: %.2f\n", bmi);
            System.out.println("Status: " + status);
            System.out.println();
        }

    }

    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];

            double heightM = heightCm / 100.0; // convert cm to meter
            double bmi = weight / (heightM * heightM);

            data[i][2] = bmi; // store BMI
        }
    }

    public static String getBMIStatus(double bmi) {
        if (bmi <= 18.4) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Normal";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}
