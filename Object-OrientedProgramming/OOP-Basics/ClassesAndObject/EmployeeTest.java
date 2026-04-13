public class EmployeeTest {
    public static void main(String[] args) {
        // Employee e1 = new Employee("Shri",2000,24);
        Employee e1 = new Employee("Shri");
        System.out.println(e1.salary);
        e1.greet();

        Employee e2 = new Employee("raj",2023,55);
        e2.greet();
    }
}
