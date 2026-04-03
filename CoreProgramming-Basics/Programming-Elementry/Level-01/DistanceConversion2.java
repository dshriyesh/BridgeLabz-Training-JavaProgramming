import java.util.Scanner;

public class DistanceConversion2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = input.nextDouble();

        double yards = distanceInFeet / 3;
        
        double miles = yards / 1760;

        System.out.printf("The distance in yards is %.2f %nwhile in miles is %.5f", 
                          yards, miles);
    }
}
