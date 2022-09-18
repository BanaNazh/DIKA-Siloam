package com.ptdika.siloam.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptdika.siloam.drivers.DriverSingleton;

public class ModulReturn {
	private WebDriver driver;

	public ModulReturn() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@placeholder='Username']")
	private WebElement username;

	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnLogin;

	// Page Return
	@FindBy(xpath = "//span[normalize-space()='New']")
	private WebElement btnReturn;

	@FindBy(xpath = "//*[@id=\"content\"]/h1")
	private WebElement pageHeaderReturn;

	@FindBy(xpath = "//div[@class='datepicker-days']//th[@class='prev'][normalize-space()='«']")
	private WebElement btnPrevStart;

	@FindBy(xpath = "//div[@class='datepicker-days']//th[@class='next'][normalize-space()='»']")
	private WebElement btnNextStart;

	@FindBy(xpath = "//div[@class='datepicker-days']//th[@class='next'][normalize-space()='»']")
	private WebElement btnNextEnd;

	@FindBy(xpath = "//div[@id='datepicker-autoClose']//i[@class='fa fa-calendar']")
	private WebElement datePickerStart;

	@FindBy(xpath = "//td[@class='day'][normalize-space()='9']")
	private WebElement dateStartSelect;

	@FindBy(xpath = "//div[@id='datepicker-autoClose2']//i[@class='fa fa-calendar']")
	private WebElement datePickerEnd;

	@FindBy(xpath = "//td[normalize-space()='17']")
	private WebElement dateEndSelect;

	@FindBy(xpath = "//b[@role='presentation']")
	private WebElement clickStatusDropdown;

	@FindBy(xpath = "//input[@role='textbox']")
	private WebElement textboxStatus;

	@FindBy(xpath = "//button[@id='btn-filter']")
	private WebElement btnFilter;

	@FindBy(css = "#table > tbody > tr > td")
	private WebElement txtNoData;
	
	@FindBy(xpath = "//*[@id=\"table\"]/tbody/tr[2]/td[7]/span")
	private WebElement sudahTTD;

	@FindBy(xpath = "//select[@name='table_length']")
	private WebElement dataDisplayDropdown;

	@FindBy(css = "#table_length > label > select > option:nth-child(2)")
	private WebElement dataDisplay25;

	// Scenario
	// Login Sales Successfully
	public void login(String username, String password) {
		this.username.sendKeys(username);// step
		this.password.sendKeys(password);
		btnLogin.click();
	}

	// User navigate to return page
	public void navigateReturnPage() {
		btnReturn.click();
	}

	// User landed on return page successfully
	public String landedOnReturnPageSuccessfully() {
		return pageHeaderReturn.getText();

	}

	// Filter Function Negative Case
	// Scenario : Blank Start Date Ret001
	public void clickOnDatePickerStartDateRet001() {
		datePickerStart.click();
	}

	public void leaveBlankOnStartDateRet001() {

	}

	public void clickOnDatePickerEndDateRet001() {
		datePickerEnd.click();
	}

	public void selectADayOnEndDateRet001() {
		dateEndSelect.click();
	}

	public void clickStatusDropdownRet001() {
		clickStatusDropdown.click();
	}

	public void selectStatusPendingRet001() {
		textboxStatus.sendKeys("Pending" + "\n");
	}

	public void clickButtonFilterRet001() {
		btnFilter.click();
	}

	public String user_Received_Error_Message_Blank_Start_Date_Ret001() {
		return datePickerStart.getAttribute("ValidationMessage");

	}

	// Scenario : Blank End Date Ret002
	public void clickOnDatePickerStartDateRet002() {
		datePickerStart.click();
	}

	public void selectADayOnStartDateRet002() {
		dateStartSelect.click();
	}

	public void clickOnDatePickerEndDateRet002() {
		datePickerEnd.click();
	}

	public void leaveBlankOnEndDateRet002() {

	}

	public void clickStatusDropdownRet002() {
		clickStatusDropdown.click();
	}

	public void selectStatusPendingRet002() {
		textboxStatus.sendKeys("Pending" + "\n");
	}

	public void clickButtonFilterRet002() {
		btnFilter.click();
	}

	public String userReceivedErrorMessageBlankStartDateRet002() {
		return datePickerStart.getAttribute("ValidationMessage");

	}

