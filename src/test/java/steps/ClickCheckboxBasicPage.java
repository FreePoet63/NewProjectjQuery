package steps;

import io.cucumber.java.en.Then;
import pages.BasePage;

public class ClickCheckboxBasicPage {
    BasePage basePage = new BasePage();

    @Then("Click {string} link in Widgets left menu section")
    public void clickLinkInWidgetsLeftMenuSection(String arg0) {
        basePage.clickCheckbox(arg0);
    }

    @Then("Click {string} in Widgets left menu section")
    public void clickInWidgetsLeftMenuSection(String arg0) {
        basePage.newClickCheckbox(arg0);
    }
}
