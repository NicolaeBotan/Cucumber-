Feature: Testing Google Search Functionality
  #is a general description
  Scenario: Happy Path(positive) Testing for Search
    #Scenario is a Test Case
   Given User navigates to Google
    When User searches for CodeFish
    Then User gets more than ten links on the first page
    #Validation is done in "Then" usually

  Scenario: Happy Path(positive) Testing Result from Search
    Given User navigates to Google
    When User searches for Kyrgyz food in USA
    Then User validates that link contains text

    Scenario: Happy Path(positive) Testing SearchTime from Search
      Given User navigates to Google
      When User searches for Turkish Baklava
      Then User validates that search is done in less than one second











