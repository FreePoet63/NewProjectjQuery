package elements;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static elements.Locators.IFRAME;

public class Frame {
    public static void openFrame() {
        SelenideElement frameElement = $(By.xpath(IFRAME));
        WebDriverRunner.getWebDriver().switchTo().frame(frameElement);
    }
}
