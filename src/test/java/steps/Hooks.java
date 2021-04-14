package steps;

import com.codeborne.selenide.Browsers;
import com.codeborne.selenide.Configuration;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class Hooks {

    @Before
    public void startjQuery() {
        Configuration.browser = Browsers.FIREFOX;
        Configuration.startMaximized = true;
        open("https://jqueryui.com/demos/");
    }

}
