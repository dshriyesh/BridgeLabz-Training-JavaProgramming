// Rewrite the above program using multi-dimensional array to store height, weight, and BMI in
// 2D array for all the persons
// Hint =>
// a. Take input for a number of persons
// b. Create a multi-dimensional array to store weight, height and BMI. Also create an to store
// the weight status of the persons
// double[][] personData = new double[number][3];
// String[] weightStatus = new String[number];
// c. Take input for weight and height of the persons and for negative values, ask the user to
// enter positive values
// d. Calculate BMI of all the persons and store them in the personData array and also find
// the weight status and put them in the weightStatus array
// e. Display the height, weight, BMI and status of each person

import java.util.Scanner;

public class BMI2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();
        double[][] personData = new double[n][3];
        String[] weightStatus = new String[n];
        for (int i = 0; i < n; i++) {

            System.out.println("\nPerson " + (i + 1));

            System.out.print("Enter weight (kg): ");
            personData[i][0] = sc.nextDouble();

            System.out.print("Enter height (m): ");
            personData[i][1] = sc.nextDouble();

            // validation
            if (personData[i][0] <= 0 || personData[i][1] <= 0) {
                System.out.println("Invalid input! Enter positive values.");
                i--; // repeat same person
            }
        }
        for (int i = 0; i < n; i++) {

            double weight = personData[i][0];
            double height = personData[i][1];

            double bmi = weight / (height * height);
            bmi = Math.round(bmi * 100.0) / 100.0;

            personData[i][2] = bmi;

            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 25) {
                weightStatus[i] = "Normal";
            } else if (bmi < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "\t" +
                    personData[i][0] + "\t" +
                    personData[i][1] + "\t" +
                    personData[i][2] + "\t" +
                    weightStatus[i]);
        }
    }
}
