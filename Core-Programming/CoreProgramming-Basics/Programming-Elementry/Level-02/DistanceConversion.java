// Write a program to find the distance in yards and miles for the distance provided by the user
// in feet

import java.util.Scanner;

public class DistanceConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter the distance in feet: ");
        double distanceFeet = input.nextDouble();

        //Perform conversions
        double distanceYards = distanceFeet / 3.0;
        double distanceMiles = distanceYards / 1760.0;

        System.out.printf("The distance in yards is %.2f while the distance in miles is %.6f%n", 
                          distanceYards, distanceMiles);
    }
}
