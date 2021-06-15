package pages;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static elements.Locators.COLLECTION;

public class BasePage {
    public void clickElement(String text) {
        $(By.xpath("//a[contains(text(), \"" + text + "\")]")).click();
    }

    public List<WebElement> seeMenu() {
        List<WebElement> collection = WebDriverRunner.getWebDriver().findElements(By.xpath(COLLECTION));
        return collection;
    }

    public void clickCheckbox(String arg0) {
        clickElement("Spinner");
    }

    public void newClickCheckbox(String arg0) {
        clickElement("Autocomplete");
    }
}
