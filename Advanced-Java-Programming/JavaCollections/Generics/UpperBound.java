// used to resolve problems faced in unbounded type
// it extends the sub-type of a class to implement the


import java.util.ArrayList;
import java.util.Arrays;

public class UpperBound {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println(listSum(list1));
    }
    public static double listSum(ArrayList<? extends Number> numbers){
        double sum=0;
        for(Number o:numbers){
            sum+=o.doubleValue();
        }
        return sum;
    }
}
