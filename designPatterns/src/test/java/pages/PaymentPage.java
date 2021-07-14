package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.WebActions;

public class PaymentPage extends WebActions {

    private WebDriver driver;

    public PaymentPage(WebDriver driver){
        super();
        PageFactory.initElements(driver,this);
    }

    @FindBy(css="[data-test='cjs-price'] span")
    WebElement totalPriceElement;

    public String getTotalPriceForTrip(){
        return getElementText(totalPriceElement);
    }

}
