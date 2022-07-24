package tests.base.auth;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static common.CommonActions.clearBrowserCookieAndStorage;

public class AuthorizationTest extends BaseTest {

    @BeforeEach
    @Override
    public void setUp() {
        super.setUp();
        
    }

    @Test
    public void loginTest(){
        //clearBrowserCookieAndStorage();
        authPage.isAuthWindowVisible();
        authPage.clickToLoginInput();
        Selenide.sleep(1000);
        authPage.clickToPasswordInput();
        Selenide.sleep(1000);
        authPage.submitLoginButton();
        Selenide.sleep(3000);
    }
}
