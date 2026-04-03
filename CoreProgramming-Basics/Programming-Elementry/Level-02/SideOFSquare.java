// Write a program to find the side of the square whose parameter you read from the user
import java.util.Scanner;
public class SideOFSquare {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();

        // parameter=side*4
        double side = perimeter / 4.0;

        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
 }   
}
