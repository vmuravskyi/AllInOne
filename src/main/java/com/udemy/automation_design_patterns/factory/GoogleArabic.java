package com.udemy.automation_design_patterns.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

class GoogleArabic extends GoogleEnglish {

    @FindBy(css = "div#gws-output-pages-elements-homepage_additional_languages__als a")
    private WebElement language;

    @FindBy(css = "span.ly0Ckb")
    private WebElement keyboardBtn;

    @FindBy(id = "kbd")
    private WebElement keyboard;

    public GoogleArabic(WebDriver driver) {
        super(driver);
    }

    @Override
    public void launchSite() {
        driver.get("https://google.com.sa");
        language.click();
    }

    @Override
    public void search(String keyword) {
        wait.until(driver -> keyboardBtn.isDisplayed());
        keyboardBtn.click();
        wait.until(driver -> keyboard.isDisplayed());
        super.search(keyword);
    }

}
