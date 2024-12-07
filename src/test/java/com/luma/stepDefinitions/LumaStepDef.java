package com.luma.stepDefinitions;

import com.luma.pages.LumaLoginPage;
import com.luma.pages.LumaMainPage;
import com.utils.DriverHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LumaStepDef {

    WebDriver driver = DriverHelper.getDriver();
    LumaMainPage mainPage = new LumaMainPage(driver);
    LumaLoginPage loginPage = new LumaLoginPage(driver);

    @Given("user navigates to luma page")
    public void user_navigates_to_luma_page() {
        driver.get("https://magento.softwaretestingboard.com/");
    }
    @When("user is on main page user validates the title of the webpage")
    public void user_is_on_main_page_user_validates_the_title_of_the_webpage() {
        String actualTitle = driver.getTitle();
        String expectedTitle = "Home Page";
        Assert.assertEquals(expectedTitle, actualTitle);
    }
    @Then("user clicks on sign in link")
    public void user_clicks_on_sign_in_link() {
        mainPage.clickOnSignInLink();
    }
    @Then("user provides username password and clicks on login button")
    public void user_provides_username_password_and_clicks_on_login_button() {
        loginPage.login();
    }





}
