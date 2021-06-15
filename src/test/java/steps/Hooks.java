package steps;

import com.codeborne.selenide.Browsers;
import com.codeborne.selenide.Configuration;
import io.cucumber.java.Before;

import static com.codeborne.selenide.Selenide.open;

public class Hooks {

    @Before
    public void startjQuery() {
        Configuration.browser = Browsers.FIREFOX;
        Configuration.startMaximized = true;
        open("https://jqueryui.com/demos/");
    }
}
