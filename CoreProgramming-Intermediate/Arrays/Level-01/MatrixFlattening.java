// Working with Multi-Dimensional Arrays. Write a Java program to create a 2D Array and
// Copy the 2D Array into a single dimension array
// Hint =>
// a. Take user input for rows and columns, create a 2D array (Matrix), and take the user input
// b. Copy the elements of the matrix to a 1D array. For this create a 1D array of size
// rows*columns as in int[] array = new int[rows * columns];
// c. Define the index variable and Loop through the 2D array. Copy every element of the 2D
// array into the 1D array and increment the index
// d. Note: For looping through the 2D array, you will need Nested for loop, Outer for loop for
// rows, and the inner for loops to access each element

import java.util.Scanner;

public class MatrixFlattening {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Create 2D array
        int[][] matrix = new int[rows][cols];

        // Input elements
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // Create 1D array
        int[] array = new int[rows * cols];

        int index = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[index++] = matrix[i][j];
            }
        }

        System.out.println("2D Array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("1D Array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        sc.close();
    }
}
