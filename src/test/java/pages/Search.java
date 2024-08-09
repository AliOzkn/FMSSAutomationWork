package pages;

import org.openqa.selenium.By;

public class Search {


    /* -----------------------------------------------------------------------------------------------------------------
    TC 02.01 */
    public By navbarSearchBtn = By.cssSelector("input[placeholder='Search']");
    public By navbarOptions = By.cssSelector("ul.oxd-main-menu>li");

    /* -----------------------------------------------------------------------------------------------------------------
    TC 02.02 */
    public By navbarAdminBtn = By.cssSelector("ul.oxd-main-menu>li:first-of-type");
    public By adminTabUserRoleBox = By.cssSelector(".oxd-form-row .oxd-grid-item:nth-of-type(2) .oxd-select-wrapper");
    public By adminTabStatusBox = By.cssSelector(".oxd-form-row .oxd-grid-item:nth-of-type(4) .oxd-select-wrapper");
    public By adminTabUserRoleBoxESSOption = By.cssSelector(".oxd-grid-item:nth-of-type(2) .oxd-select-wrapper .oxd-select-dropdown>div:last-of-type");
    public By adminTabStatusBoxEnabledOption = By.cssSelector(".oxd-grid-item:nth-of-type(4) .oxd-select-wrapper .oxd-select-dropdown>div:nth-of-type(2)");
    public By adminTabStatusResults = By.cssSelector(".oxd-table-card>div>div:nth-of-type(5)");
    public By searchBtn = By.cssSelector("button[type='submit']");

    /* -----------------------------------------------------------------------------------------------------------------
    TC 02.03 */
    public By filterResetBtn = By.cssSelector(".oxd-form-actions>button:first-of-type");
    public By adminTabStatusBoxDefaultOption = By.cssSelector(".oxd-select-text-input");

    /* -----------------------------------------------------------------------------------------------------------------
    TC 02.04 */
    public By adminTabCountOfResults = By.cssSelector(".orangehrm-paper-container>div:nth-of-type(2)>div>span");
    public By navbarPIMBtn = By.cssSelector("ul.oxd-main-menu>li:nth-of-type(2)");

    /* -----------------------------------------------------------------------------------------------------------------
    TC 02.05 */
    public By adminTabUserNameBox = By.cssSelector(".oxd-form-row .oxd-input");
    public By pimTabEmployeeIdMessages = By.cssSelector(".oxd-toast-content>p:last-of-type");

    /* -----------------------------------------------------------------------------------------------------------------
    TC 02.06 */
    public By navbarRecruitmentBtn = By.cssSelector("ul.oxd-main-menu>li:nth-of-type(5)");
    public By recruitmentTabFirstDateBox = By.cssSelector("div[class='oxd-date-input']>input[placeholder='From']");
    public By dateFilterMessages = By.cssSelector("span[class*='group__message']");

    /* -----------------------------------------------------------------------------------------------------------------
    TC 02.07 */
    public By recruitmentTabFirstDateBoxTodayBtn = By.cssSelector("div[class*='calendar-wrapper']>div:last-of-type>div>div:first-of-type");
    public By recruitmentTabSecondDateBox = By.cssSelector("div[class='oxd-date-input']>input[placeholder='To']");
    public By recruitmentTabSecondDateBoxFirstDayOfTheMonth = By.cssSelector("div[class*='calendar-wrapper']>div:nth-of-type(3)>div:first-of-type");

}
