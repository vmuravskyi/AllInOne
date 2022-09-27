package com.udemy.automation_design_patterns.srp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchWidget extends AbstractComponent {

    private WebDriverWait wait;

    @FindBy(name = "q")
    private WebElement searchBox;

    public SearchWidget(WebDriver driver) {
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    @Override
    public boolean isDisplayed() {
        return false;
    }

}
