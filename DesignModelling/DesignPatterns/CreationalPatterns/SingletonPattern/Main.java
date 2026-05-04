
public class Main{
    public static void main(String[] args) {
        Box box1 = Box.getBox();
        System.out.println(box1.hashCode());

        Box box2 = Box.getBox();
        System.out.println(box2.hashCode()); // both the hash code are same , hence only one object is created
    }
}

class Box{

    private static  Box value; 

    private Box(){
        System.out.println("Box object initialised");
    } // private to restrict object creation

    public static Box getBox(){
        // object of box class
        // Box box = new Box(); // but whenever we call this new object will be created

        // condition to restrict new obj creation
        if(value==null){
            value = new Box();
        }

        System.out.println("inside getter function");

        return value;
    }
}



// 1. constructor  -> private