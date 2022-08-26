package tests.base;


import org.junit.jupiter.api.TestInstance;

import pages.base.AppointmentsPage;
import pages.base.AuthPage;
import pages.base.BasePage;
import pages.base.ScheduleNewSessionModalWindow;

import java.util.Properties;

import static com.codeborne.selenide.Selenide.*;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {

    static Properties properties = new Properties();
    protected BasePage basePage = new BasePage();


    public AuthPage authPage = new AuthPage();
    public AppointmentsPage appointmentsPage = new AppointmentsPage();
    public ScheduleNewSessionModalWindow scheduleNewSessionModalWindow = new ScheduleNewSessionModalWindow();


    public void setUp() {
        open("https://autotest.trustvideo.click/");
    }


}

