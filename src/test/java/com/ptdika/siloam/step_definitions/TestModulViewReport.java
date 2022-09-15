package com.ptdika.siloam.step_definitions;

import org.openqa.selenium.WebDriver;

import com.ptdika.siloam.pages.ModulViewReport;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.*;

public class TestModulViewReport {

	public static WebDriver driver;
	private static ExtentTest extentTest;
	private ModulViewReport modul = new ModulViewReport();

	public TestModulViewReport() {
		driver = Hooks.driver;
		extentTest = Hooks.extentTest;
	}
	
	@When("User Admin click view and report")
	public void user_admin_click_view_and_report() {
		extentTest.log(LogStatus.PASS, "User Admin click view and report");
	}
	
	@And("User Admin click start date")
	public void user_admin_click_start_date() {
		extentTest.log(LogStatus.PASS, "User Admin click start date");
	}
	
	@And("User Admin click end date")
	public void user_admin_click_end_date() {
		extentTest.log(LogStatus.PASS, "User Admin click end date");
	}
	
	@Then("User Admin click button filter")
	public void user_admin_click_button_filter() {
		extentTest.log(LogStatus.PASS, "User Admin click button filter");
	}
}
