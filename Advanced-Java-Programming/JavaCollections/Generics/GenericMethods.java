public class GenericMethods {
    public static void main(String[] args) {
        String str = "shri";
        message(str);
        message(10);

    }

    public static <T> void message(T name){
    System.out.println("Generic method");
    }

    public static void message(Integer name){
        System.out.println("Integer method");
    }
}
