package com.udemy.automation_design_patterns.srp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchWidget extends AbstractComponent {

    @FindBy(name = "q")
    private WebElement searchBox;

    public SearchWidget(WebDriver driver) {
        super(driver);
    }

    public SearchWidget enter(String enter) {
        this.searchBox.clear();
        this.searchBox.sendKeys(enter);
        return this;
    }

    @Override
    public boolean isDisplayed() {
        return this
            .wait
            .until(driver -> this.searchBox.isDisplayed());
    }

}
