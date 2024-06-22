package com.google.pages;

import io.cucumber.java.zh_cn.假如;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.util.List;

public class MainGooglePage {
    public MainGooglePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@title='Search']")
    WebElement searchBox;
    @FindBy(xpath = "//a//h3")
    List<WebElement> allLinks;
    @FindBy(xpath = "//a//h3[contains(text(),'Kyrgyz food in Atlanta?')]")
    WebElement foodAtlanta;
    @FindBy(xpath = "//h3[contains(text(),'Pistachio Baklava Recipe - NYT Cooking')]")
    WebElement baklavaPistachio;

    public void validateHappySearch(String text) {
        searchBox.sendKeys(text, Keys.ENTER);//keys.enter means hit enter without finding the location
        //of enter or search web element
    }

    public boolean validateNumberOfLinks(int number) {
        return (allLinks.size() > number);
    }
    public boolean validateResult(String text){
        return BrowserUtils.getText(foodAtlanta).contains(text);
    }
    public void validateResultBaklava(String text){
        Assert.assertEquals(text,BrowserUtils.getText(baklavaPistachio));
    }
}
