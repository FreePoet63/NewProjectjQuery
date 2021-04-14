package pages;

import elements.Checkboxes;
import elements.ElementCollection;
import org.openqa.selenium.WebElement;

import java.util.List;


public class BasePage {
    ElementCollection collectionSite = new ElementCollection();
    Checkboxes checkboxes = new Checkboxes();

    public List<WebElement> seeMenu() {
       return collectionSite.menuSite();
    }

    public void clickCheckbox(String arg0) {
        checkboxes.clickElement("Spinner");
    }

    public void newClickCheckbox(String arg0) {
        checkboxes.clickElement("Autocomplete");
    }
}
