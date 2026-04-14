public class HierarchicalInheritance { 
    public static void main(String[] args) { 
        A obj = new A(); 
        A.fun(); 
        B objB = new B();
        objB.fun();
    } 
} 

class A { 
    public static void fun() { 
        System.out.println(" Class A method "); 
    } 
} 

class B extends A { 
    public static void fun() { 
        System.out.println(" Class B method "); 
    } 
} 

class C extends A{ 
    public static void fun() { 
        System.out.println(" Class C method "); 
    } 
}
