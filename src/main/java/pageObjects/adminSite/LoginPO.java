package pageObjects.adminSite;

import PageUIs.adminSite.LoginPUI;
import commons.BaseAction;
import commons.GlobalConstants;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageGenerator.AdminPageGeneratorManager;

public class LoginPO extends BaseAction {
    private WebDriver driver;

    public LoginPO(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void isLoginPageLoaded() {
        waitForElementVisible(driver, LoginPUI.LOGIN_BUTTON);
    }

    public void enterValidUsername() {
        waitForElementVisible(driver, LoginPUI.USER_ID_TEXTBOX);
        senkeyToElement(driver, LoginPUI.USER_ID_TEXTBOX, GlobalConstants.getGlobalConstants().getAdminUsername());
    }

    public void enterInvalidUsername() {
        waitForElementVisible(driver, LoginPUI.USER_ID_TEXTBOX);
        senkeyToElement(driver, LoginPUI.USER_ID_TEXTBOX, GlobalConstants.getGlobalConstants().getAdminInvalidUsername());
    }

    public void enterValidPassword() {
        waitForElementVisible(driver, LoginPUI.PASSWORD_TEXTBOX);
        senkeyToElement(driver, LoginPUI.PASSWORD_TEXTBOX, GlobalConstants.getGlobalConstants().getAdminPassword());
    }

    public DashboardPO clickToLoginButton() {
        waitForElementClickable(driver, LoginPUI.LOGIN_BUTTON);
        clickToElement(driver, LoginPUI.LOGIN_BUTTON);
        return AdminPageGeneratorManager.getAdminDashboardPage(driver);
    }

    public DashboardPO entersValidCredentials() {
        waitForElementVisible(driver, LoginPUI.USER_ID_TEXTBOX);
        senkeyToElement(driver, LoginPUI.USER_ID_TEXTBOX, GlobalConstants.getGlobalConstants().getAdminUsername());
        waitForElementVisible(driver, LoginPUI.PASSWORD_TEXTBOX);
        senkeyToElement(driver, LoginPUI.PASSWORD_TEXTBOX, GlobalConstants.getGlobalConstants().getAdminPassword());
        waitForElementClickable(driver, LoginPUI.LOGIN_BUTTON);
        clickToElement(driver, LoginPUI.LOGIN_BUTTON);
        return AdminPageGeneratorManager.getAdminDashboardPage(driver);
    }

    public void userLogin(String userName, String passWord) {
        waitForElementVisible(driver, LoginPUI.USER_ID_TEXTBOX);
        senkeyToElement(driver, LoginPUI.USER_ID_TEXTBOX, userName);
        waitForElementVisible(driver, LoginPUI.PASSWORD_TEXTBOX);
        senkeyToElement(driver, LoginPUI.PASSWORD_TEXTBOX, passWord);
        waitForElementClickable(driver, LoginPUI.LOGIN_BUTTON);
        clickToElement(driver, LoginPUI.LOGIN_BUTTON);
    }

    public DashboardPO resetPassword() {
        waitForElementVisible(driver, LoginPUI.NEW_PASSWORD_TEXTBOX);
        senkeyToElement(driver, LoginPUI.NEW_PASSWORD_TEXTBOX, GlobalConstants.getGlobalConstants().getCommon_password());
        waitForElementVisible(driver, LoginPUI.CONFIRM_PASSWORD_TEXTBOX);
        senkeyToElement(driver, LoginPUI.CONFIRM_PASSWORD_TEXTBOX, GlobalConstants.getGlobalConstants().getCommon_password());
        waitForElementClickable(driver, LoginPUI.APPLY_BUTTON);
        clickToElement(driver, LoginPUI.APPLY_BUTTON);
        return AdminPageGeneratorManager.getAdminDashboardPage(driver);
    }

    public void selectEnglishLanguage() {
        selectItemInCustomDropdown(driver, LoginPUI.LANGUAGE_DROPDOWN_PARENT_LOCATOR, LoginPUI.LANGUAGE_DROPDOWN_CHILD_LOCATOR, "English");
    }

    public void checkInvalidCredentialsErrorMessageDisplayed() {
        waitForElementVisible(driver, LoginPUI.LOGIN_POPUP_MESSAGE);
        Assert.assertEquals(getElementText(driver, LoginPUI.LOGIN_POPUP_MESSAGE), "Invalid ID or Password.");
    }

}
