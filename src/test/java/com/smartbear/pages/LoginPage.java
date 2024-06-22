package com.smartbear.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ConfigReader;

public class LoginPage {
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[contains(@id,'username')]")
    WebElement userName;
    @FindBy(xpath = "//input[contains(@id,'password')]")
    WebElement password;
    @FindBy(xpath = "//input[contains(@id,'login')]")
    WebElement loginButton;

    public void setLoginFunctionality(String userName, String password) {
        this.userName.sendKeys(userName);
        this.password.sendKeys(password);
        loginButton.click();
    }
}
