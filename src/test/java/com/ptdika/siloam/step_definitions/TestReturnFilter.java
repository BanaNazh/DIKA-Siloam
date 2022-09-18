package com.ptdika.siloam.step_definitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.ptdika.siloam.pages.ReturnFilter;
import com.ptdika.siloam.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestReturnFilter {
	public static WebDriver driver;
	private static ExtentTest extentTest;
	private ReturnFilter modulReturn = new ReturnFilter();

	public TestReturnFilter() {
		driver = Hooks.driver;
		extentTest = Hooks.extentTest;
	}

	// Login Sales
	// Scenario: User valid login module Return
	@When("User go to Web Dika Siloam")
	public void user_go_to_Web_Dika_Siloam() {
		driver.get(Constants.URL);
		extentTest.log(LogStatus.PASS, "User go to Web Dika Siloam");
	}

	@And("User enter valid username and password modul Return")
	public void User_enter_valid_username_and_password_modul_Return() {
		driver.navigate().refresh();
		delay(1);
		modulReturn.login("D6200927", "1997-10-23");
		extentTest.log(LogStatus.PASS, "User enter valid username and password modul Return");
	}

	@And("User click button login valid modul Return")
	public void User_click_button_login_valid_modul_Return() {
		extentTest.log(LogStatus.PASS, "User click button login valid modul Return");

	}

	@Then("User enter valid credentials modul Return")
	public void User_enter_valid_credentials_modul_Return() {
		extentTest.log(LogStatus.PASS, "User enter valid credentials modul Return");
	}

	// Module Return
	// Scenario: User navigate to return page
	@And("User click on return button")
	public void User_click_on_return_button() {
		modulReturn.navigateReturnPage();
		extentTest.log(LogStatus.PASS, "click on return button");
	}

	@Then("User landed on return page successfully")
	public void User_landed_son_return_page_successfully() {
		System.out.println("Page Header is : " + modulReturn.landedOnReturnPageSuccessfully());
		String txt = modulReturn.landedOnReturnPageSuccessfully();
		assertTrue(txt.contains("Form Return"));
		extentTest.log(LogStatus.PASS, "User landed on return page successfully");
	}

	// Negative Case
	// Scenario: Blank Start Date Ret001
	@And("Click on date picker Start Date Ret001")
	public void Click_on_date_picker_Start_Date_Ret001() {
		modulReturn.clickOnDatePickerStartDateRet001();
		extentTest.log(LogStatus.PASS, "Click on date picker Start Date Ret001");
	}

	@And("Leave Blank on Start Date Ret001")
	public void Leave_Blank_on_Start_Date_Ret001() {
		modulReturn.leaveBlankOnStartDateRet001();
		extentTest.log(LogStatus.PASS, "Leave Blank on Start Date Ret001");
	}

	@And("Click on date picker End Date Ret001")
	public void Click_on_date_picker_End_Date_Ret001() {
		modulReturn.clickOnDatePickerEndDateRet001();
		extentTest.log(LogStatus.PASS, "Click on date picker End Date Ret001");
	}

	@And("Select a day on End Date Ret001")
	public void Select_a_day_on_End_Date_Ret001() {
		modulReturn.selectADayOnEndDateRet001();
		extentTest.log(LogStatus.PASS, "Select a day on End Date Ret001");
	}

	@And("Click Status Dropdown Ret001")
	public void Click_Status_Dropdown_Ret001() {
		modulReturn.clickStatusDropdownRet001();
		extentTest.log(LogStatus.PASS, "Click Status Dropdown Ret001");
	}

	@And("Select Status Pending Ret001")
	public void Select_Status_Pending_Ret001() {
		modulReturn.selectStatusPendingRet001();
		extentTest.log(LogStatus.PASS, "Select Status Pending Ret001");
	}

	@And("Click Button Filter Ret001")
	public void Click_Button_Filter_Ret001() {
		modulReturn.clickButtonFilterRet001();
		extentTest.log(LogStatus.PASS, "Click Button Filter Ret001");
	}

	@Then("User received error message Blank Start Date Ret001")
	public void User_received_error_message_Blank_Start_Date_Ret001() {
		System.out.println("Error message is : " + modulReturn.user_Received_Error_Message_Blank_Start_Date_Ret001());
		String txtRet001 = modulReturn.user_Received_Error_Message_Blank_Start_Date_Ret001();
		assertTrue(txtRet001.contains("Please fill"));
		extentTest.log(LogStatus.PASS, "User received error message Blank Start Date Ret001");
		delay(2);

	}

	// Scenario: Blank End Date Ret002
	@And("Click on date picker Start Date Ret002")
	public void click_on_date_picker_Start_Date_Ret002() {
		driver.navigate().refresh();
		delay(2);
		modulReturn.clickOnDatePickerStartDateRet002();
		extentTest.log(LogStatus.PASS, "Click on date picker Start Date Ret002");
	}

	@And("Select a day on Start Date Ret002")
	public void Select_a_day_on_Start_Date_Ret002() {
		modulReturn.selectADayOnStartDateRet002();
		extentTest.log(LogStatus.PASS, "Select a day on Start Date Ret002");
	}

	@And("Click on date picker End Date Ret002")
	public void Click_on_date_picker_End_Date_Ret002() {
		modulReturn.clickOnDatePickerEndDateRet002();
		extentTest.log(LogStatus.PASS, "Click on date picker End Date Ret002");
	}

	@And("Leave Blank on End Date Ret002")
	public void Leave_Blank_on_End_Date_Ret002() {
		modulReturn.leaveBlankOnEndDateRet002();
		extentTest.log(LogStatus.PASS, "Leave Blank on End Date Ret002");
	}

	@And("Click Status Dropdown Ret002")
	public void Click_Status_Dropdown_Ret002() {
		modulReturn.clickStatusDropdownRet002();
		extentTest.log(LogStatus.PASS, "Click Status Dropdown Ret002");
	}

	@And("Select Status Pending Ret002")
	public void Select_Status_Pending_Ret002() {
		modulReturn.selectStatusPendingRet002();
		extentTest.log(LogStatus.PASS, "Select Status Pending Ret002");
	}

	@And("Click Button Filter Ret002")
	public void Click_Button_Filter_Ret002() {
		modulReturn.clickButtonFilterRet002();
		extentTest.log(LogStatus.PASS, "Click Button Filter Ret002");
	}

	@Then("User received error message Blank End Date Ret002")
	public void User_received_error_message_Blank_End_Date_Ret002() {
		System.out.println("Error message is : " + modulReturn.userReceivedErrorMessageBlankStartDateRet002());
		String txtRet002 = modulReturn.userReceivedErrorMessageBlankStartDateRet002();
		assertTrue(txtRet002.contains("Please fill"));
		extentTest.log(LogStatus.PASS, "User received error message Blank Start Date Ret002");
		delay(2);
	}

	// Scenario : Set Future day on Start Date Ret003
	@And("Click on date picker Start Date Ret003")
	public void Click_on_date_picker_Start_Date_Ret003() {
		driver.navigate().refresh();
		delay(2);
		modulReturn.clickOnDatePickerStartDateRet003();
		extentTest.log(LogStatus.PASS, "Click on date picker Start Date Ret003");
	}

	@And("Set Future day on Start Date Ret003")
	public void Set_Future_day_on_Start_Date_Ret003() {
		modulReturn.setFutureDayOnStartDateRet003();
		extentTest.log(LogStatus.PASS, "Set Future day on Start Date Ret003");
	}

	@And("Click on date picker End Date Ret003")
	public void Click_on_date_picker_End_Date_Ret003() {
		modulReturn.clickOnDatePickerEndDateRet003();
		extentTest.log(LogStatus.PASS, "Click on date picker End Date Ret003");
	}

	@And("Select a day on End Date Ret003")
	public void Select_a_day_on_End_Date_Ret003() {
		modulReturn.selectADayOnEndDateRet003();
		extentTest.log(LogStatus.PASS, "Select a day on End Date Ret003");
	}

	@And("Click Status Dropdown Ret003")
	public void Click_Status_Dropdown_Ret003() {
		modulReturn.clickStatusDropdownRet003();
		extentTest.log(LogStatus.PASS, "Click Status Dropdown Ret003");
	}

	@And("Select Status Pending Ret003")
	public void Select_Status_Pending_Ret003() {
		modulReturn.selectStatusPendingRet003();
		extentTest.log(LogStatus.PASS, "Select Status Pending Ret003");
	}

	@And("Click Button Filter Ret003")
	public void Click_Button_Filter_Ret003() {
		modulReturn.clickButtonFilterRet003();
		extentTest.log(LogStatus.PASS, "Click Button Filter Ret003");
	}

	@Then("User received No data available in table Ret003")
	public void User_received_No_data_available_in_table_Ret003() {
		delay(2);
		System.out.println("Validasi Data : " + modulReturn.userReceivedNoDataAvailableInTableRet003());
		String txtRet003 = modulReturn.userReceivedNoDataAvailableInTableRet003();
		assertTrue(txtRet003.contains("No data available"));
		extentTest.log(LogStatus.PASS, "User received No data available in table Ret003");

	}

	// Scenario : Set Future day on Start Date Ret004
	@And("Click on date picker Start Date Ret004")
	public void Click_on_date_picker_Start_Date_Ret004() {
		driver.navigate().refresh();
		delay(2);
		modulReturn.clickOnDatePickerStartDateRet004();
		extentTest.log(LogStatus.PASS, "Click on date picker Start Date Ret004");
	}

	@And("Select a day on Start Date Ret004")
	public void Select_a_day_on_Start_Date_Ret004() {
		modulReturn.selectAdayOnStartDateRet004();
		extentTest.log(LogStatus.PASS, "Select a day on Start Date Ret004");
	}

	@And("Click on date picker End Date Ret004")
	public void Click_on_date_picker_End_Date_Ret004() {
		modulReturn.clickOnDatePickerEndDateRet004();
		extentTest.log(LogStatus.PASS, "Click on date picker End Date Ret004");
	}

	@And("Set Future day on End Date Ret004")
	public void Set_Future_day_on_End_Date_Ret004() {
		modulReturn.setFutureDayOnEndDateRet004();
		extentTest.log(LogStatus.PASS, "Set Future day on End Date Ret004");
	}

	@And("Click Status Dropdown Ret004")
	public void Click_Status_Dropdown_Ret004() {
		modulReturn.clickStatusDropdownRet004();
		extentTest.log(LogStatus.PASS, "Click Status Dropdown Ret004");
	}

	@And("Select Status Pending Ret004")
	public void Select_Status_Pending_Ret004() {
		modulReturn.selectStatusPendingRet004();
		extentTest.log(LogStatus.PASS, "Select Status Pending Ret004");
	}

	@And("Click Button Filter Ret004")
	public void Click_Button_Filter_Ret004() {
		modulReturn.clickButtonFilterRet004();
		extentTest.log(LogStatus.PASS, "Click Button Filter Ret004");
	}

	@Then("User received No data available in table Ret004")
	public void User_received_No_data_available_in_table_Ret004() {
		delay(2);
		System.out.println("Validasi Data : " + modulReturn.userReceivedNoDataAvailableInTableRet004());
		String txtRet004 = modulReturn.userReceivedNoDataAvailableInTableRet004();
		assertTrue(txtRet004.contains("No data available"));
		extentTest.log(LogStatus.PASS, "User received No data available in table Ret004");

	}

	// Scenario : Blank Status Ret005
	@And("Click on date picker Start Date Ret005")
	public void Click_on_date_picker_Start_Date_Ret005() {
		driver.navigate().refresh();
		delay(2);
		modulReturn.clickOnDatePickerStartDateRet005();
		extentTest.log(LogStatus.PASS, "Click on date picker Start Date Ret005");
	}

	@And("Select a day on Start Date Ret005")
	public void Select_a_day_on_Start_Date_Ret005() {
		modulReturn.selectAdayOnStartDateRet005();
		extentTest.log(LogStatus.PASS, "Select a day on Start Date Ret005");
	}

	@And("Click on date picker End Date Ret005")
	public void Click_on_date_picker_End_Date_Ret005() {
		modulReturn.clickOnDatePickerEndDateRet005();
		extentTest.log(LogStatus.PASS, "Click on date picker End Date Ret005");
	}

	@And("Select a day on End Date Ret005")
	public void Select_a_day_on_End_Date_Ret005() {
		modulReturn.selectADayOnEndDateRet005();
		extentTest.log(LogStatus.PASS, "Select a day on End Date Ret005");
	}

	@And("Click Status Dropdown Ret005")
	public void Click_Status_Dropdown_Ret005() {
		modulReturn.clickStatusDropdownRet005();
		extentTest.log(LogStatus.PASS, "Click Status Dropdown Ret005");
	}

	@And("Select Status Blank Ret005")
	public void Select_Status_Blank_Ret005() {
		modulReturn.selectStatusBlankRet005();
		extentTest.log(LogStatus.PASS, "Select Status Blank Ret005");
	}

	@And("Click Button Filter Ret005")
	public void Click_Button_Filter_Ret005() {
		modulReturn.clickButtonFilterRet005();
		extentTest.log(LogStatus.PASS, "Click Button Filter Ret005");
	}

	@Then("User received error message Blank Status Ret005")
	public void User_received_error_message_Blank_Status_Ret005() {
		delay(2);
		System.out.println("Error message is : " + modulReturn.userReceivedErrorMessageBlankStatus005());
		String txtRet005 = modulReturn.userReceivedErrorMessageBlankStatus005();
		assertTrue(txtRet005.contains("Please fill"));
		extentTest.log(LogStatus.PASS, "User received error message Blank Status Ret005");

	}

	// Positive Case
	// Scenario: Complete Status Ret006
	@And("Click on date picker Start Date Ret006")
	public void Click_on_date_picker_Start_Date_Ret006() {
		driver.navigate().refresh();
		delay(2);
		modulReturn.clickOnDatePickerStartDateRet006();
		extentTest.log(LogStatus.PASS, "Click on date picker Start Date Ret006");
	}

	@And("Select a day on Start Date Ret006")
	public void Select_a_day_on_Start_Date_Ret006() {
		modulReturn.selectADayOnStartDateRet006();
		extentTest.log(LogStatus.PASS, "Select a day on Start Date Ret006");
	}

	@And("Click on date picker End Date Ret006")
	public void Click_on_date_picker_End_Date_Ret006() {
		modulReturn.clickOnDatePickerEndDateRet006();
		extentTest.log(LogStatus.PASS, "Click on date picker End Date Ret006");
	}

	@And("Select a day on End Date Ret006")
	public void Select_a_day_on_End_Date_Ret006() {
		modulReturn.selectADayOnEndDateRet006();
		extentTest.log(LogStatus.PASS, "Select a day on End Date Ret006");
	}

	@And("Click Status Dropdown Ret006")
	public void Click_Status_Dropdown_Ret006() {
		modulReturn.clickStatusDropdownRet006();
		extentTest.log(LogStatus.PASS, "Click Status Dropdown Ret006");
	}

	@And("Select Status Complete Ret006")
	public void Select_Status_Complete_Ret006() {
		modulReturn.selectStatusCompleteRet006();
		extentTest.log(LogStatus.PASS, "Select Status Complete Ret006");
	}

	@And("Click Button Filter Ret006")
	public void Click_Button_Filter_Ret006() {
		modulReturn.clickButtonFilterRet006();
		extentTest.log(LogStatus.PASS, "Click Button Filter Ret006");
	}

	@Then("User return Page for status Complete Ret006")
	public void User_return_Page_for_status_Complete_Ret006() {
		delay(2);
		System.out.println("Validation text is : " + modulReturn.userReturnPageForStatusCompleteRet006());
		String txtRet006 = modulReturn.userReturnPageForStatusCompleteRet006();
		assertTrue(txtRet006.contains("Sudah TTD"));
		extentTest.log(LogStatus.PASS, "User return Page for status Complete Ret006");
	}

	// Scenario: Pending Status Ret007
	@And("Click on date picker Start Date Ret007")
	public void Click_on_date_picker_Start_Date_Ret007() {
		driver.navigate().refresh();
		delay(2);
		modulReturn.clickOnDatePickerStartDateRet007();
		extentTest.log(LogStatus.PASS, "Click on date picker Start Date Ret007");
	}

	@And("Select a day on Start Date Ret007")
	public void Select_a_day_on_Start_Date_Ret007() {
		modulReturn.selectADayOnStartDateRet007();
		extentTest.log(LogStatus.PASS, "Select a day on Start Date Ret007");
	}

	@And("Click on date picker End Date Ret007")
	public void Click_on_date_picker_End_Date_Ret007() {
		modulReturn.clickOnDatePickerEndDateRet007();
		extentTest.log(LogStatus.PASS, "Click on date picker End Date Ret007");
	}

	@And("Select a day on End Date Ret007")
	public void Select_a_day_on_End_Date_Ret007() {
		modulReturn.selectADayOnEndDateRet007();
		extentTest.log(LogStatus.PASS, "Select a day on End Date Ret007");
	}

	@And("Click Status Dropdown Ret007")
	public void Click_Status_Dropdown_Ret007() {
		modulReturn.clickStatusDropdownRet007();
		extentTest.log(LogStatus.PASS, "Click Status Dropdown Ret007");
	}

	@And("Select Status Pending Ret007")
	public void Select_Status_Pending_Ret007() {
		modulReturn.selectStatusPendingRet007();
		extentTest.log(LogStatus.PASS, "Select Status Pending Ret007");
	}

	@And("Click Button Filter Ret007")
	public void Click_Button_Filter_Ret007() {
		modulReturn.clickButtonFilterRet007();
		extentTest.log(LogStatus.PASS, "Click Button Filter Ret007");
	}

	@Then("User return Page for status Pending Ret007")
	public void User_return_Page_for_status_Pending_Ret007() {
		System.out.println("Button visible: " + modulReturn.userReturnPageForStatusPendingRet007());
		boolean buttonVisible = modulReturn.userReturnPageForStatusPendingRet007();
		assertEquals(buttonVisible, true);
		extentTest.log(LogStatus.PASS, "User return Page for status Pending Ret007");

	}

	// Scenario: Reset Button Ret008
	@And("Click on date picker Start Date Ret008")
	public void Click_on_date_picker_Start_Date_Ret008() {
		driver.navigate().refresh();
		delay(2);
		modulReturn.clickOnDatePickerStartDateRet008();
		extentTest.log(LogStatus.PASS, "Click on date picker Start Date Ret008");
	}

	@And("Select a day on Start Date Ret008")
	public void Select_a_day_on_Start_Date_Ret008() {
		modulReturn.selectADayOnStartDateRet008();
		extentTest.log(LogStatus.PASS, "Select a day on Start Date Ret008");
	}

	@And("Click on date picker End Date Ret008")
	public void Click_on_date_picker_End_Date_Ret008() {
		modulReturn.clickOnDatePickerEndDateRet008();
		extentTest.log(LogStatus.PASS, "Click on date picker End Date Ret008");
	}

	@And("Select a day on End Date Ret008")
	public void Select_a_day_on_End_Date_Ret008() {
		modulReturn.selectADayOnEndDateRet008();
		extentTest.log(LogStatus.PASS, "Select a day on End Date Ret008");
	}

	@And("Click Status Dropdown Ret008")
	public void Click_Status_Dropdown_Ret008() {
		modulReturn.clickStatusDropdownRet008();
		extentTest.log(LogStatus.PASS, "Click Status Dropdown Ret008");
	}

	@And("Select Status Pending Ret008")
	public void Select_Status_Pending_Ret008() {
		modulReturn.selectStatusPendingRet008();
		extentTest.log(LogStatus.PASS, "Select Status Pending Ret008");
	}

	@And("Click Button Reset Ret008")
	public void Click_Button_Reset_Ret008() {
		delay(2);
		modulReturn.clickButtonResetRet008();
		extentTest.log(LogStatus.PASS, "Click Button Reset Ret008");
		delay(2);
	}

	@Then("Validate value on Start Date Ret008")
	public void Validate_value_on_Start_Date_Ret008() {
		modulReturn.validateValueOnStartDateRet008();
		System.out.println("StartDate value is : " + modulReturn.validateValueOnStartDateRet008());
		String txtStartDateRet008 = modulReturn.validateValueOnStartDateRet008();
		assertEquals(txtStartDateRet008, null);
		extentTest.log(LogStatus.PASS, "Validate value on Start Date Ret008");

	}

	@Then("Validate value on End Date Ret008")
	public void Validate_value_on_End_Date_Ret008() {
		modulReturn.validateValueOnEndDateRet008();
		System.out.println("EndDate value is : " + modulReturn.validateValueOnEndDateRet008());
		String txtRet008 = modulReturn.validateValueOnEndDateRet008();
		assertEquals(txtRet008, null);
		extentTest.log(LogStatus.PASS, "Validate value on End Date Ret008");
		delay(2);
	}

	@Then("Validate value on Status Dropdown Ret008")
	public void Validate_value_on_Status_Dropdown_Ret008() {
		modulReturn.validateValueOnStatusDropdownRet008();
		System.out.println("Status Dropdown value is : " + modulReturn.validateValueOnStatusDropdownRet008());
		String txtRet008 = modulReturn.validateValueOnStatusDropdownRet008();
		assertEquals(txtRet008, null);
		extentTest.log(LogStatus.PASS, "Validate value on Status Dropdown Ret008");
	}

	static void delay(int detik) {
		try {
			Thread.sleep(1000 * detik);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	static void scroll(int vertical) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0," + vertical + ")");
	}
}
