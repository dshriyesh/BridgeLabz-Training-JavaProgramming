
import java.util.ArrayList;

// without generics :-
// 1. Type safey issues
// 2. Manual casting
// 3. no compile time checking

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add(123);
        list.add(3.14);

        String str = (String) list.get(0); // manual casting

        // Wrong casting
        // String integer = (String) list.get(1); // type issue, no compile time warning

        // Correct way
        Integer integer = (Integer) list.get(1);

        System.out.println(str);
        System.out.println(integer);

        // Using Generics
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);

        int val = arr.get(1); // No casting needed
        System.out.println(val);
    }
}
