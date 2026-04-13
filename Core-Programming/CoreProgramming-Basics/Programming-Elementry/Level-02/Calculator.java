/* Write a program to create a basic calculator for addition, subtraction, multiplication, and
division. The program should ask for two numbers (floating point) and perform all the
operations */
import java.util.Scanner;
public class Calculator{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //user inputs
        System.out.print("Enter the first number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = input.nextDouble();

        //Arithmetic Operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        
        // Handling division by zero error
        String divisionResult;
        if (number2 != 0) {
            divisionResult = String.valueOf(number1 / number2);
        } else {
            divisionResult = "undefined (division by zero)";
        }

        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " 
            + number1 + " and " + number2 + " is " 
            + addition + ", " + subtraction + ", " + multiplication + ", and " + divisionResult);
    }
}