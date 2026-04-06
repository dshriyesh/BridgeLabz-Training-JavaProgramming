// 13. Create a program to take input marks of students in 3 subjects: physics, chemistry, and
// maths. Compute the total, average, and the percentage score

// Hint =>
// a. Take input for the number of students
// b. Write a method to generate random 2-digit scores for Physics, Chemistry, and Math
// (PCM) for the students and return the scores. This method returns a 2D array with PCM
// scores for all students

// 7

// c. Write a Method to calculate the total, average, and percentages for each student and
// return a 2D array with the corresponding values. Please ensure to round off the values to
// 2 Digits using the Math.round() method.
// d. Finally, write a Method to display the scorecard of all students with their scores, total,
// average, and percentage in a tabular format using "\t".


import java.util.Scanner;

public class StudentReport {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = generateMarks(n);

        double[][] result = calculateResults(marks);

        displayReport(marks, result);

        sc.close();
    }

    // Generate random 2-digit PCM marks
    public static int[][] generateMarks(int n) {
        int[][] arr = new int[n][3]; // Physics, Chemistry, Maths

        for (int i = 0; i < n; i++) {
            arr[i][0] = (int)(Math.random() * 90) + 10; // 10–99
            arr[i][1] = (int)(Math.random() * 90) + 10;
            arr[i][2] = (int)(Math.random() * 90) + 10;
        }

        return arr;
    }

    public static double[][] calculateResults(int[][] marks) {
        double[][] res = new double[marks.length][3]; // total, avg, %

        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;

            avg = Math.round(avg * 100.0) / 100.0;
            percent = Math.round(percent * 100.0) / 100.0;

            res[i][0] = total;
            res[i][1] = avg;
            res[i][2] = percent;
        }

        return res;
    }

    public static String getGrade(double percent) {
        if (percent >= 80) return "A";
        else if (percent >= 70) return "B";
        else if (percent >= 60) return "C";
        else if (percent >= 50) return "D";
        else if (percent >= 40) return "E";
        else return "R";
    }

    public static void displayReport(int[][] marks, double[][] res) {

        System.out.println("\n-------------------------------------------------------------");
        System.out.printf("%-5s %-5s %-5s %-5s %-7s %-7s %-10s %-5s\n",
                "ID", "Phy", "Chem", "Math", "Total", "Avg", "%", "Grade");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < marks.length; i++) {
            System.out.printf("%-5d %-5d %-5d %-5d %-7.0f %-7.2f %-10.2f %-5s\n",
                    (i + 1),
                    marks[i][0],
                    marks[i][1],
                    marks[i][2],
                    res[i][0],
                    res[i][1],
                    res[i][2],
                    getGrade(res[i][2])
            );
        }

        System.out.println("-------------------------------------------------------------");
    }
}
