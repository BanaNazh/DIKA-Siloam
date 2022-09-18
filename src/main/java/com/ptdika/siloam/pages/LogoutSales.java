package com.ptdika.siloam.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptdika.siloam.drivers.DriverSingleton;

public class LogoutSales {
	private WebDriver driver;

	public LogoutSales() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[@class='d-none d-md-inline']")
	private WebElement btnProfile;
	
	@FindBy(xpath = "//a[@class='dropdown-item']")
	private WebElement btnLogout;
	
	
	public void clickBtnProfile() {
		btnProfile.click();
	}
	
	public void clickBtnLogoutSales() {
		btnLogout.click();
	}
}
