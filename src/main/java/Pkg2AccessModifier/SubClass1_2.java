package Pkg2AccessModifier;

import Pkg1AccessModifier.Class2;

public class SubClass1_2 extends Class2 {
    public void method6()
    {
        method3(); // method of class 2
    }
}
