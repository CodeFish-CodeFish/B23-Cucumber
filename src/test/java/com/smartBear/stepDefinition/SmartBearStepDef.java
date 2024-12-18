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

import java.util.Map;

public class SmartBearStepDef {

    WebDriver driver = DriverHelper.getDriver();

    SmartBearLoginPage loginPage = new SmartBearLoginPage(driver);
    SmartBearMainPage mainPage = new SmartBearMainPage(driver);
    SmartBearOrderPage orderPage = new SmartBearOrderPage(driver);


    @Given("user navigates to smart bear url user logs in as follows")
    public void user_navigates_to_smart_bear_url_user_logs_in_as_follows(io.cucumber.datatable.DataTable dataTable) {
        driver.get(ConfigReader.readProperty("smartBearUrl"));
        Map<String, String> userCredentials = dataTable.asMap();
        String username = userCredentials.get("username");
        String password = userCredentials.get("password");
        loginPage.userLogin(username, password);

    }

    @When("user is on main page of smart bear user clicks on order tab")
    public void user_is_on_main_page_of_smart_bear_user_clicks_on_order_tab() {
        mainPage.clickOnOrderTab();
    }

    @Then("user is on order page and selects product and quantity as follows")
    public void user_is_on_order_page_and_selects_product_and_quantity_as_follows(io.cucumber.datatable.DataTable dataTable) {
        Map<String, String> productQuantity = dataTable.asMap();
        orderPage.productAndQuantity(productQuantity.get("product"), productQuantity.get("quantity"));
    }

    @Then("user enters customer name")
    public void user_enters_customer_name(io.cucumber.datatable.DataTable dataTable) {
        Map<String, String> customerName = dataTable.asMap();
        orderPage.customerName(customerName.get("name"));
    }

    @Then("user enters street and city")
    public void user_enters_street_and_city(io.cucumber.datatable.DataTable dataTable) {

        Map<String, String> streetCity = dataTable.asMap();
        orderPage.streetAndCity(streetCity.get("street"), streetCity.get("city"));

    }

    @Then("user enters state and zipcode")
    public void user_enters_state_and_zipcode(io.cucumber.datatable.DataTable dataTable) {

        Map<String, String> stateZipcode = dataTable.asMap();
        orderPage.stateAndZipcode(stateZipcode.get("state"), stateZipcode.get("zipcode"));

    }

    @Then("user clicks on visa radio button")
    public void user_clicks_on_visa_radio_button() {
        orderPage.clickOnVisaRadioButton();
    }

    @Then("user enters cc number along with its expiration date")
    public void user_enters_cc_number_along_with_its_expiration_date(io.cucumber.datatable.DataTable dataTable) {
        Map<String, String> ccAndExp = dataTable.asMap();
        orderPage.ccAndExp(ccAndExp.get("cc"), ccAndExp.get("exp"));

    }


}
