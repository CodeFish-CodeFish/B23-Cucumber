package com.luma.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LumaLoginPage {

    public LumaLoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#email")
    WebElement username;

    @FindBy(css = "input[name='login[password]']")
    WebElement password;

    @FindBy(xpath = "//button[@class='action login primary']")
    WebElement loginButton;

    public void login(){
        this.username.sendKeys("test@te.com");
        this.password.sendKeys("dfsdfdsfds");
        this.loginButton.click();
    }


}
