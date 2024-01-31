package ConsTructors;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ConsTructors.AutomationFramework.*;


public class BaseClass {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ATIF\\Downloads\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        String url="https://www.javatpoint.com/java-constructor";
        AutomationFramework obj=new AutomationFramework(driver,url);

        obj.launchUrl(url);
        obj.closeBrowser();
    }



}
