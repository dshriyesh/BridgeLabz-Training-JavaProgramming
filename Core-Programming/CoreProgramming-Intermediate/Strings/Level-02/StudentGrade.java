// Create a program to take input marks of students in 3 subjects physics, chemistry, and
// maths. Compute the percentage and then calculate the grade as shown in figure below

// Hint =>
// a. Write a method to generate random 2-digit scores for Physics, Chemistry and Math
// (PCM) for the students and return the scores. This method returns a 2D array with PCM
// scores for all students
// b. Write a Method to calculate the total, average, and percentages for each student and
// return a 2D array with the corresponding values. Please ensure to round off the values to
// 2 Digits using Math.round() method
// c. Write a Method to calculate the grade based on the percentage as shown in the ref table
// and return a 2D array of students' grade
// d. Finally write a Method to display the scorecard of all students with their scores, total,
// average, percentage, and grade in a tabular format.


import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = generateMarks(n);

        double[][] stats = calculateStats(marks);

        String[] grades = calculateGrades(stats);

        display(marks, stats, grades);

        sc.close();
    }

    public static int[][] generateMarks(int n) {
        int[][] arr = new int[n][3]; // PCM

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = (int)(Math.random() * 90) + 10;
            }
        }
        return arr;
    }

    public static double[][] calculateStats(int[][] marks) {

        int n = marks.length;
        double[][] result = new double[n][3];

        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;

            avg = Math.round(avg * 100.0) / 100.0;
            percent = Math.round(percent * 100.0) / 100.0;

            result[i][0] = total;
            result[i][1] = avg;
            result[i][2] = percent;
        }

        return result;
    }

    public static String[] calculateGrades(double[][] stats) {

        int n = stats.length;
        String[] grades = new String[n];

        for (int i = 0; i < n; i++) {
            double p = stats[i][2];

            if (p >= 80) grades[i] = "A";
            else if (p >= 70) grades[i] = "B";
            else if (p >= 60) grades[i] = "C";
            else if (p >= 50) grades[i] = "D";
            else if (p >= 40) grades[i] = "E";
            else grades[i] = "R";
        }

        return grades;
    }

    public static void display(int[][] marks, double[][] stats, String[] grades) {
        for (int i = 0; i < marks.length; i++) {
            System.out.println((i + 1) + "\t" +
                    marks[i][0] + "\t" +
                    marks[i][1] + "\t" +
                    marks[i][2] + "\t" +
                    (int)stats[i][0] + "\t" +
                    stats[i][1] + "\t" +
                    stats[i][2] + "\t" +
                    grades[i]);
        }
    }
}
