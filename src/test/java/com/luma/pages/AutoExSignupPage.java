package com.luma.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutoExSignupPage {

    public AutoExSignupPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//b[text()='Enter Account Information']")
    private WebElement header;

    public String getHeaderText() {
        return header.getText();
    }
}
