// Write a program DayOfWeek that takes a date as input and prints the day of the week
// that the date falls on. Your program should take three command-line arguments: m
// (month), d (day), and y (year). For m use 1 for January, 2 for February, and so forth. For
// output print 0 for Sunday, 1 for Monday, 2 for Tuesday, and so forth. Use the following
// formulas, for the Gregorian calendar (where / denotes integer division):

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter month in integer value (1-12): ");
        int m = sc.nextInt();

        System.out.println("Enter the day: ");
        int d = sc.nextInt();

        System.out.println("Enter year: ");
        int y = sc.nextInt();

        int yo = y - (14 - m) / 12;
        int x = yo + yo / 4 - yo / 100 + yo / 400;
        int mo = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * mo) / 12) % 7;

        System.out.println("Result: " + d0);

        switch (d0) {
            case 0: System.out.println("Sunday"); break;
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
        }
       
    }
}
