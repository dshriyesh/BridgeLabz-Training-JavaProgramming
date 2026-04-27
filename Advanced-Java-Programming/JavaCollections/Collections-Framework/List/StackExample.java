import java.util.Stack;

public class StackExample {
public static void main(String[] args) {
     Stack<String> stack = new Stack<>();
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");

        // Enhanced for loop
        for (String fruit : stack) {
            System.out.println(fruit);
        }
}
}
