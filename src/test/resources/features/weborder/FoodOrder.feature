@regression
Feature: Testing Food Order Functionality for WebOrder Page

  Background: Food Order same steps
    Given User provides 'guest1@microworks.com' and 'Guest1!' for WebOrder
    And User validates the 'ORDER DETAILS - Weborder' from homePage
    When User clicks Group Order box and Next button

  Scenario: Testing Happy Path Food Order for my House
   # Given User provides 'guest1@microworks.com' and 'Guest1!' for WebOrder
   # And User validates the 'ORDER DETAILS - Weborder' from homePage
   # When User clicks Group Order box and Next button
    And User sends the keys 'I love Cucumber' as note in the Invite Section
    And User sends email address which are 'ahmet@gmail.com' and 'mehmet@gmail.com' to the Invite List
    And User chooses the delivery address 'My House' and validates the address '3137 Laguna Street'
    And User clicks Create Group Order Button
    Then User validates the Header of Page 'View Group Order'
    And User validates the phrase 'Your group order is now pending' from description

  Scenario: Testing Happy Path Food Order for my Office
   # Given User provides 'guest1@microworks.com' and 'Guest1!' for WebOrder
   # And User validates the 'ORDER DETAILS - Weborder' from homePage
   # When User clicks Group Order box and Next button
    And User sends the keys 'I love Selenium' as note in the Invite Section
    And User sends email address which are 'David@gmail.com' and 'Maxim@gmail.com' to the Invite List
    And User chooses the delivery address 'Office' and validates the address '2012 EMPIRE BLVD'
    And User clicks Create Group Order Button
    Then User validates the Header of Page 'View Group Order'
    And User validates the phrase 'Your group order is now pending' from description