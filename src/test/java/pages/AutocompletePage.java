package pages;

import config.TestConfig;
import elements.ElementCollection;
import elements.InputField;
import frames.Frame;

import static com.codeborne.selenide.Selenide.sleep;

public class AutocompletePage {
    InputField field = new InputField();
    Frame frame = new Frame();
    ElementCollection elementCollection = new ElementCollection();

    public void valueInputAutocomplete() {
        frame.openFrame();
        field.newSetInput(TestConfig.VALUE_TAGS);
    }

    public void clickListItem() {
        sleep(2000);
        field.clickList();
    }

    public String GetValueTags() {
       return field.valueField();
    }



}
