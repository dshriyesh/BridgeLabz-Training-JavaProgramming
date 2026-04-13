// 9. Create a program to display a calendar for a given month and year. The program should
// take the month and year as input from the user and display the calendar for that month. E.g.
// for 07 2005 user input, the program should display the calendar

// Hint =>
// a. Write a Method to get the name of the month. For this define a month Array to store the
// names of the months
// b. Write a Method to get the number of days in the month. For this define a days Array to
// store the number of days in each month. For Feb month, check for Leap Year to get the
// number of days. Also, define a Leap Year Method.
// c. Write a method to get the first day of the month using the Gregorian calendar algorithm

// 5

// d. Displaying the Calendar requires 2 for loops.
// i. The first for loop up to the first day to get the proper indentation. As in the example
// above 3 spaces from Sun to Thu as to be set as July 1st starts on Fri
// ii. The Second for loop displays the days of the month starting from 1 to the number of
// days. Add proper indentation for single-digit days using %3d to display the integer
// right-justified in a field of width 3. Please note to move to the next line after Sat


import java.util.Scanner;

public class Calender {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the month number: ");
        int month = sc.nextInt();

        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        display(month, year);

    }
    public static void display(int month,int year){
        String[] week = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        System.out.println(monthName(month)+" "+year);
        for(int i=0;i<7;i++){
            System.out.print(week[i]+" ");
        }
        System.out.println();
        // int day=DayofWeek(1, month, year);
        // int idx=0;
        // while(idx!=day){
        //     System.out.print(" ");
        //     idx++;
        // }
        // int rows=noOfDaysInMonth(month, year)%7;

        // int val=1;
        // for(int i=0;i<rows;i++){
        //     for(int j=idx;j<week.length%idx;j++){
        //         System.out.print(val+" ");
        //         if(val==noOfDaysInMonth(month, year)) break;
        //         val++;
        //         idx++;
        //     }
        //     System.out.println();
        // }

        int firstDay = DayofWeek(1, month, year);
        int totalDays = noOfDaysInMonth(month, year);

        // indentation
        for (int i = 0; i < firstDay; i++) {
            System.out.print("       ");
        }
        // print days
        for (int day = 1; day <= totalDays; day++) {
            System.out.printf("%6d ", day);
            // new line after Saturday
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
    }
    public static String monthName(int month){
        String[] monthname ={"January","February","March","April","May","June","July","August","September","October","November","December"};
        return monthname[month-1];
    }
    public static int noOfDaysInMonth(int month,int year){
        int[] days ={31,28,31,30,31,30,31,31,30,31,30,31};
        if(month==2){
            if(isLeapYear(year)){
                return 29;
            }
        }
        return days[month-1];
    }
     public static boolean isLeapYear(int year) {
        if (year < 1582) {
            return false;
        }

        // b. Divisible by 4 AND (not divisible by 100 OR divisible by 400)
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static int DayofWeek(int d,int m,int y){
        int yo = y - (14 - m) / 12;
        int x = yo + yo / 4 - yo / 100 + yo / 400;
        int mo = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * mo) / 12) % 7;
        int day=0;
        switch (d0) {
            case 0: day=(0); break;
            case 1: day=(1); break;
            case 2: day=(2); break;
            case 3: day=(3); break;
            case 4: day=(4); break;
            case 5: day=(5); break;
            case 6: day=(6); break;
        }
        return day;
    }
}
