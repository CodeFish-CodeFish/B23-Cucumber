Feature: Login functionality

  @smoketest @regression @happyPath
  Scenario: Positive scenario
    Given user navigates to luma page
    When user is on main page user validates the title of the webpage
    Then user clicks on sign in link
    And user provides username password and clicks on login button
