package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// Factory design pattern
// returns the driver of the specified browser
public class BrowserDriverFactory {
    public static WebDriver getBrowserDriver(String browserValue) {
        String browser = browserValue;
        boolean temp = browser.equalsIgnoreCase("chrome");
        (temp ? WebDriverManager.chromedriver() : WebDriverManager.firefoxdriver()).setup();
        return temp ? new ChromeDriver() : new FirefoxDriver();
    }
}
