package pages;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static config.TestConfig.VALUE_TESTDATE;
import static elements.Frame.openFrame;
import static elements.Locators.*;

public class SpinnerPage {
    public void  setValueInputField() {
        openFrame();
        $(By.id(INPUT)).setValue(VALUE_TESTDATE);
    }
    
    public void clickButtonGetValue() {
        $(By.id(GET_VALUE)).click();
    }
    
    public String alertGetValue() {
        org.openqa.selenium.Alert alert =  WebDriverRunner.getWebDriver().switchTo().alert();
        return alert.getText();
    }
}
