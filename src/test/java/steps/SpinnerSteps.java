package steps;

import config.TestConfig;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.SpinnerPage;

public class SpinnerSteps {
    SpinnerPage spinnerPage = new SpinnerPage();

    @Then("Enter any digital value In Select a value textbox")
    public void enterAnyDigitalValue() {
        spinnerPage.setValueInputField();
    }

    @Then("Click Get value button")
    public void clickGetValueButton() {
        spinnerPage.clickButtonGetValue();
    }

    @Then("the popup window contains the entered value.")
    public void thePopupWindowContainsTheEnteredValue() {
        String value = spinnerPage.alertGetValue();
        Assert.assertEquals(TestConfig.VALUE_TESTDATE, value);
    }
}
