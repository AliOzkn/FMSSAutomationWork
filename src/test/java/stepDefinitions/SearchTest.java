package stepDefinitions;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import pages.Search;

import static org.junit.Assert.*;
import static utility.Driver.driver;

public class SearchTest extends Search {
    String previouslySavedNum;
    String currentNum;

    /* -----------------------------------------------------------------------------------------------------------------
    TC 02.01 */
    @When("Clicks on the Search button in left navbar and enters {string} value to the box.")
    public void clicksOnTheSearchButtonInLeftNavbarAndEntersValueToTheBox(String navbarOptionName) {
        driver.findElement(navbarSearchBtn).click();
        driver.findElement(navbarSearchBtn).sendKeys(navbarOptionName);
    }

    @Then("Verifies that the count of elements in the navbar is {int}.")
    public void verifiesThatTheCountOfElementsInTheNavbarIs(int expectedCount) {
        int actualCount = driver.findElements(navbarOptions).size();
        assertEquals(expectedCount, actualCount);
    }

    @When("Deletes the text entered in the box.")
    public void deletesTheTextEnteredInTheBox() throws InterruptedException {
        driver.findElement(navbarSearchBtn).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        Thread.sleep(1000);
    }

    @Then("Verifies that the count of elements in the navbar returns to its initial state which is {int}.")
    public void verifiesThatTheCountOfElementsInTheNavbarReturnsToItsInitialStateWhichIs(int initialCount) {
        int actualCount = driver.findElements(navbarOptions).size();
        assertEquals(initialCount, actualCount);
    }

    /* -----------------------------------------------------------------------------------------------------------------
    TC 02.02 */
    @When("Clicks on the Admin button in left navbar.")
    public void clicksOnTheAdminButtonInLeftNavbar() {
        driver.findElement(navbarAdminBtn).click();
    }

    @And("Clicks on the User Role Selection box and selects the ESS option from the dropdown menu.")
    public void clicksOnTheUserRoleSelectionBoxAndSelectsTheESSOptionFromTheDropdownMenu() throws InterruptedException {
        driver.findElement(adminTabUserRoleBox).click();
        Thread.sleep(1000);
        driver.findElement(adminTabUserRoleBoxESSOption).click();
    }
    @And("Clicks on the Status selection box and selects the Enabled option from the dropdown menu.")
    public void clicksOnTheStatusSelectionBoxAndSelectsTheEnabledOptionFromTheDropdownMenu() throws InterruptedException {
        driver.findElement(adminTabStatusBox).click();
        Thread.sleep(1000);
        driver.findElement(adminTabStatusBoxEnabledOption).click();
    }

    @And("Clicks on the Search button.")
    public void clicksOnTheSearchButton() throws InterruptedException {
        driver.findElement(searchBtn).click();
        Thread.sleep(1000);
    }

    @Then("Verifies that the Status option in the results appears as {string} only.")
    public void verifiesThatTheStatusOptionInTheResultsAppearsAsESSOnly(String expectedValue) {
        for (int i = 0; i < driver.findElements(adminTabStatusResults).size(); i++) {
            assertEquals(expectedValue, driver.findElements(adminTabStatusResults).get(i).getText());
        }
    }

    /* -----------------------------------------------------------------------------------------------------------------
    TC 02.03 */

    @And("Clicks on the Reset button.")
    public void clicksOnTheResetButton() {
        driver.findElement(filterResetBtn).click();
    }

    @Then("Verifies that the selected options have been returned to their default values.")
    public void verifiesThatTheSelectedOptionsHaveBeenReturnedToTheirDefaultValues() {
        String defaultOptionTxt = driver.findElement(adminTabStatusBoxDefaultOption).getText();
        assertTrue(defaultOptionTxt.contains("Select"));
    }
    /* -----------------------------------------------------------------------------------------------------------------
    TC 02.04 */

    @And("Saves text showing the number of results found.")
    public void savesTextShowingTheNumberOfResultsFound() {
        previouslySavedNum = driver.findElement(adminTabCountOfResults).getText();
    }

    @And("Goes to another page and then comes back.")
    public void goesToAnotherPageAndThenComesBack() {
        driver.findElement(navbarPIMBtn).click();
        driver.findElement(navbarAdminBtn).click();
    }

    @Then("Verifies that the previously saved number is not the same as the current number. This confirms that the filtering has been reset.")
    public void verifiesThatThePreviouslySavedNumberIsNotTheSameAsTheCurrentNumberThisConfirmsThatTheFilteringHasBeenReset() {
        currentNum = driver.findElement(adminTabCountOfResults).getText();
        assertNotEquals(previouslySavedNum, currentNum);
    }

    /* -----------------------------------------------------------------------------------------------------------------
    TC 02.05 */
    @And("Clicks on the Username field and enters {string} value to the box.")
    public void clicksOnTheUsernameFieldAndEntersValueValueToTheBox(String invalidValues) throws InterruptedException {
        driver.findElement(adminTabUserNameBox).click();
        driver.findElement(adminTabUserNameBox).sendKeys(invalidValues);
        driver.findElement(searchBtn).click();
        Thread.sleep(1000);

    }
    @Then("Verifies that the information and error messages appears with {string} texts.")
    public void verifiesThatTheInformationAndErrorMessagesAppearsWithTexts(String expectedMessages) {
        assertEquals(expectedMessages, driver.findElement(pimTabEmployeeIdMessages).getText());
    }

    /* -----------------------------------------------------------------------------------------------------------------
    TC 02.06 */
    @When("Clicks on the Recruitment button in left navbar.")
    public void clicksOnTheRecruitmentButtonInLeftNavbar() {
        driver.findElement(navbarRecruitmentBtn).click();
    }

    @And("Clicks on the first date box and writes {string} to the box.")
    public void clicksOnTheFirstDateBoxAndWritesToTheBox(String dateText) {
        driver.findElement(recruitmentTabFirstDateBox).click();
        driver.findElement(recruitmentTabFirstDateBox).sendKeys(dateText);
    }

    @Then("Verifies that the error message appears with {string} text.")
    public void verifiesThatTheErrorMessageAppearsWithText(String expectedMessages) {
        assertEquals(expectedMessages, driver.findElement(dateFilterMessages).getText());
    }


    /* -----------------------------------------------------------------------------------------------------------------
    TC 02.07 */
    @And("Clicks on the first date box and selects today's date.")
    public void clicksOnTheFirstDateBoxAndSelectsTodaySDate() {
        driver.findElement(recruitmentTabFirstDateBox).click();
        driver.findElement(recruitmentTabFirstDateBoxTodayBtn).click();
    }

    @And("Clicks on the second date box and selects first day of the month.")
    public void clicksOnTheSecondDateBoxAndSelectsFirstDayOfTheMonth() throws InterruptedException {
        driver.findElement(recruitmentTabSecondDateBox).click();
        Thread.sleep(1000);
        driver.findElement(recruitmentTabSecondDateBoxFirstDayOfTheMonth).click();
    }



}
