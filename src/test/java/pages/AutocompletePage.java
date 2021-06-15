package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static config.TestConfig.VALUE_TAGS;
import static elements.Frame.openFrame;
import static elements.Locators.NEW_INPUT;

public class AutocompletePage {

    public void valueInputAutocomplete() {
        openFrame();
        $(By.id(NEW_INPUT)).setValue(VALUE_TAGS);
    }

    public void clickListItem() {
        sleep(2000);
        $(By.id(NEW_INPUT)).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
    }

    public String getValueTags() {
       return $(By.id(NEW_INPUT)).getAttribute("value");
    }
}
