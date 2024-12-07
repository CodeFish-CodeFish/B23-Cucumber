package com.luma.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LumaMainPage {

    public LumaMainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(.,'Sign In')]")
    WebElement signInLink;

    public void clickOnSignInLink(){
        this.signInLink.click();
    }
}
