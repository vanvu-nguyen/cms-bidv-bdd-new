package com.example.stepDefinitions;

import com.example.hooks.Hooks;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pageGenerator.AdminPageGeneratorManager;
import pageObjects.adminSite.DashboardPO;
import pageObjects.adminSite.LoginPO;

public class DashboardSteps {

    WebDriver driver;
    DashboardPO dashboardPage;
    public DashboardSteps() {
        this.driver = Hooks.openAndQuitBrowser();
        this.dashboardPage = AdminPageGeneratorManager.getAdminDashboardPage(driver);
    }

    @Then("the admin should be redirected to the dashboard page")
    public void theAdminShouldBeRedirectedToTheDashboardPage() {
        dashboardPage.checkExtendButtonDisplayed();
    }
}
