// Write a program to perform matrix manipulation operations like finding the transpose,
// determinant, and inverse of a matrix. The program should take random matrices as input
// and display the result of the operations.
// Hint =>
// a. Write a Method to create a random matrix taking rows and columns as parameters
// b. Write a Method to find the transpose of a matrix

// 8

// c. Write a Method to find the determinant of a 2x2 matrix

// d. Write a Method to find the determinant of a 3x3 matrix

// e. Write a Method to find the inverse of a 2x2 matrix
// f. Write a Method to find the inverse of a 3x3 matrix
// g. Write a Method to display a matrix

public class MatrixAdvanced {

    public static void main(String[] args) {

        // Generate matrices
        double[][] mat2 = generateMatrix(2, 2);
        double[][] mat3 = generateMatrix(3, 3);

        System.out.println("2x2 Matrix:");
        printMatrix(mat2);

        System.out.println("\nTranspose:");
        printMatrix(transpose(mat2));

        double det2 = determinant2x2(mat2);
        System.out.println("Determinant (2x2): " + det2);

        if (det2 != 0) {
            System.out.println("Inverse (2x2):");
            printMatrix(inverse2x2(mat2));
        } else {
            System.out.println("Inverse not possible (det = 0)");
        }

        System.out.println("\n---------------------------\n");

        System.out.println("3x3 Matrix:");
        printMatrix(mat3);

        System.out.println("\nTranspose:");
        printMatrix(transpose(mat3));

        double det3 = determinant3x3(mat3);
        System.out.println("Determinant (3x3): " + det3);

        if (det3 != 0) {
            System.out.println("Inverse (3x3):");
            printMatrix(inverse3x3(mat3));
        } else {
            System.out.println("Inverse not possible (det = 0)");
        }
    }

    // a. Generate random matrix
    public static double[][] generateMatrix(int r, int c) {
        double[][] mat = new double[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = (int)(Math.random() * 10); // 0–9
            }
        }
        return mat;
    }

    // b. Transpose
    public static double[][] transpose(double[][] mat) {
        int r = mat.length;
        int c = mat[0].length;
        double[][] res = new double[c][r];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[j][i] = mat[i][j];
            }
        }
        return res;
    }

    // c. Determinant 2x2
    public static double determinant2x2(double[][] m) {
        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
    }

    // d. Determinant 3x3
    public static double determinant3x3(double[][] m) {
        return m[0][0] * (m[1][1]*m[2][2] - m[1][2]*m[2][1])
             - m[0][1] * (m[1][0]*m[2][2] - m[1][2]*m[2][0])
             + m[0][2] * (m[1][0]*m[2][1] - m[1][1]*m[2][0]);
    }

    // e. Inverse 2x2
    public static double[][] inverse2x2(double[][] m) {
        double det = determinant2x2(m);
        double[][] inv = new double[2][2];

        inv[0][0] = m[1][1] / det;
        inv[0][1] = -m[0][1] / det;
        inv[1][0] = -m[1][0] / det;
        inv[1][1] = m[0][0] / det;

        return inv;
    }

    // f. Inverse 3x3
    public static double[][] inverse3x3(double[][] m) {
        double det = determinant3x3(m);
        double[][] adj = new double[3][3];

        // Cofactors
        adj[0][0] =  (m[1][1]*m[2][2] - m[1][2]*m[2][1]);
        adj[0][1] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0]);
        adj[0][2] =  (m[1][0]*m[2][1] - m[1][1]*m[2][0]);

        adj[1][0] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1]);
        adj[1][1] =  (m[0][0]*m[2][2] - m[0][2]*m[2][0]);
        adj[1][2] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0]);

        adj[2][0] =  (m[0][1]*m[1][2] - m[0][2]*m[1][1]);
        adj[2][1] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0]);
        adj[2][2] =  (m[0][0]*m[1][1] - m[0][1]*m[1][0]);

        // Transpose of cofactor = adjoint
        adj = transpose(adj);

        // Divide by determinant
        double[][] inv = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                inv[i][j] = adj[i][j] / det;
            }
        }

        return inv;
    }

    // g. Print matrix
    public static void printMatrix(double[][] mat) {
        for (double[] row : mat) {
            for (double val : row) {
                System.out.printf("%8.2f ", val);
            }
            System.out.println();
        }
    }
}