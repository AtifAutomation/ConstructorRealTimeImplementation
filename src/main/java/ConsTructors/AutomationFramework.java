package ConsTructors;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class AutomationFramework {
    public WebDriver driver;
    public String url;

    public AutomationFramework(WebDriver driver,String url)
    {
        this.driver=driver;
        this.url=url;
    }
    public void launchUrl(String url)
    {
        driver.get(url);
    }
    public void closeBrowser()
    {
        driver.quit();
    }
}
