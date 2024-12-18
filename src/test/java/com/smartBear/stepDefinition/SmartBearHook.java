package com.smartBear.stepDefinition;

import com.utils.DriverHelper;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class SmartBearHook {

   WebDriver driver;

    @Before
    public void initializeDriver(){

        driver = DriverHelper.getDriver();
    }


    @After
    public void tearDown(){
        driver.quit();
    }

}
