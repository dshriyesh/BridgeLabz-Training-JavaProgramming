public class StaticNestedClass {
        static class Nested
    {
        public void mymethod ()
        {
            System.out.println ("This is nested class");
        }
    }
    public static void main (String args[])
    {
        StaticNestedClass.Nested nested = new StaticNestedClass.Nested ();
        nested.mymethod ();
    }
}
