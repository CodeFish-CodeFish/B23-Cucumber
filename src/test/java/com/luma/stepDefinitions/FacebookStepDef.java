package com.luma.stepDefinitions;

import com.luma.pages.FBHomePage;
import com.luma.pages.FBLoginPage;
import com.utils.DriverHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class FacebookStepDef {

    private WebDriver driver;

    @Given("user is on Facebook home page")
    public void user_is_on_facebook_home_page() {
        driver = DriverHelper.getDriver();
        driver.get("https://facebook.com");
    }

    @When("user logs in with invalid username")
    public void user_logs_in_with_invalid_username() {
        FBHomePage homePage = new FBHomePage(driver);
        homePage.login("hello.test123@gmail.com", "mycoolpassword");
    }

    @Then("user gets error message")
    public void user_gets_error_message() {
        FBLoginPage loginPage = new FBLoginPage(driver);
        String expectedErrorMessage = "The email you entered isn’t connected to an account. Find your account and log in.";
        String actualErrorMessage = loginPage.getErrorMsg();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }


}
