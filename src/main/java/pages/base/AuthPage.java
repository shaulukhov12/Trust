package pages.base;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.util.Properties;

import static com.codeborne.selenide.Selenide.$x;

public class AuthPage extends BasePage {


    public SelenideElement authWindow = $x("//*[@data-baseweb=\"card\"]");
    public SelenideElement inputEmail = $x("//*[@id=\"current-email\"]");
    public SelenideElement inputPassword = $x("//*[@id=\"current-password\"]");
    public SelenideElement hidePasswordText = $x("//*[@title=\"Hide password text\"]");
    public SelenideElement showPasswordText = $x("//*[@title=\"Show password text\"]");
    public SelenideElement submitLoginButton = $x("//*[@type=\"submit\"]");

    // Schedule new session
    public void isAuthWindowVisible() {
        authWindow.shouldBe(Condition.visible);
    }

    public void clickToProviderLoginInput() {
        inputEmail.shouldBe(Condition.visible);
        inputEmail.click();
        inputEmail.sendKeys("dr_house@mailinator.com");
    }

    public void clickToPasswordInput() {
        inputPassword.shouldBe(Condition.visible);
        inputPassword.click();
        inputPassword.sendKeys("P@ssw0rd");
    }

    public void submitLoginButton() {
        submitLoginButton.shouldBe(Condition.visible);
        submitLoginButton.click();
    }


}
