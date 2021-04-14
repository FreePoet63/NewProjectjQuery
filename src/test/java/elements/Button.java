package elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class Button {

    private SelenideElement getValue = $("#getvalue");

    public void getButton() {
        getValue.click();
    }
}
