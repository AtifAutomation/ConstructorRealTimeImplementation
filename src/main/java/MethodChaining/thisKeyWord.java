package MethodChaining;

import org.openqa.selenium.WebDriver;

public class thisKeyWord {

    public WebDriver driver;
    public String url;

    thisKeyWord(WebDriver driver,String url)
    {
        this.driver=driver;
        this.url=url;
    }
    public thisKeyWord launchUrl()
    {
        driver.get(url);

        return this;
    }
    public String getTitle()
    {
        return driver.getTitle();

    }
    public void tearDown()
    {
        driver.quit();
    }
}
