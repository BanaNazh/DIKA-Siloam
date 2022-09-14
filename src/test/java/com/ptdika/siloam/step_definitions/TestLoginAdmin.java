package com.ptdika.siloam.step_definitions;

import org.openqa.selenium.WebDriver;

import com.ptdika.siloam.pages.LoginSales;
import com.ptdika.siloam.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestLoginAdmin {
	public static WebDriver driver;
	private static ExtentTest extentTest;
	private LoginSales loginPage = new LoginSales();

	public TestLoginAdmin() {
		driver = Hooks.driver;
		extentTest = Hooks.extentTest;
	}

	@When("User Admin go to Web Dika Siloam")
	public void user_admin_go_to_Web_Dika_Siloam() {
		driver.get(Constants.URL);
		extentTest.log(LogStatus.PASS, "User Admin go to Web Dika Siloam");
		
	}

	@And("User Admin enter Invalid username and password")
	public void user_admin_enter_invalid_username_and_password() {
		loginPage.login("admindikaa", "d1k4@passw0rd");
		extentTest.log(LogStatus.PASS, "User Admin enter invalid username and password");
	}

	@And("User Admin click button login_invalid")
	public void user_admin_click_button_login_invalid() {
	extentTest.log(LogStatus.PASS, "User Admin click button login invalid");
	
	}

	@Then("User Admin enter invalid credentials")
	public void user_admin_enter_invalid_credentials() {
		extentTest.log(LogStatus.PASS, "User Admin invalid credentials");
	}		

	@When("User Admin enter valid username and password")
	public void user_admin_enter_valid_username_and_password() {
		driver.navigate().refresh();
		delay(1);
		loginPage.login("admindika", "d1k4@passw0rd");
		extentTest.log(LogStatus.PASS, "User Admin enter valid username and password");
	}

	@And("User Admin click button login valid")
	public void user_admin_click_button_login_valid() {
		extentTest.log(LogStatus.PASS, "User Admin click button login valid");

	}

	@Then("User Admin enter valid credentials")
	public void user_admin_enter_valid_credentials() {
		extentTest.log(LogStatus.PASS, "User Admin valid credentials valid");

	}

	static void delay(int detik) {
		try {
			Thread.sleep(1000 * detik);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
