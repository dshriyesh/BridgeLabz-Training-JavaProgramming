public class Client {
    public static void main(String[] args) {
        // extra layer of factory

        Employee e1 = EmployeeFactory.getEmployee(new AndroidDevFactory());
        System.out.println(e1.salary());
        System.out.println(e1.name());

    }
}
