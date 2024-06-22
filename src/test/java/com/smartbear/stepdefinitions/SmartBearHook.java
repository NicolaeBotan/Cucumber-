package com.smartbear.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import utils.BrowserUtils;
import utils.ConfigReader;
import utils.DriverHelper;

public class SmartBearHook {
    WebDriver driver = DriverHelper.getDriver();

//    @BeforeAll
//    public void clearCaches(){
//        driver.manage().deleteAllCookies();
//        //this will run before everything, abd it wii delete all Cookies
//    }

    @Before
    public void setUp() {
        driver.get(ConfigReader.readProperty("smartBearUrl"));
    }

    @After
    public void tearDown(Scenario scenario) {
        BrowserUtils.getScreenShotForCucumber(driver, scenario);
        driver.quit();
    }
}
