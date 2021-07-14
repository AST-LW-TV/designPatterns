package testscripts;

import org.openqa.selenium.WebDriver;
import utilities.BrowserDriverFactory;
import utilities.GetConfigProps;

import java.util.concurrent.TimeUnit;

// root test class - which acts as the base class for other test classes
public class RootTest {
    public static WebDriver driver;

    // initialization of the browser
    public static void browserInitialization(){
        // getting the details about the browser and url from config.properties file
        String browser= GetConfigProps.getValue("browser");
        String url=GetConfigProps.getValue("url");
        driver=BrowserDriverFactory.getBrowserDriver(browser);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // implicit wait - 10 secs
        driver.get(url); // navigating to the specified url
    }
}
