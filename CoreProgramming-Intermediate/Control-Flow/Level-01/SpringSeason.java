// Write a program SpringSeason that takes two int values month and day from the command
// line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”.
import java.util.Scanner;
public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month: ");
        String month = sc.next();

        System.out.println("Enter the day: ");
        int day = sc.nextInt();

        if((month == "march" && day >=20) || month == "april" || month == "may" || (month == "june" && day<=20)){
            System.out.println("Its a Spring Season");
        } else{
            System.out.println("Not a Spring season");
        }
    }
}
