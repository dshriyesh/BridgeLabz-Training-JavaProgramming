public class WrapperClass {
    public static void main(String[] args) {
        // auto-boxing
        int a=10;
        Integer A=a;
        System.out.println("Autoboxed Value: "+A);

        //unboxing
        Integer b=new Integer(20);
        int B=b;
        System.out.println("Unboxed Value: "+B);
    }
}
