package tests.base;


import org.junit.jupiter.api.TestInstance;

import pages.base.AuthPage;
import pages.base.BasePage;

import static com.codeborne.selenide.Selenide.*;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {

    protected BasePage basePage = new BasePage();


    // New part
    public AuthPage authPage = new AuthPage();


    public void setUp() {
        open("https://test.trustvideo.click/");
    }


}

