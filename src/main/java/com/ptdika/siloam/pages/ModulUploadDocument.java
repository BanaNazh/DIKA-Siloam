package com.ptdika.siloam.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptdika.siloam.drivers.DriverSingleton;

public class ModulUploadDocument {

	private WebDriver driver;
	
	public ModulUploadDocument() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[normalize-space()='New']")
	private WebElement btnNew;
	
	@FindBy(xpath = "//input[@type='search']")
	private WebElement srcNama;
	
	@FindBy(xpath = "//a[@title='View']")
	private WebElement btnEye;
	
	@FindBy(xpath = "//button[normalize-space()='Cancel']")
	private WebElement btnCancel;
	
	@FindBy(xpath = "//i[@class='fa fa-save']")
	private WebElement btnSave;
	
	@FindBy(xpath = "//span[normalize-space()='Foto Faskes Awal']")
	private WebElement btnAwal;
	
	@FindBy(xpath = "//span[normalize-space()='Foto Faskes Tujuan']")
	private WebElement btnTujuan;
	
	@FindBy(xpath = "//span[normalize-space()='Tanda Tangan Digital']")
	private WebElement btnTTD;
	
	@FindBy(xpath = "//input[@id='file']")
	private WebElement btnGambarAwal;
	
	@FindBy(xpath = "//input[@id='file']")
	private WebElement btnGambarTujuan;
	
	@FindBy(xpath = "//input[@id='file']")
	private WebElement btnGambarTTD;
	
	@FindBy(xpath = "//button[@class='swal-button swal-button--confirm']")
	private WebElement btnConfirm;
	
	@FindBy(xpath = "//*[@id=\"default-tab-2\"]/div[2]/div/div/a")
	private WebElement btnNext;
	
	public void btnNew() {
		btnNew.click();
	}
	
	public void srcNama(String nama) {
		this.srcNama.sendKeys(nama);
	}
	
	public void btnEye() {
		btnEye.click();
	}
	
	public void btnAwal() {
		btnAwal.click();
	}
	
	public void btnTujuan() {
		btnTujuan.click();
	}
	
	public void btnTTD() {
		btnTTD.click();
	}
	
	public void btnCancel() {
		btnCancel.click();
	}
	
	public void btnSave() {
		btnSave.click();
	}
	
	public void btnGambarAwal() {
		btnGambarAwal.sendKeys("D:\\Screenshot_3.jpg");
	}
	
	public void btnGambarTujuan() {
		btnGambarAwal.sendKeys("D:\\Screenshot_4.jpg");
	}
	
	public void btnGambarTTD() {
		btnGambarAwal.sendKeys("D:\\Screenshot_5.jpg");
	}
	
	public void btnConfirm() {
		btnConfirm.click();
	}
	
	public void btnNext() {
		btnNext.click();
	}
}
