package Pkg2AccessModifier;

import Pkg1AccessModifier.Class1;

public class Class3 {

    Class1 obj1=new Class1();
    public void method5()
    {
        System.out.println(obj1.x);
        obj1.method1();
        obj1.method2();
    }

}
