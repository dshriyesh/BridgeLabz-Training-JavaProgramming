
// radius with default and user-provided values.

import java.util.Scanner;

public class Circle {
    int radius;

    Circle(){
        System.out.println("Circle with radius "+radius);
        radius=1;
    }

    public Circle(int radius) {
        this();
        this.radius = radius;
    }

    void calculate(){
        System.out.println("Area of circle is : "+(3.14*radius*radius));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to enter radius(y/n): ");
        char ch = sc.next().charAt(0);
        if(ch=='y'||ch=='Y'){
            System.out.print("Enter radius: ");
            int radius = sc.nextInt();
            Circle obj = new Circle(radius);
            obj.calculate();
        }
        else{
            Circle obj = new Circle();
            obj.calculate();
        }
        }
}
