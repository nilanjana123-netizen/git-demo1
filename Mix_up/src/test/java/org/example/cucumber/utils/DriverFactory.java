package org.example.cucumber.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class DriverFactory {

    private static WebDriver driver;

    public static WebDriver getDriver() {

        try {
            if (driver == null) {
                ChromeOptions options = new ChromeOptions();

                driver = new RemoteWebDriver(
                        new URL("http://localhost:4444/wd/hub"),
                        options
                );

                driver.manage().window().maximize();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}