// 10. Write a program to find the 3 points that are collinear using the slope formulae and area of
// triangle formulae. check A (2, 4), B (4, 6) and C (6, 8) are Collinear for sampling.
// Hint =>
// a. Take inputs for 3 points x1, y1, x2, y2, and x3, y3
// b. Write a Method to find the 3 points that are collinear using the slope formula. The 3
// points A(x1,y1), b(x2,y2), and c(x3,y3) are collinear if the slopes formed by 3 points ab,
// bc, and cd are equal.
// slope AB = (y2 − y1)/(x2 − x1), slope BC = (y3 − y2)/(x3 − x3)
// slope AC = (y3 − y1)/(x3 − x1) Points are collinear if
// slope AB = slope BC = slope Ac
// c. The method to find the three points is collinear using the area of the triangle formula.
// The Three points are collinear if the area of the triangle formed by three points is 0.
// area of a triangle is, area = 0. 5 * (x1 * (y2 − y3) + x2 * (y3 − y1) + x3 * (y1 − y2))

import java.util.Scanner;

public class CollinearPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st coordinates: ");
        System.out.print("Enter x1: ");
        int x1=sc.nextInt();
        System.out.println();
        System.out.print("Enter y1: ");
        int y1 = sc.nextInt();
        System.out.println();

        System.out.println("Enter 2nd coordinates: ");
        System.out.print("Enter x2: ");
        int x2=sc.nextInt();
        System.out.println();
        System.out.print("Enter y2: ");
        int y2 = sc.nextInt();
        System.out.println();


        System.out.println("Enter 3rd coordinates: ");
        System.out.print("Enter x3: ");
        int x3=sc.nextInt();
        System.out.println();
        System.out.print("Enter y3: ");
        int y3 = sc.nextInt();
        System.out.println();

        if(slopeFormula(x1, y1, x2, y2, x3, y3)){
            System.out.println("Using slope formula, points are collinear");
        }else{
            System.out.println("Using slope formula points are not collinear");
        }

        if(areOfTriangle(x1, y1, x2, y2, x3, y3)){
            System.out.println("Using area of triangle formula, points are collinear");
        }else{
            System.out.println("Using are of triangle formula points are not collinear");
        }

    }

    public static boolean slopeFormula(int x1,int y1,int x2,int y2, int x3,int y3){
        int slopeAB = (y2-y1)/(x2-x1);
        int slopeBC = (y3-y2)/(x3-x2);
        int slopeAC = (y3-y1)/(x3-x1);
        
        if(slopeAB == slopeBC && slopeAB==slopeAC){
            return true;
        }

        return false;
    }

    public static boolean areOfTriangle(int x1,int y1,int x2,int y2, int x3,int y3){
        int area = ((x1 * (y2 - y3)) + (x2 * (y3 - y1)) + (x3 * (y1 - y2)))/2;
        if(area==0) return true;
        return false;
    }


}
