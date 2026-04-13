// Write a program to input marks and 3 subjects physics, chemistry and maths. Compute the
// percentage and then calculate the grade as per the following guidelines

import java.util.Scanner;
public class GradeCalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total=0;
        for(int i=1;i<=3;i++){
            System.out.print("Enter the subject : ");
            String subject = sc.next();
            System.out.println();
            System.out.print("Enter the marks: ");
            int marks = sc.nextInt();
            total+=marks;
        }
        int percent = total/3;
        if(percent >=80){
            System.out.println("total is "+total+" and the grade is "+percent+" Level 4, above agency-normalized standards");
        }else if(percent>=70 && percent<=79){
            System.out.println("total is "+total+" and the grade is "+percent+" Level 3, at agency-normalized standards");
        }
        else if(percent>=60 && percent<=69){
            System.out.println("total is "+total+" and the grade is "+percent+" Level 2,below, but approaching agency-normalized standards");
        }
        else if(percent>=50 && percent<=59){
            System.out.println("total is "+total+" and the grade is "+percent+" Level 1, well below agency-normalized standards");
        }
        else if(percent>=40 && percent<=49){
            System.out.println("total is "+total+" and the grade is "+percent+" Level 1-, too below agency-normalized standards");
        }else{
            System.out.println("total is "+total+" and the grade is "+percent+" Remedial standard");
        }
    }
}
