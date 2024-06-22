package com.etsy.stepdefinitions;

import com.etsy.pages.EtsyMainPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class EtsySearchStepDef {
    WebDriver driver = DriverHelper.getDriver();
    EtsyMainPage etsyMainPage = new EtsyMainPage(driver);

    @When("User searches for {string} on Etsy webApplication")
    public void user_searches_for_on_etsy_web_application(String product) {
        etsyMainPage.searchBoxValidation(product);
    }

    @Then("User validates the Title {string} from Etsy")
    public void user_validates_the_title_from_etsy(String title) {
        Assert.assertEquals(title, driver.getTitle().trim());
    }
}
