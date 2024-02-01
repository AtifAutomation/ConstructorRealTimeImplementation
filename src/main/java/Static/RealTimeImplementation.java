package Static;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RealTimeImplementation {
    private static WebDriver driver;
    private static String url;
    RealTimeImplementation(WebDriver driver,String url)
    {
        this.driver=driver;
        this.url=url;
    }
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ATIF\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
    }
    public static void tearDown()
    {
        driver.quit();
    }




}
