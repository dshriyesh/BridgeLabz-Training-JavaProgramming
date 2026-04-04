// 10. Write a program to create a calculator using switch...case.
// Hint =>
// a. Create two double variables named first and second and a String variable named op.
// b. Get input values for all variables.
// c. The input for the operator can only be one of the four values: "+", "-", "*" or "/".
// d. Run a for loop from i = 1 to i < number.
// e. Based on the input value of the op, perform specific operations using the switch...case
// statement and print the result.
// f. If op is +, perform addition between first and second; if it is -, perform subtraction and so
// on.
// g. If op is neither of those 4 values, print Invalid Operator.

import java.util.Scanner;

public class CalculatorSwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double first = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double second = scanner.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        String op = scanner.next();

        double result;

        switch (op) {
            case "+":
                result = first + second;
                System.out.println(first + " + " + second + " = " + result);
                break;

            case "-":
                result = first - second;
                System.out.println(first + " - " + second + " = " + result);
                break;

            case "*":
                result = first * second;
                System.out.println(first + " * " + second + " = " + result);
                break;

            case "/":
                if (second != 0) {
                    result = first / second;
                    System.out.println(first + " / " + second + " = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid Operator.");
                break;
        }
    }
}
