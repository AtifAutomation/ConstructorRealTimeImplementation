package MethodChaining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
    public static WebDriver driver;
    public static String url;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ATIF\\Downloads\\chromedriver.exe");
        driver=new ChromeDriver();
        url="https://www.google.com/";

        thisKeyWord obj=new thisKeyWord(driver,url);
        obj.launchUrl();
        String title=obj.launchUrl().getTitle();
        System.out.println(title);
        obj.tearDown();
    }
}
