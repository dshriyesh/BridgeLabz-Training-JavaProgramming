// An athlete runs in a triangular park with sides provided as input by the user in meters. If the
// athlete wants to complete a 5 km run, then how many rounds must the athlete complete
// Hint =>
// a. Take user input for 3 sides of a triangle
// b. The perimeter of a triangle is the addition of all sides and rounds is distance/perimeter
// c. Write a Method to compute the number of rounds user needs to do to complete 5km run


import java.util.Scanner;

public class AthleteRunning {

    int NoOfRounds(int distance,int perimeter){
        return distance/perimeter;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance : ");
        int distance = sc.nextInt();

        System.out.println("Enter the side1 lenght: ");
        int side1 = sc.nextInt();

        System.out.println("Enter the side2 lenght: ");
        int side2 = sc.nextInt();

        System.out.println("Enter the side3 lenght: ");
        int side3 = sc.nextInt();

        int perimeter = side1+side2+side3;

        AthleteRunning obj = new AthleteRunning();

        int rounds = obj.NoOfRounds(distance, perimeter);

        System.out.println("Athlete needs "+rounds);

    }
}
