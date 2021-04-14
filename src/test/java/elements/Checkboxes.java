package elements;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Checkboxes {

    public void clickElement(String text) {
        $(By.xpath("//a[contains(text(), \"" + text + "\")]")).click();
    }
}

