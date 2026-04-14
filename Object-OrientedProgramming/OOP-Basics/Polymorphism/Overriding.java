public class Overriding {
    public static void main(String[] args) {
        
    }
}
class A{
    void display(){
        System.out.println("Class A method");
    }
}
class B extends A{
    void display(){
        System.out.println("Class B method");
    }
}
