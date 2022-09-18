package com.ptdika.siloam.pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptdika.siloam.drivers.DriverSingleton;

public class LoginAdmin {
	private WebDriver driver;

	public LoginAdmin() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@placeholder='Username']")
	//input[contains(@attr, 'value')]
	private WebElement username;

	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnLogin;
	
	@FindBy (xpath = "//span[normalize-space()='View & Export']")
	private WebElement menuViewReport;
	
	@FindBy(xpath = "//input[@id='datepicker']")
	private WebElement datePicker;
	
	@FindBy(xpath = "//button[normalize-space()='Filter']")
	private WebElement btnFilter;

	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissable']")
	private WebElement msgError;

	@FindBy(xpath = "//h1[normalize=space()='Dashboard']")
	private WebElement txtDashboard;
	
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
	
	public void clickMenuViewReport() {
		menuViewReport.click();
	}
	
	public void clickBtnFilter() {
		btnFilter.click();
	}
	
	public void txtScrap() {
		String msge = datePicker.getAttribute("validationMessage");
		System.out.println(msge);
		assertTrue(msge.contains("Please fill out this field."));
	}

	// Actual;
	public String msgInvalid() {
		return msgError.getText();
	}

	public String getTxtDashboard() {
		return txtDashboard.getText();
	}
	
	public String getTxtEmpty() {
		return txtEmpty.getText();
	}


}
