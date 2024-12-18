@smoketest
Feature: Google Search

  Background: # this will run before every scenario
    Given user navigates to Google home page

  Scenario: iPhone Search
    When user searches for iphone
    Then user should get more than ten results

   @happyPath #tag
  Scenario: Custom Search
    When user searches for "laptop" item
    Then results count is greater than one

  Scenario: Another Search
    When user searches for "mechanical keyboard" item
    Then results count should be greater than 5

  @smoketest
  Scenario: Search for broken car
    When user searches for "broken car" item
    Then results count should be greater than 7

  @smoketest
  Scenario: Search for house
    When user searches for "house" item
    Then results count should be greater than 9

  Scenario: Search for mouse
    When user searches for "mouse" item
    Then results count should be greater than 11

  Scenario Outline: Search for mouse
    When user searches for "mouse" item
    Then results count should be greater than 11
    Examples:
      | item     | price |
      | phone    | 499   |
      | backpack | 49    |
      | mouse    | 149   |








