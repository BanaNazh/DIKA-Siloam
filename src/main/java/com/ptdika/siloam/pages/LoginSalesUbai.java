package com.ptdika.siloam.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptdika.siloam.drivers.DriverSingleton;

public class LoginSalesUbai {

	private WebDriver driver;
	public LoginSalesUbai() {
			this.driver = DriverSingleton.getDriver();
			PageFactory.initElements(driver, this);
		}

		@FindBy(xpath = "//input[@placeholder='Username']")
		private WebElement username;

		@FindBy(xpath = "//input[@placeholder='Password']")
		private WebElement password;

		@FindBy(xpath = "//button[@type='submit']")
		private WebElement btnLogin;

	public void login(String username, String password) {
			this.username.sendKeys(username);// step
			this.password.sendKeys(password);
			btnLogin.click();
			
		}

}
