package com.ptdika.siloam.step_definitions;

import static org.testng.Assert.assertEquals;

import javax.management.Query;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.ptdika.siloam.pages.ModulInputData;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.*;

public class TestModulInputData {

	public static WebDriver driver;
	private static ExtentTest extentTest;
	private ModulInputData modul = new ModulInputData();

	public TestModulInputData() {
		driver = Hooks.driver;
		extentTest = Hooks.extentTest;
	}
	
	@When("User on menu Dashboard")
	public void User_on_menu_dashboard() {
		assertEquals(modul.getTxtPageModul(), "Home");
		extentTest.log(LogStatus.PASS, "User on menu Dashboard");	
	}
	
	@And("User click menu Input")
	public void User_click_menu_input() {
		modul.btnInput();
		extentTest.log(LogStatus.PASS, "User click menu Input");	
	}
	
// Form Nama	
	@And("User input field Nama huruf")
	public void user_input_field_nama_huruf() {
		modul.txtNama("Ubaidillah");
		extentTest.log(LogStatus.PASS, "User input field Nama huruf");
	}
	
	@And("User input field Nama angka")
	public void user_input_field_nama_angka() {
		modul.txtNama("1234667");
		extentTest.log(LogStatus.PASS, "User input field Nama angka");
	}
	
	@And("User input field Nama simbol")
	public void user_input_field_nama_simbol() {
		modul.txtNama("^$^#$%%^%$");
		extentTest.log(LogStatus.FAIL, "User input field Nama simbol");
	}
	
	@And("User input field Nama keep")
	public void user_input_field_nama_keep() {
		modul.txtNamaKeep("Ubaidillah");
		extentTest.log(LogStatus.PASS, "User input field Nama keep");
	}
	
// Form BPJS
	@When("User input field BPJS simbol")
	public void user_input_field_BPJS_simbol() {
		modul.txtBPJS("^$^#$%%^%$");
		extentTest.log(LogStatus.PASS, "User input field BPJS simbol");
	}
	
	@And("User input field BPJS huruf")
	public void user_input_field_bpjs_huruf() {
		modul.txtBPJS("Ubaidillah");
		extentTest.log(LogStatus.PASS, "User input field BPJS huruf");
	}
	
	@And("User input field BPJS angka")
	public void user_input_field_bpjs_angka() {
		modul.txtBPJS("1122334466554");
		extentTest.log(LogStatus.PASS, "User input field BPJS angka");
	}
	
	@And("User input field BPJS kurang")
	public void user_input_field_bpjs_kurang() {
		modul.txtBPJSkurang("112233446655");
		extentTest.log(LogStatus.PASS, "User input field BPJS angka");
	}
	
	@And("User input field BPJS tambah")
	public void user_input_field_bpjs_tambah() {
		modul.txtBPJStambah("4");
		extentTest.log(LogStatus.PASS, "User input field BPJS tambah");
	}
	
	@Then("User click button Simpan")
	public void user_click_button_simpan() {
		modul.btnSimpan();
		extentTest.log(LogStatus.PASS, "User click button Simpan");	
		Hooks.delay(3);
	}
	
// Form KTP	
	@When("User input field KTP angka")
	public void user_input_field_ktp_angka() {
		modul.txtKTP("12345678910111213");
		extentTest.log(LogStatus.PASS, "User input field KTP angka");
	}
	
	@And("User input field KTP huruf")
	public void user_input_field_ktp_huruf() {
		modul.txtKTP("Ubaidillah");
		extentTest.log(LogStatus.PASS, "User input field KTP huruf");
	}
	
	@And("User input field KTP simbol")
	public void user_input_field_ktp_simbol() {
		modul.txtKTP("^$^#$%%^%$");
		extentTest.log(LogStatus.PASS, "User input field KTP simbol");
	}
	
	@And("User input field KTP kurang")
	public void user_input_field_ktp_kurang() {
		modul.txtKTPkurang("123456789101112");
		extentTest.log(LogStatus.PASS, "User input field KTP kurang");
	}
	
