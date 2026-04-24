// mostly used in places where we are doing read only task not returning something or not copying something
// bcz causes type safety errors
// used where the parameter type is undefined


import java.util.Arrays;
import java.util.List;

public class UnboundedWildcards {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1, 2, 3);
        List<String>  ls = Arrays.asList("one", "two", "three");
        printList(li);
        printList(ls);

        // copy(Arrays.asList(1,2,3),Arrays.asList()); // throws error due to type mismatch
    }
    public static void printList(List<?> list) { // read only task
    for (Object elem: list)
        IO.print(elem + " ");
    IO.println();
 }

//  public void copy(ArrayList<?> source, ArrayList<?> dest){
//     for(Object o:source){
//         dest.add(o);
//     }
//  } //causes error
}
