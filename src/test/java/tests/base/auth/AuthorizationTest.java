package tests.base.auth;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

public class AuthorizationTest extends BaseTest {

    @BeforeEach
    @Override
    public void setUp() {
        super.setUp();

    }

    @Test
    @DisplayName("Authorization as a Provider")
    public void loginProviderTest() {

        loginProvider();
        // Check that header is visible after login
        appointmentsPage.isHeaderProviderVisible();

    }


    public void loginProvider() {
        // Check that auth window visible and click to Login
        authPage.isAuthWindowVisible();
        authPage.clickToProviderLoginInput();
        // Click to password
        authPage.clickToPasswordInput();
        // Click to Submit
        authPage.submitLoginButton();
    }
}
