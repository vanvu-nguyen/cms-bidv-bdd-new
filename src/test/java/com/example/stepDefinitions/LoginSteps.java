package com.example.stepDefinitions;

import com.example.hooks.Hooks;
import commons.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageGenerator.AdminPageGeneratorManager;
import pageObjects.adminSite.LoginPO;

public class LoginSteps {

    WebDriver driver;
    LoginPO loginPage;
    public LoginSteps() {
        this.driver = Hooks.openAndQuitBrowser();
        this.loginPage = AdminPageGeneratorManager.getAdminLoginPage(driver);
    }

    @Given("the admin is on the login page")
    public void theAdminIsOnTheLoginPage() {
        loginPage.isLoginPageLoaded();
    }

    @When("the admin switches language to English")
    public void theAdminSwitchesLanguageToEnglish() {
        loginPage.selectEnglishLanguage();
    }

    @When("the admin enters valid username")
    public void theAdminEntersValidUsername() {
        loginPage.enterValidUsername();
    }

    @When("the admin enters valid password")
    public void theAdminEntersValidPassword() {
        loginPage.enterValidPassword();
    }

    @When("the admin click to login button")
    public void theAdminClickToLoginButton() {
        loginPage.clickToLoginButton();
    }

    @When("the admin enters invalid username")
    public void theAdminEntersInvalidUsername() {
        loginPage.enterInvalidUsername();
    }

    @Then("the invalid credentials error message displayed")
    public void theInvalidCredentialsErrorMessageDisplayed() {
        loginPage.checkInvalidCredentialsErrorMessageDisplayed();
    }
}
