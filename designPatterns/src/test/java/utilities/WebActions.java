package utilities;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class WebActions{

    public void enterInput(WebElement inputElement, String inputData) {
        inputElement.sendKeys(inputData+ Keys.ENTER);
    }

    public void clickElement(WebElement clickableElement) {
        clickableElement.click();
    }

    public String getElementText(WebElement webElement) {
        return webElement.getText();
    }
}
