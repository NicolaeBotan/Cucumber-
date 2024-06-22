package com.etsy.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EtsyMainPage {
    public EtsyMainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@name='search_query']")
    WebElement searchBox;

    public void searchBoxValidation(String item) {
        searchBox.sendKeys(item, Keys.ENTER);
    }

}
