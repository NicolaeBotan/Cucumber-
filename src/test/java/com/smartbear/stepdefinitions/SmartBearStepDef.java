package com.smartbear.stepdefinitions;

import com.smartbear.pages.LoginPage;
import com.smartbear.pages.MainPage;
import com.smartbear.pages.OrderPage;
import com.smartbear.pages.ViewAllOrdersPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*; //we put star here to import all classes
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

import java.util.List;
import java.util.Map;

public class SmartBearStepDef {
    WebDriver driver = DriverHelper.getDriver();
    OrderPage orderPage = new OrderPage(driver);
    MainPage mainPage = new MainPage(driver);
    LoginPage loginPage = new LoginPage(driver);
    ViewAllOrdersPage allOrdersPage = new ViewAllOrdersPage(driver);

    @When("User enters the userName and password and hits logIn button")
    public void user_enters_the_user_name_and_password_and_hits_log_in_button() {
        loginPage.setLoginFunctionality(ConfigReader.readProperty("userName"),
                ConfigReader.readProperty("password"));
    }

    @Then("User clicks on Order button")
    public void user_clicks_on_order_button() {
        mainPage.setOrderButton();
    }

    @Then("User chooses {string} and enters {string}")
    public void user_chooses_and_enters(String product, String quantity) {
        orderPage.chooseProductAndQuantity(product, quantity);
    }

    @Then("User enters the {string} and {string} and {string} and {string} and {string}")
    public void user_enters_the_and_and_and_and(String fullName, String streetAddress, String city,
                                                String state, String zipCode) {
        orderPage.createPersonalInfoAccount(fullName, streetAddress, city, state, zipCode);

    }

    @Then("User chooses {string} and enters {string} and {string}")
    public void user_chooses_and_enters_and(String cardOption, String cardNumber, String expDate) {
        orderPage.sendPaymentInfo(cardOption, cardNumber, expDate);
    }

    @Then("User clicks Process Button and Validates the message {string}")
    public void user_clicks_process_button_and_validates_the_message(String message) throws InterruptedException {
        orderPage.createAndValidateAccountFunctionality(message);
    }

    @Then("User validates all information {string},{string},{string},{string},{string},{string},{string}," +
            "{string},{string},{string}")
    public void user_validates_all_information(String name, String product, String quantity, String street,
                                               String city, String state, String zipCode, String cardType,
                                               String cardNumber, String expDate) {
        mainPage.clickViewAllOrders();
        allOrdersPage.validateOrderInformation(name, product, quantity, street, city, state, zipCode, cardType,
                cardNumber, expDate);
    }


    //HERE IN THE SAME STEP DEFINITIONS CLASS WE IMPLEMENT DATA TABLE METHOD FOR TEST CASE CREATION
    // THESE METHODS OR SNIPS WILL NOT INTERACT WITH EACH OTHER BECAUSE EACH SNIP HAS ITS OWN NAME THAT WE
    //CREATED IN FEATURE FILES
    @Then("User chooses product and enters quantity")
    public void user_chooses_product_and_enters_quantity(DataTable dataTable) {
        Map<String, String> productInfo = dataTable.asMap();
        //We created this map to make the connection between our future file and this snip
        //System.out.println(productInfo);
        orderPage.chooseProductAndQuantity(productInfo.get("product"), productInfo.get("quantity"));
    }

    @Then("User enters the name, street, city, state, zipCode")
    public void user_enters_the_name_street_city_state_zip_code(DataTable dataTable) {
        Map<String, String> customerInfo = dataTable.asMap();
        orderPage.createPersonalInfoAccount(customerInfo.get("name"), customerInfo.get("street"),
                customerInfo.get("city"), customerInfo.get("state"), customerInfo.get("zipCode"));
    }

    @Then("User chooses cardType and enters, cardNumber, expDate")
    public void user_chooses_card_type_and_enters_card_number_exp_date(DataTable dataTable) {
        Map<String, String> cardInfo = dataTable.asMap();
        orderPage.sendPaymentInfo(cardInfo.get("cardType"), cardInfo.get("cardNumber"), cardInfo.get("expDate"));
    }

    @Then("User clicks Process Button and Validates the message")
    public void user_clicks_process_button_and_validates_the_message(DataTable dataTable) throws InterruptedException {
        List<String> message = dataTable.asList();
        orderPage.createAndValidateAccountFunctionality(message.getFirst());
        //getFirst() method means get the value with index 0 from List
    }
}

