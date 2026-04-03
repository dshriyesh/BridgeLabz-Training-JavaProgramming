// Create a program to convert distance in kilometers to miles.
import java.util.Scanner;
public class KmToMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double km = input.nextInt();
        double totalmile = km*1.6;
        System.out.println("The total miles is: "+totalmile+" mile for the given "+km+" km");
    }
}
