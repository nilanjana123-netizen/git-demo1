package hooks;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import utils.ExtentManager;
import com.aventstack.extentreports.*;

import base.DriverFactory;

public class Hooks {

    static ExtentReports extent = ExtentManager.getInstance();
    static ExtentTest test;

    @Before
    public void setup(io.cucumber.java.Scenario scenario) {
        test = extent.createTest(scenario.getName());
        DriverFactory.initDriver();
    }

    @After
    public void tearDown() {
        DriverFactory.quitDriver();
        extent.flush();
    }
}

