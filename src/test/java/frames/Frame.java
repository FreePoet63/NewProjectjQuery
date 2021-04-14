package frames;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Frame {
    private SelenideElement iframe = $(By.xpath("//iframe[@class = \"demo-frame\"]"));

    public void openFrame() {
        SelenideElement frameElement = $(iframe);
        WebDriverRunner.getWebDriver().switchTo().frame(frameElement);
    }
}
