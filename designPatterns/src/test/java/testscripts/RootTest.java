package testscripts;

import org.openqa.selenium.WebDriver;
import utilities.BrowserDriverFactory;
import utilities.GetConfigProps;

import java.util.concurrent.TimeUnit;

public class RootTest {

    // why not use protected instead of public that will let access of variables only for derived classes

    public static WebDriver driver;

    public static void browserInitialization(){
        String browser= GetConfigProps.getValue("browser");
        String url=GetConfigProps.getValue("url");
        driver=BrowserDriverFactory.getBrowserDriver(browser);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
    }
}
