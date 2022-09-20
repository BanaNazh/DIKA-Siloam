package com.ptdika.siloam.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ptdika.siloam.drivers.DriverSingleton;

public class ModulTandaTanganDigital {

private WebDriver driver;
	
	public ModulTandaTanganDigital() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
//	Form Dashboard
	@FindBy(xpath = "//span[normalize-space()='New']")
	private WebElement btnNew;
	
	@FindBy(xpath = "//input[@type='search']")
	private WebElement srcNama;
	
	@FindBy(xpath = "//a[@title='View']")
	private WebElement btnEye;
	
// Form Tanda Tangan Digital Edit Text Field	
	@FindBy(xpath = "//select[@id='scaleSelect']")
	private WebElement btnCollapseEdit;
	
	@FindBy(xpath = "//button[@id='btnEdit']")
	private WebElement btnEdit;
	
	@FindBy(xpath = "//button[@id='btnCancelUpdate']")
	private WebElement btnCancelUpdate;
	
	@FindBy(xpath = "//input[@id='name']")
	private WebElement txtNama;
	
	@FindBy(xpath = "//input[@id='no_bpjs']")
	private WebElement txtBpjs;
	
	@FindBy(xpath = "//input[@id='no_ktp']")
	private WebElement txtKtp;
	
	@FindBy(xpath = "//textarea[@id='address']")
	private WebElement txtAlamat;
	
	@FindBy(xpath = "//span[@id='select2-ktp_city-container']")
	private WebElement btnKota;
	
	@FindBy(xpath = "//input[@role='textbox']")
	private WebElement txtPilihKotaHuruf;
	
	@FindBy(xpath = "//input[@id='origin_faskes']")
	private WebElement txtFaskesAwal;
	
	@FindBy(xpath = "//span[@id='select2-destination_faskes-container']")
	private WebElement btnFaskesTujuan;
	
	@FindBy(xpath = "//input[@role='textbox']")
	private WebElement txtFaskesTujuan;
	
	@FindBy(xpath = "//textarea[@id='reason']")
	private WebElement txtAlasan;

	@FindBy(xpath = "//button[@id='btnUpdate']")
	private WebElement btnUpdate;
	
//	Upload Ulang Document
	@FindBy(xpath = "//*[@id=\"fileupload\"]/div/table/tbody/tr[1]/td[4]/a")
	private WebElement btnAddFiles1;
	
	@FindBy(xpath = "//*[@id=\"fileupload\"]/div/table/tbody/tr[2]/td[4]/a")
	private WebElement btnAddFiles2;
	
	@FindBy(xpath = "//*[@id=\"fileupload\"]/div/table/tbody/tr[3]/td[4]/a")
	private WebElement btnAddFiles3;
	
	@FindBy(xpath = "//span[normalize-space()='×']")
	private WebElement btnCancelUpload;
	
	@FindBy(xpath = "//*[@id=\"btnSaveFoto\"]")
	private WebElement btnSaveUpload;
	
	@FindBy(xpath = "//*[text()=\"Choose File\"]")
	private WebElement btnGambarBefore;
	private WebElement btnGambarAfter;
	private WebElement btnGambarTTD;
	
	@FindBy(xpath = "//*[@id=\"default-tab-3\"]/div[2]/div/div/div[2]/a")
	private WebElement btnSubmitTTD;
	
	
	
//	Form Dashboard===============================
	public void btnNew() {
		btnNew.click();
	}
	
	public void srcNama(String nama) {
		this.srcNama.sendKeys(nama);
	}
	
	public void btnEye() {
		btnEye.click();
	}

// Form Tanda Tangan Digital Edit Text Field
	public void btnEdit() {
		btnEdit.click();
	}
	
	public void btnCancelUpdate() {
		btnCancelUpdate.click();
	}
	
	public void txtNama(String nama) {
		txtNama.clear();
		this.txtNama.sendKeys(nama);
	}
	
	public void txtBPJS(String nama) {
		txtBpjs.clear();
		this.txtBpjs.sendKeys(nama);
	}
	
	public void txtKTP(String nama) {
		txtKtp.clear();
		this.txtKtp.sendKeys(nama);
	}
	
	public void txtAlamat(String nama) {
		txtAlamat.clear();
		this.txtAlamat.sendKeys(nama);
	}
	
	public void btnKota() {
		btnKota.click();
	}

	public void txtPilihKotaHuruf(String nama) {
		this.txtPilihKotaHuruf.sendKeys(nama);
	}

	public void txtFaskesAwal(String nama) {
		txtFaskesAwal.clear();
		this.txtFaskesAwal.sendKeys(nama);
	}

	public void btnFaskesTujuan() {
		btnFaskesTujuan.click();
	}
	
	public void txtFaskesTujuan(String nama) {
		txtFaskesTujuan.clear();
		this.txtFaskesTujuan.sendKeys(nama);
	}
	
	public void txtAlasan(String nama) {
		txtAlasan.clear();
		this.txtAlasan.sendKeys(nama);
	}
	
	public void btnUpdate() {
		btnUpdate.click();
	}
	
//	Upload Ulang Document
	public void btnAddFile1() {
		btnAddFiles1.click();
	}
	
	public void btnAddFile2() {
		btnAddFiles2.click();
	}
	
	public void btnAddFile3() {
		btnAddFiles3.click();
	}
	
	public void btnGambarBefore() {
		btnGambarBefore.sendKeys("D:\\Screenshot_6.jpg");
	}
	
	public void btnGambarAfter() {
		btnGambarAfter.sendKeys("D:\\Screenshot_7.jpg");
	}
	
	public void btnGambarTTD() {
		btnGambarTTD.sendKeys("D:\\Screenshot_8.jpg");
	}
	
	public void btnCancelUpload() {
		btnCancelUpload.click();
	}
	
	public void btnSaveUpload() {
		btnSaveUpload.click();
	}
	
	public void btnSubmitTTD() {
		btnSubmitTTD.click();
	}
}
