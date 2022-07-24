package pages.base;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class AuthPage {

    public SelenideElement AuthWindow = $x("//*[@data-baseweb=\"card\"]");
    public SelenideElement inputEmail = $x("//*[@id=\"current-email\"]");


    public void isAuthWindowVisible() {
        AuthWindow.shouldBe(Condition.visible);
    }

    public void clickToLoginInput(){
        inputEmail.shouldBe(Condition.visible);
        inputEmail.click();
    }
}
