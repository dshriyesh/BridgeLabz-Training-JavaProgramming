import java.util.*;
import java.util.function.*;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

public class ConstructorRefrence {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ram", "Shyam", "Amit");

        // Lambda
        List<Person> people1 = names.stream()
                                   .map(name -> new Person(name))
                                   .toList();

        // Constructor reference
        List<Person> people2 = names.stream()
                                   .map(Person::new)
                                   .toList();

        System.out.println(people2.size());
    }
}