Feature: Place order functionality

  Scenario: Happy path
    Given user navigates to smart bear url user logs in as follows
      | username | Tester |
      | password | test   |
    When user is on main page of smart bear user clicks on order tab
    Then user is on order page and selects product and quantity as follows
      | product  | ScreenSaver |
      | quantity | 100         |
    Then user enters customer name
      | name | Kobe Kobe |
    And user enters street and city
      | street | 1 N Dearborn st |
      | city   | Chicago         |
    Then user enters state and zipcode
      | state   | IL    |
      | zipcode | 60601 |
    And user clicks on visa radio button
    Then user enters cc number along with its expiration date
      | cc  | 123234335456 |
      | exp | 09/28        |

