
import java.util.Scanner;

class Course{
    String courseName;
    float duration;
    int fee;
    static String instituteName;

    public Course(String courseName,float duration,int fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }
    void displayCourseDetails(){
        System.out.println("Institute name: "+instituteName);
        System.out.println("Course name: "+courseName);
        System.out.println("Course duraton: "+duration);
        System.out.println("Course fee: "+fee);
        System.out.println();
    }
    static void updateInstitueName(String name){
        Course.instituteName = name;
    }
    
}

public class OnlineCourseManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to enroll in a course(y/n): ");
        char ch =sc.next().charAt(0);
        while(ch=='y'||ch=='Y'){
        System.out.print("Enter Institute name: ");
        sc.nextLine();
        String institute = sc.nextLine();
        Course.updateInstitueName(institute);

        System.out.print("Enter course: ");
        String course = sc.nextLine();

        System.out.print("Enter duration(in hr): ");
        float hr = sc.nextFloat();

        System.out.print("Enter course fee: ");
        int fee = sc.nextInt();
        System.out.println();

        Course c1 = new Course(course, hr, fee);
        c1.displayCourseDetails();

        System.out.println("Do you want to enroll in a course(y/n): ");
        char newch = sc.next().charAt(0);
        if(newch=='N'||newch=='n') return;
        ch=newch;
        }
    }
}
