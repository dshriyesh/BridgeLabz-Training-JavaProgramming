import java.util.*;
import java.util.function.*;
import java.util.stream.*;

class Employee {
    private int id;
    private String name;
    private double salary;
    private String department;

    public Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }
    public String getDepartment() { return department; }

    @Override
    public String toString() {
        return name + " (" + department + ") - " + salary;
    }
}

public class LambdaExpression {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
            new Employee(1, "Alice", 60000, "IT"),
            new Employee(2, "Bob", 40000, "HR"),
            new Employee(3, "Charlie", 70000, "IT"),
            new Employee(4, "David", 30000, "Finance"),
            new Employee(5, "Eve", 90000, "IT")
        );

        // Predicate (Filtering)
        Predicate<Employee> isHighSalary = e -> e.getSalary() > 50000;
        Predicate<Employee> isITDept = e -> "IT".equals(e.getDepartment());

        // Combine predicates
        Predicate<Employee> highPaidIT = isHighSalary.and(isITDept);

        // Function (Transformation)
        Function<Employee, String> nameExtractor = Employee::getName;
        Function<String, String> toUpper = String::toUpperCase;

        // Function composition
        Function<Employee, String> namePipeline = nameExtractor.andThen(toUpper);

        // 🔹Consumer (Final action)
        Consumer<String> printer = System.out::println;

        // 🔹Stream Pipeline (Core Logic)
        employees.stream()
                .filter(highPaidIT)
                .map(namePipeline)
                .sorted()
                .forEach(printer);

        // Optional Usage (Safe handling)
        Optional<Employee> highestPaid =
            employees.stream()
                     .max(Comparator.comparing(Employee::getSalary));

        highestPaid.ifPresent(e ->
            System.out.println("Top Earner: " + e)
        );

        // Custom Functional Interface (Advanced)
        SalaryIncrement increment = (emp, percent) ->
            emp.getSalary() + (emp.getSalary() * percent / 100);

        double newSalary = increment.apply(employees.get(0), 10);
        System.out.println("New Salary: " + newSalary);

        //Parallel Processing (Performance)
        double totalSalary = employees.parallelStream()
                                      .mapToDouble(Employee::getSalary)
                                      .sum();

        System.out.println("Total Salary: " + totalSalary);
    }

    // Custom Functional Interface
    @FunctionalInterface
    interface SalaryIncrement {
        double apply(Employee emp, double percent);
    }
}