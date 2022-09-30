package com.udemy.automation_design_patterns.srp.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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

    public SearchWidget enterAsHuman(String enter) {
        this.searchBox.clear();
        // pretend human is typing
        enter.chars()
            .forEach(character -> {
                this.searchBox.sendKeys(String.valueOf((char) character));
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        return this;
    }

    @Override
    public boolean isDisplayed() {
        return this
            .wait
            .until(driver -> this.searchBox.isDisplayed());
    }

}
