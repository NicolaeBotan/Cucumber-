package com.weborder.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/uiFailedTests.txt", //AFTER WE COPY THE PATH FROM ROOT WE HAVE TO TYPE '@' AT THE
        // BEGINNING
        glue = "com/weborder/stepdefinitions", //here we copied the source root path of the whole stepDefinition
        //Package
        tags = "@regression",
        plugin = {"pretty", "html:target/uiReport.html", "rerun:target/uiFailedTests.txt"}
)


public class WebOrderReRunner {

}
