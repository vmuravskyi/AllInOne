package com.udemy.automation_design_patterns.srp.result;

import com.udemy.automation_design_patterns.srp.common.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NavigationBar extends AbstractComponent {

    @FindBy(id = "hdtb")
    private WebElement bar;

    @FindBy(linkText = "Images")
    private WebElement images;

    @FindBy(xpath = "//a[@data-hveid='CAEQBQ']")
    private WebElement news;

    public NavigationBar(WebDriver driver) {
        super(driver);
    }

    public NavigationBar goToImages() {
        this.images.click();
        return this;
    }

    public NavigationBar goToNews() {
        wait.until(ExpectedConditions.visibilityOf(news));
        this.news.click();
        return this;
    }

    @Override
    public boolean isDisplayed() {
        return this.wait.until(driver -> this.bar.isDisplayed());
    }

}
