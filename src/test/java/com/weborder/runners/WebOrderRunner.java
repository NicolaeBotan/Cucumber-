package com.weborder.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/*
   THESE ARE INTERVIEW QUESTIONS:
     1- Runner Class is a way to run all your feature files from here. Regression, Smoke,...
     2- @RunWith --> comes from Junit and executes the feature file steps.
     3- @CucumberOptions --> it is a special annotation that have some keywords inside.
          * features --> the location of Feature Files(this one should be "CONTENT ROOT")
          * glue --> this is the location of StepDefinition File. (this one should be "SOURCE ROOT")
          * dryRun --> this is a way to get "Snips" without executing all steps from beginning.
          * tags --> it is a way to specialize your scenario or specific tag(regression,smoke)
          * plugIn --> it is a way to integrate specific condition for the keyword, mostly used for report card.
      */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/weborder",//feature files
        glue = "com/weborder/stepdefinitions",//step definitions
        dryRun = false,
        //we use dryRun to get Snips without running the whole Scenario.
        //we just make it "true" and run from here, it will give us the Snip of the unimplemented step
        //from feature file. Then you make it false again as default and create our methods in page class.
        tags = "@scenarioOutline", //the tags will run the only Scenarios with this tag name.
        //tags = "@regression and @ahmet or @regression and @mahmut --> in this case or means and, so
        // we tell Java to run those Scenarios that have these keywords/tags
        //"and" refers to one Scenario
        //"or" refers to multiple Scenarios
        plugin = {"pretty", "html:target/uiReport.html", "rerun:target/uiFailedTests.txt"}
        //we use plugin to get the Failed Test txt and To get the Cucumber Report Cards
)
public class WebOrderRunner {

}
