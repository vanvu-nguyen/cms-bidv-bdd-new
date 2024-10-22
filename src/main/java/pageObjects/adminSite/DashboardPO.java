package pageObjects.adminSite;

import PageUIs.adminSite.DashboardPUI;
import commons.BaseAction;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DashboardPO extends BaseAction {
    private WebDriver driver;

    public DashboardPO(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void clickToMenuBasicInformation() {
        goToMenuItemByName("Basic Information");
    }


    public void clickToMenuContractManagement() {
        goToMenuItemByName("Contract Management");
    }

    public void checkExtendButtonDisplayed() {
        Assert.assertTrue(isElementDisplayed(driver, DashboardPUI.EXTEND_BUTTON));
    }
}

