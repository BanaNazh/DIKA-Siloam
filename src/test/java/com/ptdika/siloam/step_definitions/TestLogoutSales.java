package com.ptdika.siloam.step_definitions;

import org.openqa.selenium.WebDriver;

import com.ptdika.siloam.pages.LogoutSales;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class TestLogoutSales {
	public static WebDriver driver;
	private static ExtentTest extentTest;
	private LogoutSales logoutSales = new LogoutSales();

	public TestLogoutSales() {
		driver = Hooks.driver;
		extentTest = Hooks.extentTest;
	}

	@And("User Click On Button Profile Sales")
	public void User_Click_On_Button_Profile_Sales() {
		logoutSales.clickBtnProfile();
		extentTest.log(LogStatus.PASS, "User Click On Button Profile Sales");
	}

	@And("User Click On Button Logout Sales")
	public void User_Click_On_Button_Logout_Sales() {
		logoutSales.clickBtnLogoutSales();
		extentTest.log(LogStatus.PASS, "User_Click_On_Button_Logout_Sales");
	}
	
	@Then("Logged Out Successfully")
	public void Logged_Out_Successfully() {
		extentTest.log(LogStatus.PASS, "Logged Out Successfully");
	}
}
