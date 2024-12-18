package com.smartBear.stepDefinition;

import com.smartBear.pages.SmartBearLoginPage;
import com.smartBear.pages.SmartBearMainPage;
import com.smartBear.pages.SmartBearOrderPage;
import com.utils.ConfigReader;
import com.utils.DriverHelper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class SmartBearStepDefScenOutline{

    WebDriver driver = DriverHelper.getDriver();

    SmartBearLoginPage loginPage = new SmartBearLoginPage(driver);
    SmartBearMainPage mainPage = new SmartBearMainPage(driver);
    SmartBearOrderPage orderPage = new SmartBearOrderPage(driver);


    @Given("user navigates to login page user provides {string} and {string}")
    public void user_navigates_to_login_page_user_provides_and(String username, String password) {
        driver.get(ConfigReader.readProperty("smartBearUrl"));
        loginPage.userLogin(username, password);
    }

    @When("user is on main page and user clicks on orders tab")
    public void user_is_on_main_page_and_user_clicks_on_orders_tab() {
        mainPage.clickOnOrderTab();
    }

    @Then("user selects {string} and enters quantity as {string}")
    public void user_selects_and_enters_quantity_as(String product, String quantity) {
        orderPage.productAndQuantity(product, quantity);
    }

    @Then("user enters their name as {string}")
    public void user_enters_their_name_as(String name) {
        orderPage.customerName(name);
    }

    @Then("user enters their street and city as {string} and {string}")
    public void user_enters_their_street_and_city_as_and(String street, String city) {
        orderPage.streetAndCity(street, city);
    }

    @Then("user enters their state and zipcode as {string} and {string}")
    public void user_enters_their_state_and_zipcode_as_and(String state, String zipcode) {
        orderPage.stateAndZipcode(state, zipcode);
    }

    @Then("user clicks on radio button for visa")
    public void user_clicks_on_radio_button_for_visa() {
        orderPage.clickOnVisaRadioButton();
    }

    @Then("user enters their credit card infor as {string} and exp as {string}")
    public void user_enters_their_credit_card_infor_as_and_exp_as(String creditCard, String expiration) {
        orderPage.ccAndExp(creditCard, expiration);
    }



}
