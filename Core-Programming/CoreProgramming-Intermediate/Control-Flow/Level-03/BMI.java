// Create a program to find the BMI of a person
// Hint =>
// a. Take user input in double for the weight (in kg) of the person and height (in cm) for the
// person and store it in the corresponding variable.
// b. Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm
// to meter
// c. Use the table to determine the weight status of the person

import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the weight in kg: ");
        double weight = sc.nextDouble();

        System.out.print("Enter the height in cm: ");
        double height = sc.nextDouble()/100;
        double bmi = weight/(height*height);
        
        if(bmi<=18.4){
            System.out.println("Underweight");
        }else if(bmi>=18.5 && bmi<=24.9){
            System.out.println("Normal");
        }else if(bmi>=25.0 && bmi<=39.9){
            System.out.println("Overweight");
        }else{
            System.out.println("Obese");
        }
    }
}
