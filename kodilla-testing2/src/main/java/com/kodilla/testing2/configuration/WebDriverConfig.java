package com.kodilla.testing2.configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverConfig {

    public final static String CHROME = "CHROME_DRIVER";
    public static WebDriver getDriver(final String driver) {
        System.setProperty("webdriver.chrome.driver", "/Users/bart/Downloads/chromedriver");

        if (driver.equals(CHROME)) {
            return new ChromeDriver();
        } else {
            return null;
        }
    }
}
