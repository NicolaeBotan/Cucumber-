package com.etsy.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import utils.BrowserUtils;
import utils.ConfigReader;
import utils.DriverHelper;

public class EtsyHook {
    //WE CREATE HOOK CLASS TO CALL OUR DRIVER HELPER AND TO CLOSE OUR DRIVER, ALSO TAKE SCREEN SHOT
    // THIS HOOK CLASS IS CREATED FOR NOT REPEATING OUR SELVES
    WebDriver driver = DriverHelper.getDriver();

//  @Before
//    public void setUp() {
//        driver.get(ConfigReader.readProperty("etsyUrl"));
//    }
//
//    @After
//    public void tearDown(Scenario scenario) {
//        BrowserUtils.getScreenShotForCucumber(driver, scenario);
//        //driver.quit();
//    }
}
