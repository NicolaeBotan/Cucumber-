@regression2 @scenarioOutline
Feature: Testing Search Functionality for Etsy Scenario Outline

  Scenario Outline: Testing different data for Search Function
    When User searches for '<item>' on Etsy webApplication
    Then User validates the Title '<title>' from Etsy
    Examples:
      | item | title      |
      | Hat  | Hat - Etsy |
      | Key  | Key - Etsy |
      | Pin  | Pin - Etsy |

  #HERE THIS TEST/SCENARIO WILL RUN 3 TIMES BY USING THE DATA WE PROVIDED
  # AGAIN THIS IMPLEMENTATION IS CREATING FOR NOT REPEATING OUR SELVES
  #THIS CODE IS MORE PROFESSIONAL COMPARING WITH "SEARCH.FEATURE" FILE