package com.luma.stepDefinitions;

import com.luma.pages.GoogleHomePage;
import com.luma.pages.GoogleResultsPage;
import com.utils.DriverHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class GoogleStepDef {
    private WebDriver driver;

    @Given("user is on google home page")
    public void user_is_on_google_home_page() {
        driver = DriverHelper.getDriver();
        driver.get("https://google.com");
    }

    @When("user searches for iphone")
    public void user_searches_for_iphone() {
        GoogleHomePage ghp = new GoogleHomePage(driver);
        ghp.search("iPhone");
    }

    @Then("user should get more than ten results")
    public void user_should_get_more_than_ten_results() {
        GoogleResultsPage grp = new GoogleResultsPage(driver);
        int expectedLinkCount = 10;
        int actualLinkCount = grp.iPhoneLinkCount();
        Assert.assertTrue(actualLinkCount > expectedLinkCount);
    }

}
