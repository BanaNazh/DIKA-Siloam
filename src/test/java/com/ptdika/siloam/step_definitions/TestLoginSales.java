package com.ptdika.siloam.step_definitions;

import org.openqa.selenium.WebDriver;

import com.ptdika.siloam.pages.LoginSales;
import com.ptdika.siloam.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestLoginSales {
	
		public static WebDriver driver;
		private static ExtentTest extentTest;
		private LoginSales loginPage = new LoginSales();

		public TestLoginSales() {
			driver = Hooks.driver;
			extentTest = Hooks.extentTest;
		}

		@When("User go to Web Dika Siloam modul Return")
		public void user_go_to_Web_Dika_Siloam_modul_Return() {
			driver.get(Constants.URL);
			extentTest.log(LogStatus.PASS, "User go to Web Dika Siloam modul Return");
			
		}

		@And("User enter Invalid username and password")
		public void user_enter_invalid_username_and_password() {
			loginPage.login("D6200927", "1997-10-24");
			extentTest.log(LogStatus.PASS, "User enter invalid username and password");
		}

		@And("User click button login_invalid")
		public void user_click_button_login_invalid() {
		extentTest.log(LogStatus.PASS, "User click button login invalid");
		
		}

		@Then("User enter invalid credentials")
		public void user_enter_invalid_credentials() {
			extentTest.log(LogStatus.PASS, "User invalid credentials");
		}		

		@When("User enter valid username and password")
		public void user_enter_valid_username_and_password() {
			driver.navigate().refresh();
			delay(1);
			loginPage.login("D6200927", "1997-10-23");
			extentTest.log(LogStatus.PASS, "User enter valid username and password");
		}

		@And("User click button login valid")
		public void user_click_button_login_valid() {
			extentTest.log(LogStatus.PASS, "User click button login valid");

		}

		@Then("User enter valid credentials")
		public void user_enter_valid_credentials() {
			extentTest.log(LogStatus.PASS, "User valid credentials valid");

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
	


