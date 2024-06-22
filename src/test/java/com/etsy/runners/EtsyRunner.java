package com.etsy.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/etsy",//feature files content root
        glue = "com/etsy/stepdefinitions",//step definitions source root path
        dryRun = false, //to get the snips without executing we make it "true" then switch back to false
        tags = "@scenarioOutline", //the tags will run the only Scenarios with this tag name.
        plugin = {"pretty", "html:target/uiReport.html", "rerun:target/uiFailedTests.txt"}
        //we use plugin to get the Failed Test txt and To get the Cucumber Report Cards
)
public class EtsyRunner {
}
