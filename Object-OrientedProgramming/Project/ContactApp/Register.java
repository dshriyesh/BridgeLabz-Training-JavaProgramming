public class Register {
    String name;
    String phNo;
    boolean flag=false;

    public Register(String name,String phNo) {
        this.name=name;
        this.phNo=phNo;
    }
    void displaySuccess(){
            if(phNo.length() != 10 || !phNo.matches("\\d+")){
            System.out.println("Invalid Number!");
        }
        else{
            System.out.println("New contact created");
            flag = true;
        }
    }
    
}