// Scenario : Set Future day on Start Date Ret003
	public void clickOnDatePickerStartDateRet003() {
		datePickerStart.click();
	}

	public void setFutureDayOnStartDateRet003() {
		btnNextStart.click();
		dateStartSelect.click();
	}

	public void clickOnDatePickerEndDateRet003() {
		datePickerEnd.click();
	}

	public void selectADayOnEndDateRet003() {
		dateEndSelect.click();
	}

	public void clickStatusDropdownRet003() {
		clickStatusDropdown.click();
	}

	public void selectStatusPendingRet003() {
		textboxStatus.sendKeys("Pending" + "\n");
	}

	public void clickButtonFilterRet003() {
		btnFilter.click();
	}

	public String userReceivedNoDataAvailableInTableRet003() {
		return txtNoData.getText();

	}

// Scenario : Set Future day on End Date Ret004
	public void clickOnDatePickerStartDateRet004() {
		datePickerStart.click();
	}

	public void selectAdayOnStartDateRet004() {
		btnNextStart.click();
		dateStartSelect.click();
	}

	public void clickOnDatePickerEndDateRet004() {
		datePickerEnd.click();
	}

	public void setFutureDayOnEndDateRet004() {
		btnNextEnd.click();
		dateEndSelect.click();
	}

	public void clickStatusDropdownRet004() {
		clickStatusDropdown.click();
	}

	public void selectStatusPendingRet004() {
		textboxStatus.sendKeys("Pending" + "\n");
	}

	public void clickButtonFilterRet004() {
		btnFilter.click();
	}

	public String userReceivedNoDataAvailableInTableRet004() {
		return txtNoData.getText();

	}

	// Scenario : Blank Status Ret005
	public void clickOnDatePickerStartDateRet005() {
		datePickerStart.click();
	}

	public void selectAdayOnStartDateRet005() {
		dateStartSelect.click();
	}

	public void clickOnDatePickerEndDateRet005() {
		datePickerEnd.click();
	}

	public void selectADayOnEndDateRet005() {
		dateEndSelect.click();
	}

	public void clickStatusDropdownRet005() {
		clickStatusDropdown.click();
	}

	public void selectStatusBlankRet005() {
		textboxStatus.sendKeys("\n");
	}

	public void clickButtonFilterRet005() {
		btnFilter.click();
	}

	public String userReceivedErrorMessageBlankStatus005() {
		return clickStatusDropdown.getAttribute("ValidationMessage");
	}
	
	//Scenario: Complete Status Ret006
	public void clickOnDatePickerStartDateRet006() {
		datePickerStart.click();
	}
	
	public void selectADayOnStartDateRet006() {
		dateStartSelect.click();
	}
	
	public void clickOnDatePickerEndDateRet006() {
		datePickerEnd.click();
	}
	
	public void selectADayOnEndDateRet006() {
		dateEndSelect.click();
	}
	
	public void clickStatusDropdownRet006() {
		clickStatusDropdown.click();
	}
	
	public void selectStatusCompleteRet006() {
		textboxStatus.sendKeys("Complete" + "\n");
	}
	
	public void clickButtonFilterRet006() {
		btnFilter.click();

	}
	
	public String userReturnPageForStatusCompleteRet006() {
		return sudahTTD.getText();
		
	}	
	

	public void returnPagePending() {
		btnReturn.click();
		datePickerStart.click();
		dateStartSelect.click();
		datePickerEnd.click();
		dateEndSelect.click();
		clickStatusDropdown.click();
		textboxStatus.sendKeys("Pending" + "\n");
		btnFilter.click();

	}

	public void dataDisplay() {
		dataDisplayDropdown.click();
		dataDisplay25.click();

	}
}
