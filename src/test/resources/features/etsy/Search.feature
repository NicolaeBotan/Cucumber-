@regression
Feature: Testing Etsy Search Functionality
  Scenario: Title Validation of Etsy Hat page
    When User searches for 'Hat' on Etsy webApplication
    Then User validates the Title 'Hat - Etsy' from Etsy

  Scenario: Title Validation of Etsy Key page
    When User searches for 'Key' on Etsy webApplication
    Then User validates the Title 'Key - Etsy' from Etsy

  Scenario: Title Validation of Etsy Pin page
    When User searches for 'Pin' on Etsy webApplication
    Then User validates the Title 'Pin - Etsy' from Etsy