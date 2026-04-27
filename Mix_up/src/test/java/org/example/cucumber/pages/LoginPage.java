// LoginPage.java

package org.example.cucumber.pages;

import org.example.cucumber.utils.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver = DriverFactory.getDriver();

    public void openWebsite() {
        driver.get("https://openweathermap.org/");
        driver.manage().window().maximize();
    }

    public void clickLink(String linkName) {

        driver.findElement(
                By.xpath("//a[contains(text(),'" + linkName + "')]")
        ).click();
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
}