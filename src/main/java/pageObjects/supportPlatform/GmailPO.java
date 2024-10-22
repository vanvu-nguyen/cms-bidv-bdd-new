package pageObjects.supportPlatform;

import PageUIs.supportPlatform.GMailPUI;
import commons.BaseAction;
import org.openqa.selenium.WebDriver;

public class GmailPO extends BaseAction {
    WebDriver driver;
    public GmailPO(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void clickToCmsEmail() {
        waitForElementClickable(driver, GMailPUI.LATEST_EMAIL_RECORD);
        clickToElement(driver, GMailPUI.LATEST_EMAIL_RECORD);
    }

    public String getGeneratedPassword() {
        waitForElementVisible(driver, GMailPUI.PASSWORD);
        return getElementText(driver, GMailPUI.PASSWORD);
    }
}
