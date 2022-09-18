package com.ptdika.siloam.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptdika.siloam.drivers.DriverSingleton;

public class LoginSales {
	private WebDriver driver;

	public LoginSales() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@placeholder='Username']")
	private WebElement username;

	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnLogin;

	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissable']")
	private WebElement msgError;
	
	@FindBy (xpath = "//span[@id='spanMessage']")
	private WebElement txtEmpty;

	// Scenario
	public void login(String username, String password) {
		this.username.sendKeys(username);// step
		this.password.sendKeys(password);
		btnLogin.click();
		
	}
	
	public void clickBtnLogin() {
		btnLogin.click();
	}

	// Actual
	public String msgInvalid() {
		return msgError.getText();
	}
	
	public String getTxtEmpty() {
		return txtEmpty.getText();
	}

}
