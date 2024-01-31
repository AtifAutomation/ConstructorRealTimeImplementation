package Static;

public class BaseClass {
    public static void main(String[] args) {
        StaticVaribaleMethod.num = 190;
        StaticVaribaleMethod.staticMethod();
        System.out.println(StaticVaribaleMethod.num);
        StaticVaribaleMethod obj1 = new StaticVaribaleMethod();
        StaticVaribaleMethod obj2 = new StaticVaribaleMethod();
        System.out.println("****** static variable and method will have one copy in memory ******");
        System.out.println(obj1.num);
        System.out.println(obj2.num);

    }
}
