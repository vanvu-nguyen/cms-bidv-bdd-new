package PageUIs.adminSite;

public class LoginPUI {
    public static final String LANGUAGE_DROPDOWN_PARENT_LOCATOR = "XPATH=//div[contains(@class,'login-select-custom')]";
    public static final String LANGUAGE_DROPDOWN_CHILD_LOCATOR = "XPATH=//span[@class='language-name']/parent::div";
    public static final String USER_ID_TEXTBOX = "XPATH=//input[@id='login-form_userId']";
    public static final String PASSWORD_TEXTBOX = "XPATH=//input[@id='login-form_password']";
    public static final String LOGIN_BUTTON = "XPATH=//button[contains(@class,'btn-login')]";
    public static final String NEW_PASSWORD_TEXTBOX = "XPATH=//p[text()='New password']/ancestor::div[contains(@class,'ant-form-item-label')]/following-sibling::div//input";
    public static final String CONFIRM_PASSWORD_TEXTBOX = "XPATH=//p[text()='Re-type new password']/ancestor::div[contains(@class,'ant-form-item-label')]/following-sibling::div//input";
    public static final String APPLY_BUTTON = "XPATH=//span[text()='Apply']/parent::button";
    public static final String INVALID_CREDENTIALS_ERROR_MESSAGE = "XPATH=//div[contains(@class,'ant-modal-confirm-error')]//div[text()='Invalid ID or Password.']";
}

