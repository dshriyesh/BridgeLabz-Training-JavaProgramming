public class Variables {

    String species; // instance variable
    static int population=1000; // static variable

    public Variables(String species) {
        this.species=species;
        Variables.population=population;
    }
    

    public int fun(){
        int num1=10; // local variable
        int num2=20;
        return num1+num2;
    }
    public static void main(String[] args) {
        Variables v1= new Variables("Bee");
        System.out.println("Local variable sum are: "+ v1.fun());
        System.out.println("Instance variable value: "+v1.species);
        System.out.println("Static variable value: "+v1.population);

    }
}
