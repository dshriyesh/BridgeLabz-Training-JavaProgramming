public class AnonymusInnerClass {
        public static void main (String args[])
    {
        Animal p = new Animal ()
        {
            void dog ()
            {
                System.out.println ("Dog is an Animal.");
            }
        };
        p.dog ();
    }
}
abstract class Animal
{
  abstract void dog ();
}

//Anonymous Inner Class,declared without a class name, is created for implementing an interface or extending a class