package com.udemy.automation_design_patterns.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleSpanish extends GoogleEnglish {

    @FindBy(css = "div#SIvCob a")
    private WebElement language;

    public GoogleSpanish(WebDriver driver) {
        super(driver);
    }

    @Override
    public void launchSite() {
        driver.get("https://google.es");
        language.click();
    }



}
