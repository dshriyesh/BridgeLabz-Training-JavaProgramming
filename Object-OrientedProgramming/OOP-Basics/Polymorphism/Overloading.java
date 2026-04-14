public class Overloading {
    int data;
    String value;

    public Overloading() {
        this.data=20;
        this.value="shri";
    }

    public void fun(int data){
        System.out.println("Data is :"+data);
    }
    public void fun(String value){
        System.out.println("Value is: "+value);
    }

    public static void main(String[] args) {
        Overloading obj = new Overloading();
        obj.fun(30);
        obj.fun("aman");
    }
    
}
