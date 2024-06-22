package com.google.stepdefinitions;

import com.google.pages.MainGooglePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ConfigReader;
import utils.DriverHelper;

public class SearchStepDef {
    WebDriver driver = DriverHelper.getDriver();
    MainGooglePage mainGooglePage = new MainGooglePage(driver);

    @Given("User navigates to Google")
    public void user_navigates_to_google() {
        driver.get(ConfigReader.readProperty("googleUrl"));
    }

    @When("User searches for CodeFish")
    public void user_searches_for_code_fish() {
        mainGooglePage.validateHappySearch("CodeFish");

    }

    @Then("User gets more than ten links on the first page")
    public void user_gets_more_than_ten_links_on_the_first_page() {
        //Assert.assertTrue(mainGooglePage.validateNumberOfLinks());
    }

    @When("User searches for Kyrgyz food in USA")
    public void user_searches_for_kyrgyz_food_in_usa() {
        mainGooglePage.validateHappySearch("Kyrgyz Food in USA");
    }

    @Then("User validates that link contains text")
    public void user_validates_that_link_contains_text() {
        Assert.assertTrue(mainGooglePage.validateResult("Kyrgyz food in Atlanta?"));
    }

    @When("User searches for Turkish Baklava")
    public void user_searches_for_turkish_baklava() {
        mainGooglePage.validateHappySearch("turkish baklava");
    }

    @Then("User validates that search is done in less than one second")
    public void user_validates_that_search_is_done_in_less_than_one_second() {
        mainGooglePage.validateResultBaklava("Pistachio Baklava Recipe - NYT Cooking");
    }
}
