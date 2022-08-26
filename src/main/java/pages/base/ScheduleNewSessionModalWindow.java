package pages.base;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ScheduleNewSessionModalWindow {

    public SelenideElement selectServiceButton = $x("//*[button=\"Select service\"]");
    public SelenideElement chooseService = $x("//*[span=\"Dental Service\"]");
    public SelenideElement meetNowButton = $x("//*[button=\"Meet now\"]");


    public void clickToSelectButton() {
        selectServiceButton.shouldBe(Condition.visible);
        selectServiceButton.click();
    }

    public void clickToSelectService() {
        chooseService.shouldBe(Condition.visible);
        chooseService.click();
    }

    public void clickToMeetNow(){
        meetNowButton.scrollTo();
        meetNowButton.shouldBe(Condition.visible);
        meetNowButton.click();
    }
}
