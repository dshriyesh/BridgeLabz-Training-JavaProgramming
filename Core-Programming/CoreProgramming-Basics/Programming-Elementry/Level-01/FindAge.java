// Write a program to find the age of Harry if the birth year is 2000. Assume the Current Year is
// 2024
import java.util.Scanner;
class FindAge{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Current Year : ");
        int currentYear = sc.nextInt();
        int birthYear= 2000;

        System.out.println("Harry's age is : "+(currentYear - birthYear));
    }
}