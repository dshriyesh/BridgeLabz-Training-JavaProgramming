public class ThisKeyword {
    int num=10;

    public ThisKeyword() {
        System.out.println("Usage of 'this' keyword");
    }

    public ThisKeyword(int num) {

        this(); // Invoking the default constructor
        this.num = num; // Assigning the local variable num to the instance variable num
    }

    public void print() {
      // Local variable num
      int num = 20;
      
      // Printing the local variable
      System.out.println("value of local variable num is : "+num);
      
      // Printing the instance variable
      System.out.println("value of instance variable num is : "+this.num);
          
   }
    

    
    public static void main(String[] args) {
        ThisKeyword obj1 = new ThisKeyword();
        obj1.print();
    }
}
