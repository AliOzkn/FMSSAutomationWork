@AllLoginScenarios
Feature: OrangeHRM demo page login feature functionality

  Background:
    Given User navigates to OrangeHRM login page "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    Then Verifies that the login page opens with this title "OrangeHRM"

  @Smoke
  Scenario: TC_01.01 The user should be able to log in successfully.
    When Enters "Admin" value into the email box.
    And Enters "admin123" value into the password box.
    And Clicks on the login button.
    Then Verifies that the dashboard page opens with this "Dashboard" text.

  @Regression
  Scenario Outline: TC_01.02 Error message should appear when trying to log in with invalid data
    When Enters "<name>" value into the email box.
    And Enters "<password>" value into the password box.
    And Clicks on the login button.
    Then Verifies that the login page error message appears with "Invalid credentials" text.
    Examples:
    # 1) Valid username, invalid password
    # 2) Invalid username, valid password
    # 3) Both invalid
      | name      | password  |
      | Admin     | admin1234 |
      | admin1234 | admin123  |
      | admin1234 | admin1234 |

  @Regression
  Scenario: TC_01.03 Error messages should appear when trying to log in without data
    When Clicks on the login button.
    Then Verifies that the login page error messages appears for both fields with "Required" text.


