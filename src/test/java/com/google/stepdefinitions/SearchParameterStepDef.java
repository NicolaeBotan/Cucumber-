package com.google.stepdefinitions;

import com.google.pages.MainGooglePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class SearchParameterStepDef {
    WebDriver driver = DriverHelper.getDriver();
    MainGooglePage mainGooglePage = new MainGooglePage(driver);

    @Given("User navigates to {string}")
    public void user_navigates_to(String url) {
        driver.get(url);
    }

    @When("User searches for {string}")
    public void user_searches_for(String text) {
        mainGooglePage.validateHappySearch(text);
    }

    @Then("User gets more than {int} links from first page")
    public void user_gets_more_than_links_from_first_page(int link) {
        Assert.assertTrue(mainGooglePage.validateNumberOfLinks(link));
    }
    @Then("User validates that link contains {string}")
    public void then_user_validates_that_link_contains(String string) {
     Assert.assertTrue(mainGooglePage.validateResult(string));
    }
    @Then("User validates that the link text is equal to {string}")
    public void user_validates_that_the_link_text_is_equal_to(String string) {
       mainGooglePage.validateResultBaklava(string);
    }
}
