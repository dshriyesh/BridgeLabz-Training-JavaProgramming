// Create a program to divide N number of chocolates among M children. Print the number of
// chocolates each child will get and also the remaining chocolates
// Hint =>
// a. Get an integer value from user for the numberOfchocolates and numberOfChildren.
// b. Write the method to find the number of chocolates each child gets and number of
// remaining chocolates

import java.util.Scanner;

public class NumberOfChocolates {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of chocolates: ");
        int chocolates = scanner.nextInt();

        System.out.print("Enter number of childrens: ");
        int childrens = scanner.nextInt();

        

        int[] results = computation(chocolates, childrens);

        System.out.println("Each children will get: " + results[0]);
        System.out.println("Chocolates remaining: " + results[1]);

    }

    public static int[] computation(int chocolates, int childrens) {

        int rem = chocolates%childrens;
        int number = chocolates/childrens;

        return new int[]{number, rem};
    }
}
