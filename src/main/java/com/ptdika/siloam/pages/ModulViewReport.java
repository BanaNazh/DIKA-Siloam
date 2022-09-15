package com.ptdika.siloam.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptdika.siloam.drivers.DriverSingleton;

public class ModulViewReport {

	private WebDriver driver;
	
	public ModulViewReport() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"sidebar\"]/div/div[1]/ul[2]/li[4]/a/span")
	private WebElement btnFeature;
	
	@FindBy(xpath = "//input[@id='datepicker']")
	private WebElement btnStartDate;
	
	@FindBy(xpath = "//td[@class='day'][normalize-space()='1']")
	private WebElement clickStartDate;
	
	@FindBy(xpath = "//input[@id='datepicker2']")
	private WebElement btnEndDate;
	
	@FindBy(xpath = "//td[normalize-space()='14']")
	private WebElement clickEndDate;
	
	@FindBy(xpath = "//button[normalize-space()='Filter']")
	private WebElement btnFilter;
	
	
	public void searchModulViewReport() {
		btnFeature.click();
		btnStartDate.click();
		clickStartDate.click();
		btnEndDate.click();
		clickEndDate.click();
		btnFilter.click();
	}
}
