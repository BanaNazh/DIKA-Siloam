package com.ptdika.siloam.step_definitions;

import org.openqa.selenium.WebDriver;

import com.ptdika.siloam.pages.LoginSalesUbai;
import com.ptdika.siloam.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.*;

public class TestLoginSalesUbai {

	public static WebDriver driver;
	private static ExtentTest extentTest;
	private LoginSalesUbai loginPage = new LoginSalesUbai();

	public TestLoginSalesUbai() {
		driver = Hooks.driver;
		extentTest = Hooks.extentTest;
	}

	@When("User go to Web Dika Siloam")
	public void user_go_to_Web_Dika_Siloam() {
		driver.get(Constants.URL);
		extentTest.log(LogStatus.PASS, "User go to Web Dika Siloam");
	}
	
	@And("User sales enter valid username and password")
	public void user_sales_enter_valid_username_and_password() {
		driver.navigate().refresh();
		Hooks.delay(1);
		loginPage.login("D6200927", "1997-10-23");
		extentTest.log(LogStatus.PASS, "User sales enter valid username and password");
	}

	@Then("User click button login valid")
	public void user_click_button_login_valid() {
		extentTest.log(LogStatus.PASS, "User click button login valid");
	}
}
	
