package com.udemy.automation_design_patterns.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleFrench extends GoogleEnglish {

    @FindBy(css = "div#gws-output-pages-elements-homepage_additional_languages__als a")
    private WebElement french;

    public GoogleFrench(WebDriver driver, WebElement french) {
        super(driver);
        this.french = french;
    }

    @Override
    public void launchSite() {

    }

    @Override
    public void search(String keyword) {

    }

    @Override
    public int getResultCount() {
        return 0;
    }

}
