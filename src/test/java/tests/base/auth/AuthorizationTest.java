package tests.base.auth;

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
        clearBrowserCookieAndStorage();
        authPage.isAuthWindowVisible();
        authPage.clickToLoginInput();
    }
}
