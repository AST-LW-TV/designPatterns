package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.WebActions;

public class HomePage extends WebActions {

    private WebDriver driver;

    public HomePage(WebDriver driver){
        super();
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="onetrust-accept-btn-handler")
    private WebElement cookiesButton;

    @FindBy(css="input[id='from.search']")
    private WebElement fromInputElement;

    @FindBy(css="input[id='to.search']")
    private WebElement toInputElement;

    @FindBy(css = "input#return")
    private WebElement twoWayReturnElement;

    @FindBy(id="page.journeySearchForm.outbound.title")
    private WebElement outDateElement;

    @FindBy(xpath="//a[@title='July 16, 2021']")
    private WebElement outDate;

    @FindBy(id="page.journeySearchForm.inbound.title")
    private WebElement returnDateElement;

    @FindBy(xpath="//a[@title='July 18, 2021']")
    private WebElement returnDate;

    @FindBy(className="_c5iz1w")
    private WebElement numberOfPassengers;

    @FindBy(css="._nsi73u8")
    private WebElement submitButtonElement;

    public void clickCookiesButton(){
        boolean temp=cookiesButton.isDisplayed();
        if(temp)
            clickElement(cookiesButton);
    }

    public void enterFromInput(String data){
        enterInput(fromInputElement,data);
    }

    public void enterToInput(String data){
        enterInput(toInputElement,data);
    }

    public void clickTypeOfTravel(){
        clickElement(twoWayReturnElement);
    }

    public void selectOutDate(){
        clickElement(outDateElement);
        clickElement(outDate);
    }

    public void selectReturnData(){
        clickElement(returnDateElement);
        clickElement(returnDate);
    }

    public String enteringEssentialDetails(){
        String totalPassengers;
        clickCookiesButton();
        enterFromInput("London");
        enterToInput("Leeds");
        clickTypeOfTravel();
        selectOutDate();
        selectReturnData();
        totalPassengers=getElementText(numberOfPassengers);
        clickElement(submitButtonElement);
        return totalPassengers;
    }

}
