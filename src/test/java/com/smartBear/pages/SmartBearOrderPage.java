package com.smartBear.pages;

import com.utils.BrowserUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBearOrderPage {

    public SmartBearOrderPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#ctl00_MainContent_fmwOrder_ddlProduct")
    WebElement productDropdown;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_txtQuantity")
    WebElement quantity;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_txtName")
    WebElement name;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox2")
    WebElement street;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox3")
    WebElement city;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox4")
    WebElement state;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox5")
    WebElement zipcode;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_cardList_0")
    WebElement visaRadioButton;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox6")
    WebElement ccNumber;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox1")
    WebElement expDate;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_InsertButton")
    WebElement processButton;

    public void productAndQuantity(String product, String quantity){

        BrowserUtils.selectBy(this.productDropdown, product, "visibleText");
        this.quantity.sendKeys(quantity);

    }

    public void customerName(String customerName){
        this.name.sendKeys(customerName);
    }

    public void streetAndCity(String street, String city){
        this.street.sendKeys(street);
        this.city.sendKeys(city);
    }

    public void stateAndZipcode(String state, String zipcode){
        this.street.sendKeys(state);
        this.zipcode.sendKeys(zipcode);
    }

    public void clickOnVisaRadioButton(){
        this.visaRadioButton.click();
    }

    public void ccAndExp(String cc, String exp){
        this.ccNumber.sendKeys(cc);
        this.expDate.sendKeys(exp);
        this.processButton.click();
    }














}
