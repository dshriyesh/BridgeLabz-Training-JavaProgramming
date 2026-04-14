
import java.util.Scanner;

public class StudentDetails {
    String name;
    int rollno;
    int marks;

    public StudentDetails(String name, int rollno, int marks) {
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }

    String calculteResult(int marks) {
        if (marks >= 90) return "A";
        else if (marks >= 80) return "B";
        else if (marks >= 70) return "C";
        else if (marks >= 60) return "D";
        else return "F";
    }

    void display() {
        String grade = calculteResult(marks);

        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollno);
        System.out.println("Marks: " + marks);

        switch (grade) {
            case "A":
                System.out.println("Grade: A (Excellent)");
                break;
            case "B":
                System.out.println("Grade: B (Good)");
                break;
            case "C":
                System.out.println("Grade: C (Average)");
                break;
            case "D":
                System.out.println("Grade: D (Below Average)");
                break;
            case "F":
                System.out.println("Grade: F (Fail)");
                break;
            default:
                System.out.println("Invalid Grade");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter details: ");

        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter rollno: ");
        int rollno = sc.nextInt();

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        System.out.println();
        StudentDetails s1 = new StudentDetails( name, rollno, marks);

        s1.display();
    }
}