package com.ptdika.siloam.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptdika.siloam.drivers.DriverSingleton;


public class UploadDocument {
	
	private WebDriver driver;

	public UploadDocument() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath = "//input[@id='name']")
	private WebElement username;
}
