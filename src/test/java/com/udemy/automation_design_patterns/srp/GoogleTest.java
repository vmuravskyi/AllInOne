package com.udemy.automation_design_patterns.srp;

import org.assertj.core.api.Assertions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {

    private GoogleMainPage googleMainPage;
    private GoogleResultPage googleResultPage;

    @BeforeClass
    public void setup() {
        this.googleMainPage = new GoogleMainPage(getDriver());
        this.googleResultPage = new GoogleResultPage(getDriver());
    }

    @Test(dataProvider = "GoogleWorkFlowData")
    public void googleWorkflow(String keyword, Integer index) {
        googleMainPage.goTo();
        googleMainPage
            .getSearchWidget()
            .enterAsHuman(keyword);
        Assertions.assertThat(googleMainPage.getSearchSuggestion().isDisplayed()).isTrue();

        googleMainPage.getSearchSuggestion().clickOnSuggestionByIndex(index);
        Assertions.assertThat(googleResultPage.getResultStat().isDisplayed()).isTrue();

        googleResultPage.getNavigationBar().goToNews();
        System.out.println(googleResultPage.getResultStat().getResultStatText());
    }

    @DataProvider(name = "GoogleWorkFlowData")
    public Object[][] getObject() {
        return new Object[][]{
            {"selenium", 3},
            {"docker", 2},
            {"kubernetes", 4},
        };
    }

}
