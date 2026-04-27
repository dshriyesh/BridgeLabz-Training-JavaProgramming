import java.util.*;
import java.util.stream.*;
import java.util.function.*;

class Employee {
    int id;
    String name;
    String department;
    double salary;

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return name + " (" + department + ") - " + salary;
    }
}

public class StreamAPIShowcase {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
            new Employee(1, "Alice", "IT", 60000),
            new Employee(2, "Bob", "HR", 40000),
            new Employee(3, "Charlie", "IT", 80000),
            new Employee(4, "David", "Finance", 30000),
            new Employee(5, "Eve", "IT", 90000)
        );

        // Filter + Map + Collect
        List<String> highPaidNames =
            employees.stream()
                     .filter(e -> e.getSalary() > 50000)
                     .map(Employee::getName)
                     .collect(Collectors.toList());

        System.out.println("High Paid: " + highPaidNames);

        // Sorting
        List<Employee> sorted =
            employees.stream()
                     .sorted(Comparator.comparing(Employee::getSalary))
                     .collect(Collectors.toList());

        System.out.println("Sorted by Salary: " + sorted);

        // Grouping
        Map<String, List<Employee>> grouped =
            employees.stream()
                     .collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println("Grouped by Department: " + grouped);

        // Average Salary
        double avgSalary =
            employees.stream()
                     .collect(Collectors.averagingDouble(Employee::getSalary));

        System.out.println("Average Salary: " + avgSalary);

        // Max Salary (Optional)
        Optional<Employee> max =
            employees.stream()
                     .max(Comparator.comparing(Employee::getSalary));

        max.ifPresent(e -> System.out.println("Highest Paid: " + e));

        // Partitioning (true/false split)
        Map<Boolean, List<Employee>> partition =
            employees.stream()
                     .collect(Collectors.partitioningBy(e -> e.getSalary() > 50000));

        System.out.println("Partitioned: " + partition);

        // Count
        long count =
            employees.stream()
                     .filter(e -> "IT".equals(e.getDepartment()))
                     .count();

        System.out.println("IT Employees Count: " + count);

        // Reduce (Total Salary)
        double totalSalary =
            employees.stream()
                     .map(Employee::getSalary)
                     .reduce(0.0, Double::sum);

        System.out.println("Total Salary: " + totalSalary);

        // Parallel Stream
        double parallelSum =
            employees.parallelStream()
                     .mapToDouble(Employee::getSalary)
                     .sum();

        System.out.println("Parallel Total Salary: " + parallelSum);
    }
}