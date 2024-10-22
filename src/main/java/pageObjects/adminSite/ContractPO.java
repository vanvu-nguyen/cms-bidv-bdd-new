package pageObjects.adminSite;

import PageUIs.adminSite.ContractPUI;
import commons.BaseAction;
import commons.MonthList;
import org.openqa.selenium.WebDriver;

public class ContractPO extends BaseAction {
    private WebDriver driver;
    public ContractPO(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void clickToRegisterContractButton() {
        waitForElementClickable(driver, ContractPUI.REGISTER_CONTRACT_BUTTON);
        clickToElement(driver, ContractPUI.REGISTER_CONTRACT_BUTTON);
    }

    public void clickToSelectServiceIdButton() {
        waitForElementClickable(driver, ContractPUI.SELECT_SERVICE_ID_BUTTON);
        clickToElement(driver, ContractPUI.SELECT_SERVICE_ID_BUTTON);
    }

    public void sendkeyToServiceIdSearchboxInModal(String serviceId) {
        scrollToElement(driver, ContractPUI.SERVICE_ID_SEARCHBOX_IN_MODAL);
        waitForElementVisible(driver, ContractPUI.SERVICE_ID_SEARCHBOX_IN_MODAL);
        senkeyToElement(driver, ContractPUI.SERVICE_ID_SEARCHBOX_IN_MODAL, serviceId);
    }

    public void clickToChooseCustomer(String serviceId) {
        waitForElementClickable(driver, ContractPUI.SEARCH_RESULT_SERVICE_ID_ON_DATATABLE, serviceId);
        clickToElement(driver, ContractPUI.SEARCH_RESULT_SERVICE_ID_ON_DATATABLE, serviceId);
    }

    public void clickToSelectCustomer() {
        waitForElementClickable(driver, ContractPUI.MODAL_SELECT_BUTTON);
        clickToElement(driver, ContractPUI.MODAL_SELECT_BUTTON);
    }

    public void sendkeyToDepartment() {
        waitForElementVisible(driver, ContractPUI.DEPARTMENT_DROPDOWN_PARENT_LOCATOR);
        senkeyToElement(driver, ContractPUI.DEPARTMENT_DROPDOWN_PARENT_LOCATOR, "a1");
    }

    public void clickToSelectStaffCodeButton() {
        waitForElementClickable(driver, ContractPUI.STAFF_CODE_SELECT_BUTTON);
        clickToElement(driver, ContractPUI.STAFF_CODE_SELECT_BUTTON);
    }

    public void clickToChooseStaff() {
        waitForElementClickable(driver, ContractPUI.STAFF_ITEM);
        clickToElement(driver, ContractPUI.STAFF_ITEM);
    }

    public void clickToSelectStaff() {
        waitForElementClickable(driver, ContractPUI.SELECT_STAFF_BUTTON);
        clickToElement(driver, ContractPUI.SELECT_STAFF_BUTTON);
    }

    public void sendkeyToContractNumber(String contractNumber) {
        waitForElementVisible(driver, ContractPUI.CONTRACT_NUMBER_TEXTBOX);
        senkeyToElement(driver, ContractPUI.CONTRACT_NUMBER_TEXTBOX, contractNumber);
    }

    public void sendkeyToContractDate() {
        //waitForElementVisible(driver, ContractPUI.CONTRACT_DATE_PICKER_NEW);
        //senkeyToElement(driver, ContractPUI.CONTRACT_DATE_PICKER_NEW, "2025-12-20");

        waitForElementClickable(driver, ContractPUI.ISSUED_DATE_PICKER);
        clickToElement(driver, ContractPUI.ISSUED_DATE_PICKER);
        waitForElementClickable(driver, ContractPUI.PICK_YEAR_BUTTON);
        clickToElement(driver, ContractPUI.PICK_YEAR_BUTTON);
        waitForElementClickable(driver, ContractPUI.DYNAMIC_YEAR_LOCATOR_2020_2029, "2025");
        clickToElement(driver, ContractPUI.DYNAMIC_YEAR_LOCATOR_2020_2029, "2025");
        waitForElementClickable(driver, ContractPUI.PICK_MONTH_BUTTON);
        clickToElement(driver, ContractPUI.PICK_MONTH_BUTTON);
        waitForElementClickable(driver, ContractPUI.DYNAMIC_MONTH_LOCATOR, String.valueOf(MonthList.Jul));
        clickToElement(driver, ContractPUI.DYNAMIC_MONTH_LOCATOR, String.valueOf(MonthList.Jul));
        waitForElementClickable(driver, ContractPUI.DYNAMIC_DATE_LOCATOR, "18");
        clickToElement(driver, ContractPUI.DYNAMIC_DATE_LOCATOR, "18");
    }

    public void sendkeyToEccPrefix(String eccPrefix) {
        waitForElementVisible(driver, ContractPUI.ECC_PREFIX_TEXTBOX);
        senkeyToElement(driver, ContractPUI.ECC_PREFIX_TEXTBOX, eccPrefix);
    }

    public void clickToEcollectionTabServiceFee() {
        waitForElementClickable(driver, ContractPUI.EC_SERVICE_FEE_TAB);
        clickToElement(driver, ContractPUI.EC_SERVICE_FEE_TAB);
    }

    public void clickToAddAccount() {
        waitForElementClickable(driver, ContractPUI.ADD_ACCOUNT_BUTTON);
        clickToElement(driver, ContractPUI.ADD_ACCOUNT_BUTTON);
    }

    public void sendkeyToAccountNumber(String accountNumber) {
        waitForElementVisible(driver, ContractPUI.ACCOUNT_NUMBER_TEXTBOX);
        senkeyToElement(driver, ContractPUI.ACCOUNT_NUMBER_TEXTBOX, accountNumber);
    }

    public void clickToUseService() {
        checkTheCheckboxOrRadio(driver, ContractPUI.USE_SERVICE_CHECKBOX);
    }

    public void clickToSaveContractButton() {
        waitForElementClickable(driver, ContractPUI.SAVE_CONTRACT_BUTTON);
        clickToElement(driver, ContractPUI.SAVE_CONTRACT_BUTTON);
    }

    public void sendkeyToContractNumberSearchbox(String contractNumber) {
        waitForElementVisible(driver, ContractPUI.CONTRACT_NUMBER_SEARCHBOX);
        senkeyToElement(driver, ContractPUI.CONTRACT_NUMBER_SEARCHBOX, contractNumber);
    }

    public boolean isContractListed(String contractNumber) {
        int previousColumnNumber = getListElementSize(driver, ContractPUI.CONTRACT_NUMBER_PREVIOUS_COLUMN);
        String orderOfContractNumberColumn = String.valueOf(previousColumnNumber + 1);
        String actualContractNumber = getElementText(driver, ContractPUI.CONTRACT_NUMBER_RESULT_LOCATOR, orderOfContractNumberColumn);
        return actualContractNumber.equals(contractNumber);
    }

    public void selectToDepartment() {
        //selectItemInCustomDropdownByTitle(driver, ContractPUI.DEPARTMENT_DROPDOWN_PARENT_LOCATOR, ContractPUI.DEPARTMENT_DROPDOWN_CHILD_LOCATOR, "a1");
        waitForElementVisible(driver, ContractPUI.DEPARTMENT_DROPDOWN_PARENT_LOCATOR);
        senkeyToElement(driver, ContractPUI.DEPARTMENT_DROPDOWN_PARENT_LOCATOR, "a1");
        waitForElementClickable(driver, ContractPUI.DEPARTMENT_DROPDOWN_CHILD_LOCATOR_NEW, "a1");
        clickToElement(driver, ContractPUI.DEPARTMENT_DROPDOWN_CHILD_LOCATOR_NEW, "a1");
    }

    public void clickToConfirmToSave() {
        waitForElementClickable(driver, ContractPUI.CONFIRM_SAVE_MODAL_BUTTON);
        clickToElement(driver, ContractPUI.CONFIRM_SAVE_MODAL_BUTTON);
    }
}
