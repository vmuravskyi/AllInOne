package com.udemy.automation_design_patterns.srp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultStat extends AbstractComponent {

    @FindBy(id = "result-stats")
    private WebElement resultStat;


    public ResultStat(WebDriver driver) {
        super(driver);
    }

    public String getResultStatText() {
        return this.resultStat.getText();
    }

    @Override
    public boolean isDisplayed() {
        return this.wait.until(driver -> this.resultStat.isDisplayed());
    }

}
