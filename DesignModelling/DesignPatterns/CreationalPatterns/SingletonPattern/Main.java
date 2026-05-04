
public class Main{
    public static void main(String[] args) {
        Box box = Box.getBox();
        System.out.println(box);
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