// Problem Statement: Write a program to create an Employee class with attributes
// name, id, and salary. Add a method to display the details.

import java.util.Scanner;

public class EmployeeDetails {
    String name;
    int id;
    int salary;

    public EmployeeDetails(String name,int id,int salary) {
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter details: ");

        System.out.print("Enter name: ");
        String name=sc.nextLine();

        System.out.print("Enter id: ");
        int id = sc.nextInt();

        System.out.print("Enter salary: ");
        int salary = sc.nextInt();
        
        EmployeeDetails obj = new EmployeeDetails(name,id,salary);
        System.out.println(name+" with id "+id+" is having salary of: "+salary);
    }
}
