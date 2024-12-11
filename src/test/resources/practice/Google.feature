Feature: Google Search

  Scenario: iPhone Search
    Given user is on google home page
    When user searches for iphone
    Then user should get more than ten results
