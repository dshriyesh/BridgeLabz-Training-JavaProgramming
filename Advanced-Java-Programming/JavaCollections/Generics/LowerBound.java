import java.util.ArrayList;
import java.util.List;

public class LowerBound {
    public static void main(String[] args) {

        List<Number> list = new ArrayList<>();
        addNumbers(list);

        System.out.println(list);
    }

    public static void addNumbers(List<? super Integer> list) {
        list.add(10);
        list.add(20);
        list.add(30);
    }
}