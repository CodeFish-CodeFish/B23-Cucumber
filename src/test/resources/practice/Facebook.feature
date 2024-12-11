Feature: Login

  Scenario: Login using invalid username
    Given user is on Facebook home page
    When user logs in with invalid username
    Then user gets error message