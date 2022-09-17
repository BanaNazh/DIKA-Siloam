package com.ptdika.siloam.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
	
	@FindBy(xpath = "//span[normalize-space()='Input']")
	private WebElement btnInput;
	
	@FindBy(xpath = "//input[@id='name']")
	private WebElement txtNama;
	
	@FindBy(xpath = "//input[@id='name']")
	private WebElement txtNamaKeep;
		
	@FindBy(xpath = "//input[@id='no_bpjs']")
	private WebElement txtBpjs;
	
	@FindBy(xpath = "//input[@id='no_bpjs']")
	private WebElement txtBpjsKurang;
	
	@FindBy(xpath = "//input[@id='no_bpjs']")
	private WebElement txtBpjsTambah;
	
	@FindBy(xpath = "//input[@id='no_ktp']")
	private WebElement txtKtp;
	
	@FindBy(xpath = "//input[@id='no_ktp']")
	private WebElement txtKtpKurang;
	
	@FindBy(xpath = "//input[@id='no_ktp']")
	private WebElement txtKtpTambah;
	
	@FindBy(xpath = "//textarea[@id='address']")
	private WebElement txtAlamat;
	
	@FindBy(xpath = "//textarea[@id='address']")
	private WebElement txtAlamatHuruf;
	
	@FindBy(xpath = "//span[@id='select2-ktp_city-container']")
	private WebElement btnKota;
	
	@FindBy(xpath = "//*[@id=\"select2-ktp_city-result-tqog-KOTA JAKARTA SELATAN\"]")
	private WebElement pilihKota;
	
	@FindBy(xpath = "//input[@role='textbox']")
	private WebElement txtPilihKota;

	@FindBy(xpath = "//input[@role='textbox']")
	private WebElement txtPilihKotaHuruf;
	
	@FindBy(xpath = "//input[@id='origin_faskes']")
	private WebElement txtFaskesAwal;
	
	@FindBy(xpath = "//input[@id='origin_faskes']")
	private WebElement txtFaskesAwalHuruf;

	@FindBy(xpath = "//span[@id='select2-destination_faskes-container']")
	private WebElement btnFaskesTujuan;
	
	@FindBy(xpath = "//*[@id=\"select2-destination_faskes-result-cobp-2||Clinic Kepu Timur||Kota Jakarta Pusat\"]")
	private WebElement pilihFaskesTujuan;
	
	@FindBy(xpath = "//input[@role='textbox']")
	private WebElement txtFaskesTujuan;
	
	@FindBy(xpath = "//input[@role='textbox']")
	private WebElement txtFaskesTujuanHuruf;
	
	@FindBy(xpath = "//textarea[@id='reason']")
	private WebElement txtAlasan;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnSimpan;
	
	
	
//	@FindBy(xpath = "//span[normalize-space()='Foto Faskes Awal']")
//	private WebElement btnFaskes;
	
	
	// Actual
	public String getTxtPageModul() { // validasi teks di tampilan
		return txtHeader.getText();
	}
	
	public void btnInput() {
		btnInput.click();
	}
	
	public void txtNama(String nama) {
		this.txtNama.sendKeys(nama);
		txtNama.clear();
	}
	
	public void txtNamaKeep(String nama) {
		this.txtNamaKeep.sendKeys(nama);
	}
	
	public void txtBPJS(String nama) {
		this.txtBpjs.sendKeys(nama);
		txtBpjs.clear();
	}
	
	public void txtBPJSkurang(String nama) {
		this.txtBpjsKurang.sendKeys(nama);
	}
	
	public void txtBPJStambah(String nama) {
		this.txtBpjsTambah.sendKeys(nama);
	}
	
	public void btnSimpan() {
		btnSimpan.click();
	}
	
	public void txtKTP(String nama) {
		this.txtKtp.sendKeys(nama);
		txtKtp.clear();
	}
	
	public void txtKTPkurang(String nama) {
		this.txtKtpKurang.sendKeys(nama);
	}
	
	public void txtKTPtambah(String nama) {
		this.txtKtpTambah.sendKeys(nama);
	}
	
	public void txtAlamat(String nama) {
		this.txtAlamat.sendKeys(nama);
		txtAlamat.clear();
	}
	
	public void txtAlamatHuruf(String nama) {
		this.txtAlamatHuruf.sendKeys(nama);
	}
	
	public void btnKota() {
		btnKota.click();
	}
	
	public void pilihKota() {
		pilihKota.click();;
	}
	
	public void txtPilihKota(String nama) {
		this.txtPilihKota.sendKeys(nama);
		txtPilihKota.clear();
	}
	
	public void txtPilihKotaHuruf(String nama) {
		this.txtPilihKotaHuruf.sendKeys(nama);
	}
		
	public void txtFaskesAwal(String nama) {
		this.txtFaskesAwal.sendKeys(nama);
		txtFaskesAwal.clear();
	}
	
	public void txtFaskesAwalHuruf(String nama) {
		this.txtFaskesAwalHuruf.sendKeys(nama);
	}
		
	public void btnFaskesTujuan() {
		btnFaskesTujuan.click();
	}
	
	public void pilihFaskesTujuan() {
		pilihFaskesTujuan.click();;
	}
	
	public void txtFaskesTujuan(String nama) {
		this.txtFaskesTujuan.sendKeys(nama);
		txtFaskesTujuan.clear();
	}
	
	public void txtFaskesTujuanHuruf(String nama) {
		this.txtFaskesTujuanHuruf.sendKeys(nama);
	}	
	
	public void txtAlasan(String nama) {
		this.txtAlasan.sendKeys(nama);
	}
//	public void btnFaskes() {
//		btnFaskes.click();
//	}
	
}
