package com.smartbear.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.util.List;
import java.util.Locale;

public class OrderPage {
    public OrderPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(tagName = "select")
    WebElement productBox;
    @FindBy(xpath = "//input[contains(@id,'Quantity')]")
    WebElement quantityBox;
    @FindBy(xpath = "//input[contains(@id,'Name')]")
    WebElement fullNameBox;
    @FindBy(xpath = "//input[contains(@id,'TextBox2')]")
    WebElement addressBox;
    @FindBy(xpath = "//input[contains(@id,'TextBox3')]")
    WebElement cityBox;
    @FindBy(xpath = "//input[contains(@id,'TextBox4')]")
    WebElement stateBox;
    @FindBy(xpath = "//input[contains(@id,'TextBox5')]")
    WebElement zipCodeBox;
    @FindBy(xpath = "//input[contains(@value,'Visa')]")
    WebElement visaCard;
    @FindBy(xpath = "//input[contains(@value,'MasterCard')]")
    WebElement masterCard;
    @FindBy(xpath = "//input[contains(@value,'American Express')]")
    WebElement americanExpressCard;
    @FindBy(xpath = "//input[contains(@id,'TextBox6')]")
    WebElement cardNumber;
    @FindBy(xpath = "//input[contains(@name,'TextBox1')]")
    WebElement expDate;
    @FindBy(xpath = "//a[contains(@id,'InsertButton')]")
    WebElement processButton;
    @FindBy(tagName = "strong")
    WebElement message;

    public void chooseProductAndQuantity(String product, String quantity) {
        BrowserUtils.selectBy(productBox, product, "value");
        quantityBox.sendKeys(quantity);
    }

    public void createPersonalInfoAccount(String fullName, String address, String city, String state, String zipCode) {
        fullNameBox.sendKeys(fullName);
        addressBox.sendKeys(address);
        cityBox.sendKeys(city);
        stateBox.sendKeys(state);
        zipCodeBox.sendKeys(zipCode);
    }

    public void sendPaymentInfo(String cardType, String cardNumber, String expDate) {
        selectCard(cardType);
        this.cardNumber.sendKeys(cardNumber);
        this.expDate.sendKeys(expDate);

    } //we are calling a method inside another method

    public void selectCard(String cardType) {
        cardType = cardType.toUpperCase();
        switch (cardType) {
            case "VISA":
                visaCard.click();
                break;
            case "MASTERCARD":
                masterCard.click();
                break;
            case "AMERICAN EXPRESS":
                americanExpressCard.click();
                break;
            default:
                System.out.println("Card Type Is Incorrect. Please DoubleCheck");
        }//THIS METHOD WAS IMPLEMENTED TO CHOOSE THE CARD TYPE
    }

    public void createAndValidateAccountFunctionality(String expectedMessage) throws InterruptedException {
        processButton.click();
        Thread.sleep(1000);
        Assert.assertEquals(expectedMessage, BrowserUtils.getText(message));
    }

}
