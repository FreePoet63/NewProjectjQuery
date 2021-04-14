package elements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;

public class InputField {

    private SelenideElement input = $("#spinner");
    private SelenideElement newInput = $("#tags");

    public void setInput(String value) {
        input.setValue(value);
    }

    public void newSetInput(String value) {
        newInput.setValue(value);
    }
     public void clickList() {
        newInput.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
     }

     public String valueField() {
        return newInput.getAttribute("value");
     }
}
