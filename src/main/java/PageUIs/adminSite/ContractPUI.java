package PageUIs.adminSite;

public class ContractPUI {
    public static final String REGISTER_CONTRACT_BUTTON = "XPATH=//span[text()='Register']/parent::button";
    public static final String SELECT_SERVICE_ID_BUTTON = "XPATH=//div[@id='customerNo']//span[text()='Select']/parent::button";
    public static final String SERVICE_ID_SEARCHBOX_IN_MODAL = "XPATH=//span[@class='ant-select-selection-search']//input[@id='customerNo']";
    public static final String SEARCH_RESULT_SERVICE_ID_ON_DATATABLE = "XPATH=//td[text()='%s']/parent::tr";
    public static final String MODAL_SELECT_BUTTON = "XPATH=//div[@class='ant-modal-footer']//span[text()='Select']";
    public static final String DEPARTMENT_DROPDOWN_PARENT_LOCATOR = "XPATH=//input[@id='deptId']";
    public static final String DEPARTMENT_DROPDOWN_CHILD_LOCATOR = "XPATH=//div[@class='ant-select-item-option-content' and text()='%s']";
    public static final String DEPARTMENT_DROPDOWN_CHILD_LOCATOR_NEW = "XPATH=//div[contains(@class,'ant-select-item-option-active')]/div[text()='%s']";
    public static final String STAFF_CODE_SELECT_BUTTON = "XPATH=//div[@id='staffCd']//span[text()='Select']";
    public static final String STAFF_ITEM = "XPATH=//div[@class='ant-modal-root']//tr[@class='dx-row dx-data-row dx-column-lines' and @aria-rowindex='1']";
    public static final String SELECT_STAFF_BUTTON = "XPATH=//div[contains(@class,'contract-staff-pop')]//span[text()='Select']/parent::button";
    public static final String CONTRACT_NUMBER_TEXTBOX = "XPATH=//input[@id='contractNo']";
    public static final String CONTRACT_DATE_PICKER = "XPATH=//input[@id='contractDt']";
    public static final String CONTRACT_DATE_PICKER_NEW = "XPATH=//input[@id='contractDt']";
    public static final String ECC_PREFIX_TEXTBOX = "XPATH=//input[@id='eccPrefix']";
    public static final String EC_SERVICE_FEE_TAB = "XPATH=//div[text()='E-Collection']";
    public static final String ACCOUNT_NUMBER_TEXTBOX = "XPATH=//input[@id='serviceInformations_0_serviceAcct']";
    public static final String USE_SERVICE_CHECKBOX = "XPATH=//input[@id='serviceInformations_0_contractServiceInfos_0_serviceUse']";
    public static final String SAVE_CONTRACT_BUTTON = "XPATH=//span[text()='Save']/parent::button";
    public static final String CONTRACT_NUMBER_SEARCHBOX = "XPATH=//div[@class='dx-datagrid-headers']//td[contains(@class,'dx-editor-cell')][1]//input[@class='dx-texteditor-input']";
    public static final String ADD_ACCOUNT_BUTTON = "XPATH=//span[text()='Add account']/parent::button";
    public static final String CONTRACT_NUMBER_PREVIOUS_COLUMN = "XPATH=//div[text()='Contract number']/parent::td[@role='columnheader']/preceding-sibling::td";
    public static final String CONTRACT_NUMBER_RESULT_LOCATOR = "XPATH=//tbody//tr[contains(@class,'dx-data-row')]/td[%s]";

    public static final String ISSUED_DATE_PICKER = "XPATH=//input[@id='contractDt']";
    public static final String PICK_YEAR_BUTTON = "XPATH=//button[@class='ant-picker-year-btn']";
    public static final String DYNAMIC_YEAR_LOCATOR_2020_2029 = "XPATH=//div[@class='ant-picker-cell-inner' and text()='%s']";
    public static final String PICK_MONTH_BUTTON = "XPATH=//button[@class='ant-picker-month-btn']";

    public static final String DYNAMIC_MONTH_LOCATOR = "XPATH=//div[@class='ant-picker-cell-inner' and text()='%s']";
    public static final String DYNAMIC_DATE_LOCATOR = "XPATH=//div[@class='ant-picker-cell-inner' and text()='%s']";
    public static final String CONFIRM_SAVE_MODAL_BUTTON = "XPATH=//div[@class='ant-modal-confirm-btns']//span[text()='Confirm']/parent::button";
}
