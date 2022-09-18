package com.ptdika.siloam.step_definitions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.ptdika.siloam.pages.InputTTDDigital;
import com.ptdika.siloam.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestInputTTDDigital {
	public static WebDriver driver;
	private static ExtentTest extentTest;
	private InputTTDDigital modulInputTTDDigital = new InputTTDDigital();

	public TestInputTTDDigital() {
		driver = Hooks.driver;
		extentTest = Hooks.extentTest;
	}
// Login Sales	
//Scenario : User valid login module Input TTD Digital
	@When("User go to Web Dika Siloam modul Input TTD Digital")
	public void User_go_to_Web_Dika_Siloam_modul_input_TTD_Digital() {
		driver.get(Constants.URL);
		extentTest.log(LogStatus.PASS, "User go to Web Dika Siloam modul Input TTD Digital");
	}

	@And("User enter valid username and password modul Input TTD Digital")
	public void User_enter_valid_username_and_password_modul_Input_TTD_Digital() {
		driver.navigate().refresh();
		delay(1);
		modulInputTTDDigital.login("D6200927", "1997-10-23");
		extentTest.log(LogStatus.PASS, "User enter valid username and password modul Input TTD Digital");
	}

	@And("User click button login valid modul modul Input TTD Digital")
	public void User_click_button_login_valid_modul_modul_Input_TTD_Digital() {
		extentTest.log(LogStatus.PASS, "User click button login valid modul modul Input TTD Digital");

	}

	@Then("User enter valid credentials modul modul Input TTD Digital")
	public void User_enter_valid_credentials_modul_modul_Input_TTD_Digital() {
		extentTest.log(LogStatus.PASS, "User enter valid credentials modul modul Input TTD Digital");
	}
	
	@And("User click return menu")
	public void User_click_return_menu() {
		modulInputTTDDigital.userClickReturnMenu();
		extentTest.log(LogStatus.PASS, "User click return menu");
	}
	
	@And("User Click Search Field")
	public void User_Click_Search_Field() {
		modulInputTTDDigital.userClickSearchField();
		extentTest.log(LogStatus.PASS, "User Click Search Field");
		delay(2);
	}
	
	@And("User Click On Eye Button")
	public void User_Click_On_Eye_Button() {
		modulInputTTDDigital.userClickOnEyeButton();
		extentTest.log(LogStatus.PASS, "User Click On Eye Button");
	}
	
	@And("User Click On Button Next")
	public void User_Click_On_Button_Next() {
		scroll(100);
		modulInputTTDDigital.userClickOnButtonNext();
		extentTest.log(LogStatus.PASS, "User Click On Button Next");
	}
	
	@And("User Click On Alert OK")
	public void User_Click_On_Alert_OK() {
		extentTest.log(LogStatus.PASS, "User Click On Alert OK");
	}
	
	@And("User Click Submit Button")
	public void User_Click_Submit_Button() {
		scroll(1200);
		extentTest.log(LogStatus.PASS, "User Click Submit Button");
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

