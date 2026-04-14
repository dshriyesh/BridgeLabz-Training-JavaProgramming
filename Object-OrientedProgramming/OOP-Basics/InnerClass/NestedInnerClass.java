public class NestedInnerClass {
        class Inner
    {
        public void show ()
        {
            System.out.println ("Inside nested class method");
        }
    }
    
    public static void main (String[]args)
    {
        NestedInnerClass.Inner obj = new NestedInnerClass ().new Inner ();
        obj.show ();
    }
}
