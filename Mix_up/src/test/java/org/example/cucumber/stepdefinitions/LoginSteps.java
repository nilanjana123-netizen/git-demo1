// LoginSteps.java

package org.example.cucumber.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.example.cucumber.pages.LoginPage;
import org.testng.Assert;

public class LoginSteps {

    LoginPage page = new LoginPage();

    @Given("user opens weather website")
    public void openWebsite() {
        page.openWebsite();
    }

    @When("user clicks {string} link")
    public void clickLink(String linkName) {
        page.clickLink(linkName);
        System.out.println("SUCCESS : " + linkName + " page opened successfully");
    }

    @Then("user should navigate successfully")
    public void validateNavigation() {

        String currentUrl = page.getCurrentUrl();

        Assert.assertTrue(
                currentUrl.contains("openweathermap"),
                "Navigation failed"
        );
    }
}