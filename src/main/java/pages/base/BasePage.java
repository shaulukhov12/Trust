package pages.base;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BasePage {

    /**
     *
     * The method for opening url
     */
    public void goToUrl(String URL){
        open(URL);
    }

    /**
     *
     * A method that cleans the element of the next enters the desired text
     * @param element Selenium WebElement
     * @param value text
     */
    protected void clearAndType(SelenideElement element,String value){
        while (!element.getAttribute("value").equals("")) element.sendKeys(Keys.BACK_SPACE);
        element.sendKeys(value);
    }

    public void checkMessage(String message){
        $(byText(message)).shouldBe(visible);
    }

}
