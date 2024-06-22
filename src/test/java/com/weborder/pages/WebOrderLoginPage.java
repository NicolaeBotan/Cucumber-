package com.weborder.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class WebOrderLoginPage {
    public WebOrderLoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#Email")
    WebElement userName;
    @FindBy(css = "#Password")
    WebElement password;
    @FindBy(xpath = "//button[.='Sign In']")
    WebElement signInButton;
    @FindBy(xpath = "//div[contains(text(),'Sign in Failed')]")
    WebElement errorMessage;

    public void webOrderLogIn(String userName, String password) {
        this.userName.clear();
        this.userName.sendKeys(userName);
        this.password.clear();
        this.password.sendKeys(password);
        signInButton.click();
    }

    public String errorMessageValidation() {
        return BrowserUtils.getText(errorMessage);
    }

}
