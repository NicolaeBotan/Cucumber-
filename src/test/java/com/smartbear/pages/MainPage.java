package com.smartbear.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[.='Order']")
    WebElement orderButton;
    @FindBy(linkText = "View all orders")
    WebElement viewAllOrders;
    @FindBy(xpath = "//a[@href='Products.aspx']")
    WebElement viewAllProducts;

    public void setOrderButton() {
        orderButton.click();
    }

    public void clickViewAllOrders() {
        viewAllOrders.click();
    }
    public void clickViewAllProducts(){
        viewAllProducts.click();
    }
}
