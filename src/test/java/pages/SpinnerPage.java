package pages;

import config.TestConfig;
import elements.Alert;
import elements.Button;
import elements.InputField;
import frames.Frame;

public class SpinnerPage {
    InputField inputField = new InputField();
    Button button = new Button();
    Frame frame = new Frame();
    Alert alert = new Alert();

    public void SetValueInputField() {
        frame.openFrame();
        inputField.setInput(TestConfig.VALUE_TESTDATE);
    }
    public void clickButtonGetValue() {
        button.getButton();
    }

    public String alertGetValue() {
        return alert.alertGetValue();

    }
}
