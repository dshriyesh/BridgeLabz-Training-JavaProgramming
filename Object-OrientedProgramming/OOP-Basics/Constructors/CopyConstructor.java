public class CopyConstructor {
    String msg;

    public CopyConstructor(String msg) {
        this.msg=msg;
    }

    public CopyConstructor(CopyConstructor cc) {
        this.msg=cc.msg;
    }

        void disp ()
    {
        System.out.println ("Constructor: " + msg);
    }
    
    public static void main(String[] args) {
        CopyConstructor obj1 = new CopyConstructor("this is copy constructor");

        CopyConstructor obj2 = new CopyConstructor(obj1);

        obj1.disp();
        obj2.disp();
    }
}
