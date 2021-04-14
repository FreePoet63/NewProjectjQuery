package steps;

import io.cucumber.java.en.Then;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static ru.yandex.qatools.htmlelements.matchers.WebElementMatchers.hasText;

import org.openqa.selenium.WebElement;
import pages.BasePage;

import java.util.List;

public class SeeMenujQueryWebsite {
    BasePage page = new BasePage();


    @SuppressWarnings("unchecked")
    @Then("Verify left menu bar contains the following sections: Interactions, Widgets, Effects, Utilities.")
    public void verifyLeftMenuBarContainsTheFollowingSectionsInteractionsWidgetsEffectsUtilities() {
        List<WebElement> ele = page.seeMenu();
        assertThat(ele,hasItems(hasText("Interactions"),hasText("Widgets"),hasText("Effects"),hasText("Utilities")));



    }


    }
