package Pkg1AccessModifier;

public class Class1 {
    // In a class if we declare a variable or method the scope is within the class without creating object of the class.

    public int x=9;
   public void method1()
    {
        System.out.println("Method of class 1");
    }
    public void method2()
    {
        System.out.println(x);
        method1();

    }
}
