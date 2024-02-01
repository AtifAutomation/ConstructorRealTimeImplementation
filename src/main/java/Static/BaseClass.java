package Static;

import org.openqa.selenium.WebDriver;

public class BaseClass {
    public static String url="https://www.geeksforgeeks.org/constructors-in-java/";
    public static WebDriver driver;
    public static void main(String[] args) {
//        StaticVaribaleMethod.num = 190;
//        StaticVaribaleMethod.staticMethod();
//        System.out.println(StaticVaribaleMethod.num);
//        StaticVaribaleMethod obj1 = new StaticVaribaleMethod();
//        StaticVaribaleMethod obj2 = new StaticVaribaleMethod();
//        System.out.println("****** static variable and method will have one copy in memory ******");
//        System.out.println(obj1.num);
//        System.out.println(obj2.num);
        RealTimeImplementation obj1=new RealTimeImplementation(driver,url);
        RealTimeImplementation.setup();
        RealTimeImplementation.tearDown();






    }
}
