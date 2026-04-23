public class GenericEnumMethod {
    public static void main(String[] args) {
        System.out.println(Operation.ADD.apply(10, 5));
    }
}

enum Operation{
    ADD ,SUBTRACT ,MULTIPLY ,DIVIDE;

    public <T extends Number> double apply(T a,T b){
        switch(this){
            case ADD:
            return a.doubleValue() + b.doubleValue();
            
            case SUBTRACT:
            return a.doubleValue() - b.doubleValue();

            case MULTIPLY:
            return a.doubleValue() * b.doubleValue();

            case DIVIDE:
            return a.doubleValue()/b.doubleValue();

            default:
            System.out.println("Error");
            return 1;
        }
    }

}
