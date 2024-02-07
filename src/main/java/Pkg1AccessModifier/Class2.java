package Pkg1AccessModifier;


public class Class2 {
    Class1 obj1=new Class1();

    public void method3()
    {
        System.out.println(obj1.x);
        obj1.method1();
        obj1.method2();
    }

}
