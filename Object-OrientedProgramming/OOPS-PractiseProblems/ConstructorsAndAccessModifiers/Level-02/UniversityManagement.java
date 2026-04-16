class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        if (CGPA >= 0 && CGPA <= 10) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA!");
        }
    }
}

class PostgraduateStudent extends Student {

    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);       
        System.out.println("CGPA: " + getCGPA());
    }
}

public class UniversityManagement {
    public static void main(String[] args) {
        PostgraduateStudent student = new PostgraduateStudent(101, "Shriyesh", 8.5);

        student.displayDetails();

        student.setCGPA(9.2);

        System.out.println("Updated CGPA: " + student.getCGPA());
    }
}
