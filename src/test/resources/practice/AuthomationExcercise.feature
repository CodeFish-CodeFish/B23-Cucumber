Feature: Automation exercise

  Scenario: Sign up form
    Given user navigated to Automation exercise home page
    When user clicks on sign up link
    And enters "test" username
    And enters "13534test90234234@gmail.com" email
    Then user should see "ENTER ACCOUNT INFORMATION" header