	@And("User input field KTP tambah")
	public void user_input_field_ktp_tambah() {
		modul.txtKTPtambah("3");
		extentTest.log(LogStatus.PASS, "User input field KTP tambah");
	}
	
//	Form Alamat
	@When("User input field Alamat angka")
	public void user_input_field_alamat_angka() {
		modul.txtAlamat("12321231");
		extentTest.log(LogStatus.PASS, "User input field Alamat angka");
	}
	
	@And("User input field Alamat simbol")
	public void user_input_field_alamat_simbol() {
		modul.txtAlamat("!@#!@#!@#!@");
		extentTest.log(LogStatus.PASS, "User input field Alamat simbol");
	}
	
	@And("User input field Alamat huruf")
	public void user_input_field_alamat_huruf() {
		modul.txtAlamatHuruf("Jalan Kenanga");
		extentTest.log(LogStatus.PASS, "User input field Alamat huruf");
	}
	
//	Form Pilih Kota
	@When("User click button kota KTP")
	public void user_click_button_kota_ktp() {
	modul.btnKota();
	extentTest.log(LogStatus.PASS, "User click button kota KTP");
	}
	
	@And("User input field angka pilih KTP")
	public void user_input_field_angka_pilih_ktp() {
		modul.txtPilihKota("31231211");
		extentTest.log(LogStatus.PASS, "User input field angka pilih KTP");
	}
	
	@And("User input field simbol pilih KTP")
	public void user_input_field_simbol_pilih_ktp() {
		modul.txtPilihKota("!@#!@!!@#");
		extentTest.log(LogStatus.PASS, "User input field simbol pilih KTP");
	}   
	
	@And("User input field Jakarta Selatan")
	public void user_input_field_angka_jakarta_selatan() {
		modul.txtPilihKotaHuruf("Jakarta Selatan");
		extentTest.log(LogStatus.PASS, "User input field Jakarta Selatan");
	}
	
	@And("User click Jakarta Selatan")
	public void user_click_jakarta_selatan() {
		modul.pilihKota();
		extentTest.log(LogStatus.PASS, "User click Jakarta Selatan");
	}
	
//	Form Faskes Awal
	@When("User input field faskes Awal simbol")
	public void user_input_field_faskes_awal_simbol() {
	modul.txtFaskesAwal("!@#!@!@#!@#");
	extentTest.log(LogStatus.PASS, "User input field faskes Awal simbol");
	}
	
	@And("User input field faskes Awal angka")
	public void user_input_field_faskes_awal_angka() {
	modul.txtFaskesAwal("85645487");
	extentTest.log(LogStatus.PASS, "User input field faskes Awal angka");
	}
	
	@And("User input field faskes Awal huruf")
	public void user_input_field_faskes_awal_huruf() {
	modul.txtFaskesAwalHuruf("Clinic Kemang Sari");
	extentTest.log(LogStatus.PASS, "User input field faskes Awal huruf");
	}
	
//	Form Pilih Faskes Tujuan
	@When("User click button faskes Tujuan")
	public void user_click_button_faskes_tujuan() {
	modul.btnFaskesTujuan();
	extentTest.log(LogStatus.PASS, "User click button faskes Tujuan");
	}
	
	@And("User input field angka faskes Tujuan")
	public void user_input_field_angka_faskes_tujuan() {
		modul.txtFaskesTujuan("31231211");
		extentTest.log(LogStatus.PASS, "User input field angka faskes Tujuan");
	}
	
	@And("User input field simbol faskes Tujuan")
	public void user_input_field_simbol_faskes_tujuan() {
		modul.txtFaskesTujuan("!@#!@!!@#");
		extentTest.log(LogStatus.PASS, "User input field simbol faskes Tujuan");
	}   
	
	@And("User input field Jakarta Pusat")
	public void user_input_field_jakarta_pusat() {
		modul.txtFaskesTujuanHuruf("Jakarta" + "\n");
		extentTest.log(LogStatus.PASS, "User input field Jakarta Pusat");
	}
	
	
	@And("User input field Alasan")
	public void user_input_field_alasan() {
		modul.txtAlasan("Pindah Alamat Rumah");
		extentTest.log(LogStatus.PASS, "User input field Alasan");
	}
	
//	@When("User click button Foto faskes")
//	public void user_click_button_foto_faskes() {
//		modul.btnFaskes();
//		extentTest.log(LogStatus.PASS, "User click button Foto faskes");
//	}
	
}
