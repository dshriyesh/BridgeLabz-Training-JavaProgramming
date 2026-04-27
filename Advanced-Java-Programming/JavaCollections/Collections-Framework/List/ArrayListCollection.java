import java.util.*;
public class ArrayListCollection {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");

        // Enhanced for loop
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        // Iterator
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

