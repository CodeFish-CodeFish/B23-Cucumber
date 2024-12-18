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

    @Given("user navigates to Google home page")
    public void user_navigates_to_google_home_page() {
        driver = DriverHelper.getDriver();
        driver.get("https://google.com");
    }

    @When("user searches for {string} item")
    public void user_searches_for_item(String item) {
        GoogleHomePage ghp = new GoogleHomePage(driver);
        ghp.search(item);
    }

    @Then("results count is greater than one")
    public void results_count_is_greater_than_one() {
        GoogleResultsPage grp = new GoogleResultsPage(driver);
        int expectedCount = 1;
        int actualCount = grp.getResultsCount();
        Assert.assertTrue(actualCount > expectedCount);
    }

    @Then("results count should be greater than {int}")
    public void results_count_should_be_greater_than(int expectedCount) throws InterruptedException {
        GoogleResultsPage grp = new GoogleResultsPage(driver);
        int actualCount = grp.getResultsCount();
        Assert.assertTrue(actualCount > expectedCount);
    }

}
