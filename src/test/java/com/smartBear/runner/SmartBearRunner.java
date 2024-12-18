package com.smartBear.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/", // feature file location
        glue = "com/smartBear/stepDefinition", // step def location
        dryRun = false// if this is set to true, then test won't run instead it will generate snippets if step definition is not defined
        // if it is set to false, then it will run the test.


)
public class SmartBearRunner{
}
