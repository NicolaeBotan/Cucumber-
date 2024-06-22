package com.weborder.stepdefinitions;

import com.weborder.pages.WebOrderOrderPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class WebOrderOrderStepDef {
    WebDriver driver = DriverHelper.getDriver();
    WebOrderOrderPage orderOrderPage = new WebOrderOrderPage(driver);

    @When("User clicks Group Order box and Next button")
    public void user_clicks_group_order_box_and_next_button() throws InterruptedException {
        orderOrderPage.groupOrderSubmitFunction();
    }

    @When("User sends the keys {string} as note in the Invite Section")
    public void user_sends_the_keys_as_note_in_the_invite_section(String note) throws InterruptedException {
        orderOrderPage.sendNotesToInvitees(note);
    }

    @When("User sends email address which are {string} and {string} to the Invite List")
    public void user_sends_email_address_which_are_and_to_the_invite_list(String email1, String email2) throws InterruptedException {
        orderOrderPage.setEmailInviteList(email1, email2);
    }

    @When("User chooses the delivery address {string} and validates the address {string}")
    public void user_chooses_the_delivery_address_and_validates_the_address(String deliveryOption, String address) throws InterruptedException {
        orderOrderPage.selectAddressAndValidate(deliveryOption, address);
    }

    @When("User clicks Create Group Order Button")
    public void user_clicks_create_group_order_button() throws InterruptedException {
        orderOrderPage.selectCreateGroupButton();
    }

    @Then("User validates the Header of Page {string}")
    public void user_validates_the_header_of_page(String expectedHeader) {
        orderOrderPage.validateHeader(expectedHeader);
    }

    @Then("User validates the phrase {string} from description")
    public void user_validates_the_phrase_from_description(String text) {
        Assert.assertTrue(orderOrderPage.validateParagraph(text));
    }
}
