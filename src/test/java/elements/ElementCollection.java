package elements;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ElementCollection {

    private List<WebElement> collection = WebDriverRunner.getWebDriver().findElements(By.xpath("//aside//h3"));

    public List<WebElement> menuSite() {
        return collection;
    }

}
