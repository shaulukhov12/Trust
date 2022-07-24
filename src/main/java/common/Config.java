package common;

import com.codeborne.selenide.Configuration;

import java.util.Properties;

public class Config {
    static Properties properties = new Properties();

    /***
     * Specify the browser and platform for test:
     * CHROME_MAC
     * CHROME_WINDOWS
     * MOZILLA_MAC
     */
    public static String CHROME = "chrome";
    public static String FIREFOX = "firefox";
    public static final String BROWSER_AND_PLATFORM = "";
    public static final Boolean CLEAR_COOKIES = true;
    public static final Boolean HOLD_BROWSER_OPEN = true;


    static {
        Configuration.baseUrl = "https://test.trustvideo.click/";
        Configuration.reportsFolder = "build/reports/tests";
        Configuration.browser = CHROME;

    }
}
