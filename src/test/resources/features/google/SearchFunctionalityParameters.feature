Feature: Testing Google Functionality

  Background: navigation to the website
    Given User navigates to 'https://www.google.com/'
    #When the implementation is repeating we use "Background keyword and under we put the line of code
    #That is repeating, so this will run for every Scenario.
    #It must be in order for each Scenario, the line of code that we put in Background

  Scenario: Happy Path(positive) Testing Search
    #Given User navigates to 'https://www.google.com/'
    When User searches for 'CodeFish'
    Then User gets more than 3 links from first page

  Scenario: Happy Path(positive) Result Search
    #Given User navigates to 'https://www.google.com/'
    When User searches for 'Kyrgyz food in USA'
    Then User validates that link contains 'Kyrgyz food in Atlanta?'

  Scenario: Happy Path(positive) Testing Search Result
    #Given User navigates to 'https://www.google.com/'
    When User searches for 'Turkish Baklava'
    Then User validates that the link text is equal to 'Pistachio Baklava Recipe - NYT Cooking'







