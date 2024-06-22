package com.smartbear.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/smartbear", //feature files content root
        glue = "com/smartbear/stepdefinitions", //stepDefinitions source root
        dryRun = false,
        tags = "@regressionDataTable", //tags from your feature file
        plugin = {"pretty", "html:target/uiReport.html", "rerun:target/uiFailedTests.txt"}

)
public class SmartBearRunner {

}
