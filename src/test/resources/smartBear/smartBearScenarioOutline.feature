Feature: Create order
# this is a comment
  Scenario Outline: create order experience positive scenario
    Given user navigates to login page user provides '<username>' and '<password>'
    When user is on main page and user clicks on orders tab
    Then user selects '<product>' and enters quantity as '<quantity>'
    And user enters their name as '<name>'
    Then user enters their street and city as '<street>' and '<city>'
    And user enters their state and zipcode as '<state>' and '<zipcode>'
    Then user clicks on radio button for visa
    Then user enters their credit card infor as '<cc>' and exp as '<exp>'

    Examples: test data for smart bear order creation experience
      | username | password | product     | quantity | name       | street             | city          | state    | zipcode | cc            | exp   |
      | Tester   | test     | ScreenSaver | 100      | Kobe Abdy  | 900 N Michigan ave | Chitown       | Illinois | 60603   | 23432543546   | 09/29 |
      | Tester   | test     | FamilyAlbum | 500      | Jon Jones  | 1 N Wabash ave     | Chicago       | Illinois | 60607   | 3243465463456 | 04/30 |
      | Tester   | test     | MyMoney     | 34       | Adam Smith | 55 W Madison       | New York City | New York | 43546   | 647876587857  | 04/26 |

# to beautify this file do the following (just like in Java classes):
# windows users --> Control + Alt + l
# mac users --> Command + Option + l

