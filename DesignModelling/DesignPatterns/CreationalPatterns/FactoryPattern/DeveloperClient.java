public class DeveloperClient {
    public static void main(String[] args) {
        Employee employee = new WebDeveloper(); // tightly coupled

        // in factory pattern we ensure loose coupling

        // lossly coupled
        // here we are not making object out of class
        // instead our factory class is responsible for making object based on the input value
        Employee emp1 = EmployeeFactory.getEmployee("Android Developer");
        System.out.println(emp1.salary());
        
    }
}
