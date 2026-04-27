import java.util.*;
public class InstanceMethodRefrence {

        public void print(String s) {
        System.out.println("Value: " + s);
        }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C");

        InstanceMethodRefrence obj = new InstanceMethodRefrence();

        // Method reference
        list.forEach(obj::print);
    }
}    

