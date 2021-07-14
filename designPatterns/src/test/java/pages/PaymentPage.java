package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.WebActions;

// payment object model
public class PaymentPage extends WebActions {
    private WebDriver driver;

    // page factory initialization
    public PaymentPage(WebDriver driver) {
        super();
        PageFactory.initElements(driver, this);
    }

    // web elements
    @FindBy(css = "[data-test='cjs-price'] span")
    WebElement totalPriceElement;

    // actions performed on the web page
    public String getTotalPriceForTrip() {
        return getElementText(totalPriceElement);
    }
}
