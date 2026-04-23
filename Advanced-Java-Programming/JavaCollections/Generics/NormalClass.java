public class NormalClass {
    public static void main(String[] args) {
        Box obj1 = new Box();
        obj1.setValue(4);
        // String i = (String)obj1.getValue(); // type safety issue not detected at compile time
        Integer i = (Integer)obj1.getValue(); // immplicit casting needed
        System.out.println(i);
    }
}

class Box{
    private Object value;

    public Object getValue(){
        return value;
    }

    public void setValue(Object value){
        this.value = value;
    }
}
