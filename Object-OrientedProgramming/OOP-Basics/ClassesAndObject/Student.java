public class Student {
    String name;
    int age;
    int rollno;

    public Student(String name,int age,int rollno){
        this.name=name;
        this.age=age;
        this.rollno=rollno;
    }

    public void greting(){
        System.out.println("hello! "+name);
    }

    public static void main(String[] args) {
        Student s1=new Student("shri",22,61);
        Student s2 = new Student("prashant", 21,20);
        s1.greting();
        s2.greting();
    }
}
