package com.luma.stepDefinitions;

import com.luma.pages.AutoExHomePage;
import com.luma.pages.AutoExLoginPage;
import com.luma.pages.AutoExSignupPage;
import com.utils.DriverHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.DataTable;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class AutomationExerciseStepDef {

    private WebDriver driver;

    @Given("user navigated to Automation exercise home page")
    public void user_navigated_to_automation_exercise_home_page() {
        driver = DriverHelper.getDriver();
        driver.get("https://www.automationexercise.com/");
    }

    @When("user clicks on sign up link")
    public void user_clicks_on_sign_up_link() {
        AutoExHomePage homePage = new AutoExHomePage(driver);
        homePage.clickSignUpLink();
    }

    @And("enters {string} username")
    public void enters_username(String name) {
        AutoExLoginPage loginPage = new AutoExLoginPage(driver);
        loginPage.enterUsername(name);
    }

    @When("enters {string} email")
    public void enters_email(String email) {
        AutoExLoginPage loginPage = new AutoExLoginPage(driver);
        loginPage.enterEmail(email);
    }

    @Then("user should see {string} header")
    public void user_should_see_header(String expectedHeader) {
        AutoExSignupPage signupPage = new AutoExSignupPage(driver);
        String actualHeader = signupPage.getHeaderText();
        Assert.assertEquals(expectedHeader, actualHeader);
    }


}
