package steps;

import config.TestConfig;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AutocompletePage;

public class AutocompleteSteps {
    AutocompletePage autoPage = new AutocompletePage();

    @Then("Type “a” in Tags field")
    public void typeAInTagsField() {
        autoPage.valueInputAutocomplete();
    }

    @Then("From the list of autocomplete that appears, select the option with the value Asp from the keyboard.")
    public void fromTheListOfAutocompleteThatAppearsSelectTheOptionWithTheValueAspFromTheKeyboard() {
        autoPage.clickListItem();
    }

    @Then("Verify Tags field value is Asp")
    public void verifyTagsFieldValueIsAsp() {
        String valueTags = autoPage.GetValueTags();
        Assert.assertEquals(TestConfig.VALUE_NEWTAGS, valueTags);
    }


}
