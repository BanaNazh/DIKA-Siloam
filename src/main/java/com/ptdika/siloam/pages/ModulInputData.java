package com.ptdika.siloam.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptdika.siloam.drivers.DriverSingleton;

public class ModulInputData {

private WebDriver driver;
	
	public ModulInputData() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h1[@class='page-header']")
	private WebElement txtHeader;
	
	@FindBy(xpath = "//*[@id=\"sidebar\"]/div/div[1]/ul[2]/li[4]/a/span")
	private WebElement btnFeature;
	
	@FindBy(xpath = "//input[@id='datepicker']")
	private WebElement btnStartDate;
	
	@FindBy(xpath = "//td[@class='day'][normalize-space()='6']")
	private WebElement clickStartDate;
	
	@FindBy(xpath = "//input[@id='datepicker2']")
	private WebElement btnEndDate;
	
	@FindBy(xpath = "//td[normalize-space()='8']")
	private WebElement clickEndDate;
	
	
	public String getTxtPageModul() {
		return txtHeader.getText();
	}
}
