package com.luma.pages;

import com.utils.BrowserUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GoogleResultsPage {

    WebDriver driver;
    public GoogleResultsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(partialLinkText = "iPhone")
    private List<WebElement> iPhoneLinks;

    @FindBy(tagName = "h3")
    private List<WebElement> results;

    public int iPhoneLinkCount() {
        int count = iPhoneLinks.size();
        return count;
    }

    public int getResultsCount() {
        return results.size();
    }


}
