public class GenericClass {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>();
        box.setValue(5); // no manual type casting
        int val = box.getValue();

        // String str = box.getValue(); // compile time error type safety
        System.out.println(val);
    }
}

class Box<T> {
    private T value;

    public T getValue(){
        return value;
    }

    public void setValue(T value){
        this.value=value;
    }
}

