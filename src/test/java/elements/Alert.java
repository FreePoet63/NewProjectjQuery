package elements;

import com.codeborne.selenide.WebDriverRunner;

public class Alert {

    public String alertGetValue() {
      org.openqa.selenium.Alert alert =  WebDriverRunner.getWebDriver().switchTo().alert();
      return alert.getText();
    }

}
