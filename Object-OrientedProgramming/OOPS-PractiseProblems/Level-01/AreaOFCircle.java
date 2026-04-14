// Problem Statement: Write a program to create a Circle class with an attribute
// radius. Add methods to calculate and display the area and circumference of the circle.

import java.util.Scanner;

public class AreaOFCircle {

    int radius;

    public AreaOFCircle(int radius) {
        this.radius=radius;
    }
    private float calculateArea(int radius){
        return (float)3.14*(radius*radius);
    }
    public void display(){
        System.out.println("Area of circle is: "+calculateArea(radius));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        int r = sc.nextInt();

        AreaOFCircle obj = new AreaOFCircle(r);
        obj.display();
    }
}
