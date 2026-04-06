// Write a program to perform matrix manipulation operations like addition, subtraction, and
// multiplication. The program should take random matrices as input and display the result of
// the operations.
// Hint =>
// a. Write a Method to create a random matrix, taking rows and columns as parameters
// b. Write a Method to add two matrices
// c. Write a Method to subtract two matrices
// d. Write a Method to multiply two matrices


import java.util.Scanner;

public class MatrixOperations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input dimensions
        System.out.print("Enter rows of matrix A: ");
        int r1 = sc.nextInt();

        System.out.print("Enter cols of matrix A: ");
        int c1 = sc.nextInt();

        System.out.print("Enter rows of matrix B: ");
        int r2 = sc.nextInt();

        System.out.print("Enter cols of matrix B: ");
        int c2 = sc.nextInt();

        // Generate matrices
        int[][] A = generateMatrix(r1, c1);
        int[][] B = generateMatrix(r2, c2);

        System.out.println("\nMatrix A:");
        printMatrix(A);

        System.out.println("\nMatrix B:");
        printMatrix(B);

        // Addition
        if (r1 == r2 && c1 == c2) {
            System.out.println("\nAddition (A + B):");
            printMatrix(addMatrix(A, B));
        } else {
            System.out.println("\nAddition not possible (dimension mismatch)");
        }

        // Subtraction
        if (r1 == r2 && c1 == c2) {
            System.out.println("\nSubtraction (A - B):");
            printMatrix(subtractMatrix(A, B));
        } else {
            System.out.println("\nSubtraction not possible (dimension mismatch)");
        }

        // Multiplication
        if (c1 == r2) {
            System.out.println("\nMultiplication (A × B):");
            printMatrix(multiplyMatrix(A, B));
        } else {
            System.out.println("\nMultiplication not possible (c1 != r2)");
        }

        sc.close();
    }

    // a. Generate random matrix
    public static int[][] generateMatrix(int rows, int cols) {
        int[][] mat = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = (int)(Math.random() * 10); // 0–9
            }
        }
        return mat;
    }

    // b. Addition
    public static int[][] addMatrix(int[][] A, int[][] B) {
        int[][] res = new int[A.length][A[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                res[i][j] = A[i][j] + B[i][j];
            }
        }
        return res;
    }

    // c. Subtraction
    public static int[][] subtractMatrix(int[][] A, int[][] B) {
        int[][] res = new int[A.length][A[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                res[i][j] = A[i][j] - B[i][j];
            }
        }
        return res;
    }

    // d. Multiplication
    public static int[][] multiplyMatrix(int[][] A, int[][] B) {
        int[][] res = new int[A.length][B[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                for (int k = 0; k < A[0].length; k++) {
                    res[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return res;
    }


    public static void printMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}