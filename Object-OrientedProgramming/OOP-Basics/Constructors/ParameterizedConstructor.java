public class ParameterizedConstructor {

    int val;
    String msg;

    public ParameterizedConstructor(int val,String msg) {
        System.out.println(msg+val);
    }

    

    public static void main(String[] args) {
        ParameterizedConstructor obj = new ParameterizedConstructor(14, "Today is april ");
    }   
}
