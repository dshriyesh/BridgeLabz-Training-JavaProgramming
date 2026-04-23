public class GenericConstructor {
    public static void main(String[] args) {
        Box2 box2 = new Box2(5);
    }
}


class Box<T extends Number>{
    private T value;

    public T getValue(){
        return value;
    }

    public void setValue(T value){
        this.value=value;
    }

}



class Box2 {

    public <T> Box2(T value){
    }
}