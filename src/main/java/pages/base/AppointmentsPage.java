package pages.base;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class AppointmentsPage extends BasePage {

    public SelenideElement welcomeHeader = $x("/html/body/div[1]/div[1]/div[2]/main/div/div[2]/div[1]/div[2]/h2");
    public SelenideElement newSessionButton = $x("//*[span=\"Schedule new session\"]");

    public void isHeaderProviderVisible() {
        welcomeHeader.should(Condition.exist);
        welcomeHeader.shouldHave(Condition.exactText("Welcome, Dr. House!"));
    }

    public void isNewSessionButtonVisible() {
        newSessionButton.shouldBe(Condition.visible);
        newSessionButton.click();
        Selenide.sleep(5000);
    }


}