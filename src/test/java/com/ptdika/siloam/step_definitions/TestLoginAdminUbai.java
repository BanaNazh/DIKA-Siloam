package com.ptdika.siloam.step_definitions;

import org.openqa.selenium.WebDriver;

import com.ptdika.siloam.pages.LoginAdminUbai;
import com.ptdika.siloam.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.*;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;

public class TestLoginAdminUbai {

	public static WebDriver driver;
	private static ExtentTest extentTest;
	private LoginAdminUbai loginPage = new LoginAdminUbai();

	public TestLoginAdminUbai() {
		driver = Hooks.driver;
		extentTest = Hooks.extentTest;
	}

	@When("User Admin go to Web Dika Siloam")
	public void user_admin_go_to_Web_Dika_Siloam() {
		driver.get(Constants.URL);
		extentTest.log(LogStatus.PASS, "User Admin go to Web Dika Siloam");
		
	}

	@And("User Admin enter valid username and password")
	public void user_admin_enter_valid_username_and_password() {
//		driver.navigate().refresh();
//		delay(1);
		loginPage.login("admindika", "d1k4@passw0rd");
		extentTest.log(LogStatus.PASS, "User Admin enter valid username and password");
	}

	@Then("User Admin click button login valid")
	public void user_admin_click_button_login_valid() {
		extentTest.log(LogStatus.PASS, "User Admin click button login valid");

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
