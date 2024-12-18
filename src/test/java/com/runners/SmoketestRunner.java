package com.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = "com/luma/stepDefinitions",
//        tags = "@happyPath and @smoketest and not @regression",
        plugin = {"pretty", "json:target/report.json", "html:target/report.html", "rerun:target/rerun.txt"}
)

public class SmoketestRunner {
}
