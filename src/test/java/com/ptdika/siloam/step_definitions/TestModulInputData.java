package com.ptdika.siloam.step_definitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.ptdika.siloam.pages.ModulInputData;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.When;

public class TestModulInputData {

	public static WebDriver driver;
	private static ExtentTest extentTest;
	private ModulInputData modul = new ModulInputData();

	public TestModulInputData() {
		driver = Hooks.driver;
		extentTest = Hooks.extentTest;
	}
	
	@When("User on menu dashboard")
	public void User_on_menu_dashboard() {
		assertEquals(modul.getTxtPageModul(), "Home");
		extentTest.log(LogStatus.PASS, "User on menu dashboard");	
	}
}
