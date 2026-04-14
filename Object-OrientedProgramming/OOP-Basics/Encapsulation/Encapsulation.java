public class Encapsulation {

    private String Name;
    private int RollNo;
    private int Age;

    // get method for age to access  
    public int getAge ()
    {
        return Age;
    }

    // get method for name to access  
    public String getName ()
    {
        return Name;
    }

    // get method for roll to access   
    public int getRoll ()
    {
        return RollNo;
    } 
    public void setAge (int newAge)
    {
        Age = newAge;
    }
    public void setName (String newName)
    {
        Name = newName;
    }
    public void setRoll (int newRollNo)
    {
        RollNo = newRollNo;
    }
    
    public static void main (String[]args)
    {
        Encapsulation obj = new Encapsulation ();
        // setting values of the variables  
        obj.setName ("Harsh");
        obj.setAge (19);
        obj.setRoll (51);
        
        System.out.println ("Student's Name: " + obj.getName ());
        System.out.println ("Student's Age: " + obj.getAge ());
        System.out.println ("Student's RollNo: " + obj.getRoll ());
    }
}
