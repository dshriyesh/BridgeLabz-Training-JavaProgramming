public class Employee {
    String name;
    int salary;
    int empId;
    public Employee(String name){
        this.name=name;
    }
    public Employee(String name,int salary,int empId){
        this.name=name;
        this.salary=salary;
        this.empId=empId;
    }

    public void greet(){
        System.out.println("Bonjour! "+this.name+" your empID is "+empId);
    }
    
}
