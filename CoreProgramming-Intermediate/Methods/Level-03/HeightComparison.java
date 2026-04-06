// Create a program to find the shortest, tallest, and mean height of players present in a
// football team.
// Hint =>
// a. The formula to calculate the mean is: mean = sum of all elements/number of elements
// b. Create an int array named heights of size 11 and get 3 digits random height in cms for
// each player in the range 150 cms to 250 cms
// c. Write the method to Find the sum of all the elements present in the array.
// d. Write the method to find the mean height of the players on the football team
// e. Write the method to find the shortest height of the players on the football team
// f. Write the method to find the tallest height of the players on the football team
// g. Finally display the results

import java.util.Scanner;

public class HeightComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] heights = new int[11];
        for(int i=0;i<11;i++){
            System.out.print("Enter height of player "+i+": ");
            heights[i]= sc.nextInt();
        }

        System.out.println("Sum of heights is: "+heightSum(heights));
        System.out.println("Mean of heights is: "+meanHeight(heights));
        System.out.println("Shortest height is: "+shortestHeight(heights));
        System.out.println("Tallest height is: "+tallestHeight(heights));

    }

    // sum of heights calcultaion
    public static int heightSum(int[] heights){
        int sum=0;
        for(int i=0;i<11;i++){
            sum+=heights[i];
        }
        return sum;
    }

    // calculating mean of heights
    public static int meanHeight(int[] heights){
        return heightSum(heights)/heights.length;
    }
    // calculating shortest
    public static  int shortestHeight(int[] heights){
        int minHeight=heights[0];
        for(int i=1;i<11;i++){
            if(heights[i]<minHeight){
                minHeight=heights[i];
            }
        }
        return minHeight;
    }

    // calculating tallest height
    public static int tallestHeight(int[] heights){
        int maxHeight=heights[0];
        for(int i=1;i<11;i++){
            if(heights[i]>maxHeight){
                maxHeight=heights[i];
            }
        }
        return maxHeight;
    }
}
