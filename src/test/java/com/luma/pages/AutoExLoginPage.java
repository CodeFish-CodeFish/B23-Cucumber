package com.luma.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutoExLoginPage {

    public AutoExLoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "name")
    private WebElement nameField;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    private WebElement emailField;

    @FindBy(xpath = "//button[@data-qa='signup-button']")
    private WebElement signUpButton;

    public void enterUsername(String username) {
        nameField.sendKeys(username);
    }

    public void enterEmail(String email) {
        emailField.sendKeys(email);
        signUpButton.click();
    }


}
