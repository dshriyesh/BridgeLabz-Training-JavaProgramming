// 12. Write a program for Euclidean distance between two points as well as the equation of the
// line using those two points. Use Math functions Math.pow() and Math.sqrt()
// Hint =>
// a. Take inputs for 2 points x1, y1, and x2, y2
// b. Method to find the Euclidean distance between two points and return the distance
// distance = (x2 − x1)
// 2
// + (y2 − y1)
// 2

// c. Write a Method to find the equation of a line given two points and return the equation
// which includes the slope and the y-intercept
// The equation of a line is given by the equation y = m * x + b where m is the slope
// and b is the y-intercept. So firstly compute the slope using the formulae
// m = (y2 − y1)/(x2 − x1)
// Post that compute the y-intercept b using the formulae
// b = y1 − m * x1
// Finally, return an array having slope m and y-intercept b

import java.util.Scanner;

public class EuclideanAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();

        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();

        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();

        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        double distance = findDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance = " + distance);

        double[] result = findLineEquation(x1, y1, x2, y2);

        if (result == null) {
            System.out.println("Line is vertical → equation: x = " + x1);
        } else {
            double m = result[0];
            double b = result[1];

            System.out.println("Slope (m) = " + m);
            System.out.println("Y-intercept (b) = " + b);
            System.out.println("Equation: y = " + m + "x + " + b);
        }

        sc.close();
    }

    public static double findDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {

        if (x1 == x2) {
            return null;
        }

        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;

        return new double[]{m, b};
    }
}
