package org.example.cucumber.stepdefinitions;

import io.cucumber.java.After;
import org.example.cucumber.utils.DriverFactory;

public class Hooks {

    @After
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}