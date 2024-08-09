package pages;

import org.openqa.selenium.By;

public class Login {
    public By userName = By.cssSelector("input[name='username']");
    public By password = By.cssSelector("input[name='password']");
    public By loginBtn = By.cssSelector("button[type='submit']");
    public By dashboardTxt = By.cssSelector(".oxd-topbar-header-title .oxd-topbar-header-breadcrumb>h6");
    public By loginPageInvalidCredentialsTxt = By.cssSelector("div[class*='alert-content']>p");
    public By loginPageUsernameRequiredTxt = By.cssSelector(".oxd-form-row:nth-of-type(1)>div>span");
    public By loginPagePasswordRequiredTxt = By.cssSelector(".oxd-form-row:nth-of-type(2)>div>span");
}
