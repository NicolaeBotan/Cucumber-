@scenarioOutline
Feature: Testing Login Functionality of WebOrder WebPage

  Scenario Outline: Testing Different Negative Data for LogIn Functionality
    When User provides '<userName>' and '<password>' for WebOrder
    Then User validates the '<message>' error message
    Examples:
      | userName              | password | message        |
      | guest2@microworks.com | Guest1!  | Sign in Failed |
      | guest2@microworks.com | Guest2!  | Sign in Failed |
      | david@microworks.com  | Guest1!  | Sign in Failed |
      | andrew@microworks.com | Guest1!  | Sign in Failed |
      | maxim@microworks.com  | Guest2!  | Sign in Failed |