package com.weborder.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class WebOrderOrderPage {
    public WebOrderOrderPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//label[@for='GroupOrder']")
    WebElement groupOrderBox;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement submitButton;
    @FindBy(css = "#InviteNote")
    WebElement noteBox;
    @FindBy(css = "#InviteList")
    WebElement inviteListBox;
    @FindBy(css = "#ConfirmAddressID")
    WebElement addressBox;
    @FindBy(css = "#addressPreview")
    WebElement chosenAddress;
    @FindBy(css = "#createGroupOrder")
    WebElement createOrderButton;
    @FindBy(tagName = "h1")
    WebElement header;
    @FindBy(xpath = "//div[@id='mainColumn']//p[1]")
    WebElement paragraph;

    public void groupOrderSubmitFunction() throws InterruptedException {
        groupOrderBox.click();
        //Thread.sleep(2000);
        submitButton.click();
        //Thread.sleep(2000);
    }

    public void sendNotesToInvitees(String note) throws InterruptedException {
        noteBox.sendKeys(note);
        //Thread.sleep(2000);
    }

    public void setEmailInviteList(String email1, String email2) throws InterruptedException {
        inviteListBox.sendKeys(email1 + "," + email2);//we use this to separate them with comma
        //Thread.sleep(2000);
    }

    public void selectAddressAndValidate(String location, String address) throws InterruptedException {
        BrowserUtils.selectBy(addressBox, location, "text");
        //Thread.sleep(2000);
        Assert.assertTrue(BrowserUtils.getText(chosenAddress).contains(address));
    }

    public void selectCreateGroupButton() throws InterruptedException {
        createOrderButton.click();
        Thread.sleep(1000);
    }

    public void validateHeader(String headerMessage) {
        Assert.assertEquals(headerMessage, BrowserUtils.getText(header));
    }

    public boolean validateParagraph(String text){
        return BrowserUtils.getText(paragraph).contains(text);
    }
}
