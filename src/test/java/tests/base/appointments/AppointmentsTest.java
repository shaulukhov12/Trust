package tests.base.appointments;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.base.ScheduleNewSessionModalWindow;
import tests.base.BaseTest;
import tests.base.auth.AuthorizationTest;

import javax.swing.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class AppointmentsTest extends BaseTest {

    AuthorizationTest authorizationTest = new AuthorizationTest();

    @BeforeEach
    @Override
    public void setUp() {
        super.setUp();

    }

    @Test
    @DisplayName("Schedule new session from Provider")
    public void scheduleNewSessionProviderTest() {

        authorizationTest.loginProvider();

        appointmentsPage.isNewSessionButtonVisible();
        // Wу don't need to choose service if we have just one
        //scheduleNewSessionModalWindow.clickToSelectButton();
        Selenide.sleep(3000);

        scheduleNewSessionModalWindow.clickToNextDay();
        Selenide.sleep(5000);
        scheduleNewSessionModalWindow.clickToTime();
        scheduleNewSessionModalWindow.clickToNextStep();
        Selenide.sleep(5000);


    }




}
