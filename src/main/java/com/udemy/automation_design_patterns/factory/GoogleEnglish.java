package com.udemy.automation_design_patterns.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

class GoogleEnglish extends GooglePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    @FindBy(name = "q")
    private WebElement searchBox;

    @FindBy(name = "btnK")
    private WebElement searchButton;

    @FindBy(css = "div.MjjYud")
    private List<WebElement> results;

    public GoogleEnglish(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }

    @Override
    public void launchSite() {
        driver.get("http://www.google.com");
    }

    @Override
    public void search(String keyword) {
        searchBox.sendKeys(keyword);
        wait.until(driver -> searchButton.isDisplayed());
        searchButton.click();
    }

    @Override
    public int getResultCount() {
        wait.until(driver -> results.size() > 1);
        return results.size();
    }

}
