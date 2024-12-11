package com.luma.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GoogleResultsPage {

    public GoogleResultsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(partialLinkText = "iPhone")
    private List<WebElement> iPhoneLinks;

    public int iPhoneLinkCount() {
        int count = iPhoneLinks.size();
        return count;
    }


}
