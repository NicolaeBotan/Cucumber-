@regression
Feature: Testing Login Functionality of WebOrder Page

  @smoke
  Scenario: Testing Positive LogIn(correct userName + correct password)
    #Scenario is mostly for informative purpose, to tell what exactly we are doing in this code.
    #We don't have Given keyword here because we have the Hook class and @Before Annotation
    #Where we are navigating to the website.
    When User provides 'guest1@microworks.com' and 'Guest1!' for WebOrder
    Then User validates the 'ORDER DETAILS - Weborder' from homePage

  Scenario: Testing Negative LogIn(correct userName + wrong password)
    #Scenario is mostly for informative purpose, to tell what exactly we are doing in this code.
    When User provides 'guest1@microworks.com' and 'David' for WebOrder
    Then User validates the 'Sign in Failed' error message

  Scenario: Testing Negative LogIn(wrong userName + correct password)
    #Scenario is mostly for informative purpose, to tell what exactly we are doing in this code.
    When User provides 'guest2@microworks.com' and 'Guest1!' for WebOrder
    Then User validates the 'Sign in Failed' error message

  @smoke
  Scenario: Testing Negative LogIn(wrong userName + wrong password)
    #Scenario is mostly for informative purpose, to tell what exactly we are doing in this code.
    When User provides 'guest2@microworks.com' and 'Guest2!' for WebOrder
    Then User validates the 'Sign in Failed' error message





