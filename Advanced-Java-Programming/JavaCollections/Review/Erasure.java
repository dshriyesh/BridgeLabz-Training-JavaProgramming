
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Box<T> {
    T value;

    void set(T value) {
        this.value = value;
    }

    T get() {
        return value;
    }
}

class Erasure {
    public static void main(String[] args) throws NoSuchFieldException {

        Box<String> box = new Box<>();
        box.set("Hello");

        Object val = box.get();

        // if (val instanceof Box) {
        //     System.out.println("Value is String");
        // } else {
        //     System.out.println("Not a String");
        // }

        System.out.println(box.value instanceof String);


        Field f = box.getClass().getDeclaredField("value");

       System.out.println(f.getType());


        System.out.println(f.getGenericType());

        List<Integer> arr = Arrays.asList(2,3,13,75,24,7,9,4,21);

        List<Integer> even =arr.stream().filter(x -> x%2==0).collect(Collectors.toList());

        System.out.println(even.toString());

        List<Integer> odd =arr.stream().filter(x -> x%2!=0).collect(Collectors.toList());

        System.out.println(odd.toString());


    }
}