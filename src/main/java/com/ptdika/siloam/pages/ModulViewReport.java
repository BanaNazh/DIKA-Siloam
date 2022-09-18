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
	
	@FindBy(xpath = "//button[normalize-space()='Filter']")
	private WebElement btnFilter;
	
	@FindBy(xpath = "//i[@class='fa fa-redo-alt']")
	private WebElement btnRedo;
	
	@FindBy(xpath = "//button[normalize-space()='Export']")
	private WebElement btnExport;
	
	@FindBy(xpath = "//button[normalize-space()='Download']")
	private WebElement btnDownload;
	
	@FindBy(xpath = "//*[@id=\"data-table-default2\"]/tbody/tr[1]/td[2]/a")
	private WebElement btnView;
	
	@FindBy(xpath = "//*[@id=\"preview\"]")
	private WebElement btnPreview;
	
	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/a[1]")
	private WebElement btnFaskesAwal;
	
	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/a[1]")
	private WebElement btnFaskesTujuan;
	
	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[9]/a[1]")
	private WebElement btnPDF;
	
	public String getTxtPageModul() {
		return txtHeader.getText();
	}
	
	public void onFeatureViewReport() {
		btnFeature.click();
	}
	
	public void startDate() {
		btnStartDate.click();
		clickStartDate.click();
	}
	
	public void endDate() {
		btnEndDate.click();
		clickEndDate.click();
	}
	
	public void filter() {
		btnFilter.click();
	}
	
	public void redo() {
		btnRedo.click();
	}
	
	public String getTxtAlertInfo() {
		return btnEndDate.getText();
	}
	
	public void export() {
		btnExport.click();
	}
	
	public void download() {
		btnDownload.click();
	}
	
	public void view() {
		btnView.click();
	}
	
	public void preview() {
		btnPreview.click();
	}
	
	public void faskesAwal() {
		btnFaskesAwal.click();
	}
	
	public void faskesTujuan() {
		btnFaskesTujuan.click();
	}
	
	public void pdfAgreement() {
		btnPDF.click();
	}
}
