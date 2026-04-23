public class BoundedTypeParameters {
    public static void main(String[] args) {
        // Box<String> box = new Box<>(); // error as String doesnot extends number class
        Box<Integer> box = new Box<>();
        box.setValue(10);
        System.out.println(box.getValue());
    }
}

class Box<T extends Number>{
    private T value;

    public T getValue(){
        return value;
    }

    public void setValue(T value){
        this.value = value;
    }
}