package com.udemy.automation_design_patterns.srp;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    protected ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    @BeforeTest(alwaysRun = true)
    public void setupWebDriver() {
        driver.set(WebDriverManager.chromedriver().create());
    }

    @AfterTest(alwaysRun = true)
    public void quitWebDriver() throws InterruptedException {
        Thread.sleep(1);
        this.driver.get().quit();
    }

    public WebDriver getDriver() {
        return driver.get();
    }

}
