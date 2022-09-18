package com.ptdika.siloam.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptdika.siloam.drivers.DriverSingleton;

public class InputTTDDigital {
	private WebDriver driver;

	public InputTTDDigital() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}

//WebElement
	@FindBy(xpath = "//input[@placeholder='Username']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnLogin;
	
	@FindBy(xpath = "//span[normalize-space()='New']")
	private WebElement btnReturn;
	
	@FindBy(xpath = "//input[@type='search']")
	private WebElement searchField;
	
	@FindBy(xpath = "//span[@class='fa fa-eye']")
	private WebElement eyeButton;
	
	@FindBy(xpath = "//a[@class='btn btn-primary']")
	private WebElement btnNext;
	
	@FindBy(xpath = "//a[@class='btn btn-primary']")
	private WebElement btnSubmit;
	
	
// Scenario
// Login Sales Successfully
	public void login(String username, String password) {
		this.username.sendKeys(username);// step
		this.password.sendKeys(password);
		btnLogin.click();
		}
	
	public void userClickReturnMenu() {
		btnReturn.click();
	}
	
	public void userClickSearchField() {
		searchField.sendKeys("BABANA" + "\n");
	}
	
	public void userClickOnEyeButton() {
		eyeButton.click();
	}
	
	public void userClickOnButtonNext() {
		btnNext.click();
		driver.switchTo().alert().accept();
	}
	
	public void userClickSubmitButton() {
		btnSubmit.click();
		driver.switchTo().alert().accept();
		
	}
}
