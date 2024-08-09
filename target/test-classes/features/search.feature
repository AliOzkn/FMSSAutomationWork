@AllSearchScenarios
Feature:OrangeHRM demo page search feature functionality

  Background:
    Given User navigates to OrangeHRM login page "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    Then Verifies that the login page opens with this title "OrangeHRM"
    Given Enters "Admin" value into the email box.
    And Enters "admin123" value into the password box.
    And Clicks on the login button.

  @Smoke
  Scenario: TC_02.01 Verify that the navbar search function works correctly when search and delete operations are performed.
    When Clicks on the Search button in left navbar and enters "maintenance" value to the box.
    Then Verifies that the count of elements in the navbar is 1.
    When Deletes the text entered in the box.
    Then Verifies that the count of elements in the navbar returns to its initial state which is 12.

  @Smoke
  Scenario: TC_02.02 Verify that the filter function works correctly when a valid option is selected and ensure relevant results are displayed.
    When Clicks on the Admin button in left navbar.
    And Clicks on the Status selection box and selects the Enabled option from the dropdown menu.
    And Clicks on the Search button.
    Then Verifies that the Status option in the results appears as "Enabled" only.

  @Smoke
  Scenario: TC_02.03 Verify that the reset button works correctly and that it resets the filtering operation.
    When Clicks on the Admin button in left navbar.
    And Clicks on the Status selection box and selects the Enabled option from the dropdown menu.
    And Clicks on the Search button.
    And Clicks on the Reset button.
    Then Verifies that the selected options have been returned to their default values.

  @Regression
  Scenario: TC_02.04 Check if the number of results matches the previously saved number.
    When Clicks on the Admin button in left navbar.
    And Clicks on the User Role Selection box and selects the ESS option from the dropdown menu.
    And Clicks on the Search button.
    And Saves text showing the number of results found.
    And Goes to another page and then comes back.
    Then Verifies that the previously saved number is not the same as the current number. This confirms that the filtering has been reset.

  @Sanity
  Scenario Outline: TC_02.05 Use special characters and spaces in the filter query and ensure it provides an appropriate error message.
    When Clicks on the Admin button in left navbar.
    And Clicks on the Username field and enters <value> value to the box.
    And Clicks on the Search button.
    Then Verifies that the information and error messages appears with "<messages>" texts.
    Examples:
      | value     | messages          |
      | "**_/\+%" | No Records Found  |
      | "       " | Invalid Parameter |

  @Sanity
  Scenario: TC_02.06 Enter data in an incorrect format such as a text in a date search and ensure it provides an appropriate error message.
    When Clicks on the Recruitment button in left navbar.
    And Clicks on the first date box and writes "test123" to the box.
    And Clicks on the Search button.
    Then Verifies that the error message appears with "Should be a valid date in yyyy-dd-mm format" text.

  @Sanity
  Scenario: TC_02.07 Use invalid date filter and ensure it provides an appropriate error message.
    When Clicks on the Recruitment button in left navbar.
    And Clicks on the first date box and selects today's date.
    And Clicks on the second date box and selects first day of the month.
    Then Verifies that the error message appears with "To date should be after from date" text.

