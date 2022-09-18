package com.ptdika.siloam.step_definitions;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.ptdika.siloam.pages.ModulReturn;
import com.ptdika.siloam.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestModulReturn {
	public static WebDriver driver;
	private static ExtentTest extentTest;
	private ModulReturn modulReturn = new ModulReturn();

	public TestModulReturn() {
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
		delay(2);
		modulReturn.clickOnDatePickerStartDateRet006();
		extentTest.log(LogStatus.PASS, "Click on date picker Start Date Ret006");
	}

	@And("Select a day on Start Date Ret006")
	public void Select_a_day_on_Start_Date_Ret006() {
		delay(2);
		modulReturn.selectADayOnStartDateRet006();
		extentTest.log(LogStatus.PASS, "Select a day on Start Date Ret006");
	}
	
	@And("Click on date picker End Date Ret006")
	public void Click_on_date_picker_End_Date_Ret006() {
		delay(2);
		modulReturn.clickOnDatePickerEndDateRet006();
		extentTest.log(LogStatus.PASS, "Click on date picker End Date Ret006");
	}
	
	@And("Select a day on End Date Ret006")
	public void Select_a_day_on_End_Date_Ret006() {
		delay(2);
		modulReturn.selectADayOnEndDateRet006();
		extentTest.log(LogStatus.PASS, "Select a day on End Date Ret006");
	}
	
	@And("Click Status Dropdown Ret006")
	public void Click_Status_Dropdown_Ret006() {
		delay(2);
		modulReturn.clickStatusDropdownRet006();
		extentTest.log(LogStatus.PASS, "Click Status Dropdown Ret006");
	}
	
	@And("Select Status Complete Ret006")
	public void Select_Status_Complete_Ret006() {
		delay(2);
		modulReturn.selectStatusCompleteRet006();
		extentTest.log(LogStatus.PASS, "Select Status Complete Ret006");
	}
	
	@And("Click Button Filter Ret006")
	public void Click_Button_Filter_Ret006() {
		delay(2);
		modulReturn.clickButtonFilterRet006();
		extentTest.log(LogStatus.PASS, "Click Button Filter Ret006");
	}
	
	@Then("User return Page for status Complete Ret006")
	public void User_return_Page_for_status_Complete_Ret006() {
		delay(2);
		System.out.println("Validation text is : " + modulReturn.userReturnPageForStatusCompleteRet006());
		String txtRet005 = modulReturn.userReturnPageForStatusCompleteRet006();
		assertTrue(txtRet005.contains("Sudah TTD"));
		extentTest.log(LogStatus.PASS, "User_return_Page_for_status_Complete_Ret006");
	}
	
	
	// Scenario: User select Data Display
	@And("User select data display per page")
	public void User_select_data_display_per_page() {
		delay(2);
		modulReturn.dataDisplay();
		delay(2);
		scroll(1200);
		delay(2);
		extentTest.log(LogStatus.PASS, "User select data display per page");

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
