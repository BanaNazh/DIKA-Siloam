package com.ptdika.siloam.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptdika.siloam.drivers.DriverSingleton;

public class LoginAdminUbai {

	private WebDriver driver;
	
	public LoginAdminUbai() {
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
	}
	
	public void clickBtnLogin() {
		btnLogin.click();
	}
}
