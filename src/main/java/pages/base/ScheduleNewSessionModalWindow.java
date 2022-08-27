package pages.base;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.commands.ScrollIntoView;
import com.codeborne.selenide.SelenideElement;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static com.codeborne.selenide.Selenide.$x;

public class ScheduleNewSessionModalWindow {

    Integer tomorrowDate = getDate() + 1;
    String nextDay = tomorrowDate.toString();

    public SelenideElement selectServiceButton = $x("//*[button=\"Select service\"]");
    public SelenideElement chooseService = $x("//*[span=\"Dental Service\"]");
    public SelenideElement meetNowButton = $x("//*[button=\"Meet now\"]");
    public SelenideElement chooseTime = $x("//*[button='12:00 pm']");
    public SelenideElement chooseNextDay = $x("//*[div='" + nextDay + "" + "']");
    public SelenideElement nextStepButton = $x("//*[button='Next step: Participant details']");


    public void clickToSelectButton() {
        selectServiceButton.shouldBe(Condition.visible);
        selectServiceButton.click();
    }

    public void clickToSelectService() {
        chooseService.shouldBe(Condition.visible);
        chooseService.click();
    }

    public void clickToMeetNow() {
        meetNowButton.scrollTo();
        meetNowButton.shouldBe(Condition.visible);
        meetNowButton.click();
    }

    Integer getDate() {
        Calendar calendar = new GregorianCalendar();
        Integer today = calendar.get(Calendar.DAY_OF_MONTH);
        return today;

    }

    public void clickToNextDay() {

        chooseNextDay.scrollIntoView("{inline: \"end\"}");
        chooseNextDay.click();
    }

    public void clickToTime() {
        chooseTime.scrollTo();
        chooseTime.shouldBe(Condition.visible).click();
    }

    public void clickToNextStep() {
        nextStepButton.shouldBe(Condition.visible).click();
    }

}
