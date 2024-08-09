package stepDefinitions;

import io.cucumber.java.en.*;
import pages.Login;

import java.time.Duration;

import static org.junit.Assert.*;
import static utility.Driver.driver;


public class LoginTest extends Login {

    @Given("User navigates to OrangeHRM login page {string}")
    public void userNavigatesToOrangeHRMLoginPage(String url) {
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }

    @Then("Verifies that the login page opens with this title {string}")
    public void verifiesThatTheLoginPageOpensWithThisTitleOrangeHRM(String pageTitle) {
        assertEquals(pageTitle, driver.getTitle());
    }

    @When("Enters {string} value into the email box.")
    public void entersValueIntoTheEmailBox(String uname) {
        driver.findElement(userName).click();
        driver.findElement(userName).sendKeys(uname);
    }

    @And("Enters {string} value into the password box.")
    public void entersValueIntoThePasswordBox(String pass) {
        driver.findElement(password).click();
        driver.findElement(password).sendKeys(pass);
    }

    @And("Clicks on the login button.")
    public void clicksOnTheLoginButton() throws InterruptedException {
        driver.findElement(loginBtn).click();
        Thread.sleep(2000);
    }

    @Then("Verifies that the dashboard page opens with this {string} text.")
    public void verifiesThatTheDashboardPageOpensWithThisText(String dashboardText) {
        assertEquals(dashboardText, driver.findElement(dashboardTxt).getText());
    }

    @Then("Verifies that the login page error message appears with {string} text.")
    public void verifiesThatTheLoginPageErrorMessageAppearsWithText(String errorMessage) {
        assertEquals(errorMessage, driver.findElement(loginPageInvalidCredentialsTxt).getText());
    }

    @Then("Verifies that the login page error messages appears for both fields with {string} text.")
    public void verifiesThatTheLoginPageErrorMessagesAppearsForBothFieldsWithText(String requiredMessage) {
        assertEquals(requiredMessage, driver.findElement(loginPageUsernameRequiredTxt).getText());
        assertEquals(requiredMessage, driver.findElement(loginPagePasswordRequiredTxt).getText());
    }


}
