package utilities;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

// common actions performed on the web page
public class WebActions {
    // entering the input
    public void enterInput(WebElement inputElement, String inputData) {
        inputElement.sendKeys(inputData + Keys.ENTER);
    }

    // clicking the element
    public void clickElement(WebElement clickableElement) {
        clickableElement.click();
    }

    // getting text of the web element
    public String getElementText(WebElement webElement) {
        return webElement.getText();
    }
}
