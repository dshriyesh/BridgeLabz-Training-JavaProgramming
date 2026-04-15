// 3. Create a Person class with a copy constructor that clones another person's attributes.

public class Person {
    String name;
    int age;

    public Person(String name,int age) {
        this.name = name;
        this.age=age;
    }

    public Person(Person p){
        this.name = p.name;
        this.age = p.age;
    }
    void display(){
        System.out.println(name+" is of age "+age);
    }
    public static void main(String[] args) {
        Person obj1=new Person("Shri",22);
        obj1.display();
        Person obj2 = new Person(obj1);
        obj2.display();
    }
}
