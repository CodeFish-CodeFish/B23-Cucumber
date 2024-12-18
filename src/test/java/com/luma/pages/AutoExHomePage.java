package com.luma.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutoExHomePage {

    public AutoExHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@href='/login']")
    private WebElement signUpLink;

    public void clickSignUpLink() {
        signUpLink.click();
    }
}
