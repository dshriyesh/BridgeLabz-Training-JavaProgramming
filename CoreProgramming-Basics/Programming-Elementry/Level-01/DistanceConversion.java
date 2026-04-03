// Create a program to convert the distance of 10.8 kilometers to miles.
public class DistanceConversion {
    public static void main(String[] args) {
        float givenDistance = 10.8f; // in km

        float convertedToMiles = (float)(givenDistance*1.6);

        System.out.println("The distance "+givenDistance+" km in miles is "+convertedToMiles);

    }
}
