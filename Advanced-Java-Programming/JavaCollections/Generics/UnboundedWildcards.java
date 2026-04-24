import java.util.Arrays;
import java.util.List;

public class UnboundedWildcards {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1, 2, 3);
        List<String>  ls = Arrays.asList("one", "two", "three");
        printList(li);
        printList(ls);
    }
    public static void printList(List<?> list) {
    for (Object elem: list)
        IO.print(elem + " ");
    IO.println();
}
}
