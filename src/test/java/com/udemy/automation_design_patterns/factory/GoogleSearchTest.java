package com.udemy.automation_design_patterns.factory;

import com.udemy.automation_design_patterns.BaseTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GoogleSearchTest extends BaseTest {

    private GooglePage googlePage;

    @Test(dataProvider = "languageProvider")
    public void searchTest(String language, String keyword) {
        // Factory what creates page objects according to language parameter
        googlePage = GoogleFactory.get(language, this.getDriver());

        googlePage.launchSite();
        googlePage.search(keyword);
        int resultCount = googlePage.getResultCount();
        System.out.println("Result count: " + resultCount);
    }

    @DataProvider
    public Object[][] languageProvider() {
        return new Object[][]{
            {"ENG", "selenium"},
            {"FR", "design patterns"},
            {"SA", "docker"}
        };
    }

}
