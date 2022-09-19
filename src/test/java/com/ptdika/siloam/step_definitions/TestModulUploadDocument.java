package com.ptdika.siloam.step_definitions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import com.ptdika.siloam.pages.ModulUploadDocument;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.*;

public class TestModulUploadDocument {

	public static WebDriver driver;
	private static ExtentTest extentTest;
	private ModulUploadDocument modul = new ModulUploadDocument();
	
	public TestModulUploadDocument() {
		driver = Hooks.driver;
		extentTest = Hooks.extentTest;
	}
	
	@When("User click menu New")
	public void user_click_menu_new() {
		modul.btnNew();
		extentTest.log(LogStatus.PASS, "User click menu New");
	}
		
	@And("User click Search")
	public void user_click_search() {
		modul.srcNama("Kang Koswara" + "\n");
		Hooks.delay(3);
		extentTest.log(LogStatus.PASS, "User click menu Input");	
	}
	
	@Then("User click button Aksi")
	public void user_click_button_aksi() {
		modul.btnEye();
		extentTest.log(LogStatus.PASS, "User click button Aksi");
	}
	
//	Form Upload Faskes Awal
	@When("User click button foto Faskes Awal")
	public void user_click_button_foto_faskes_awal() {
		modul.btnAwal();
		extentTest.log(LogStatus.PASS, "User click button foto Faskes Awal");
	}
	
	@And ("User click button Cancel upload")
	public void user_click_button_cancel() {
		Hooks.delay(1);
		modul.btnCancel();
		extentTest.log(LogStatus.PASS, "User click button Cancel");
	}
	
	@And("User click button choose file Faskes Awal")
	public void user_click_button_choose_file_Faskes_Awal() {
		modul.btnGambarAwal();
		extentTest.log(LogStatus.PASS, "User click button choose file Faskes Awal");
	}
	
	@Then("User click button Simpan upload")
	public void user_click_button_simpan() {
		Hooks.delay(1);
		modul.btnSave();
		extentTest.log(LogStatus.PASS, "User click button Simpan");
	}
	
	@And("User click button Confirm")
	public void user_click_button_confirm() {
		Hooks.delay(1);
		modul.btnConfirm();
		extentTest.log(LogStatus.PASS, "User click button Confirm");
	}
	
	@And("User click button Selanjutnya")
	public void user_click_button_selanjutnya() {
		Hooks.delay(1);
		Hooks.scroll(150);
		modul.btnNext();
		extentTest.log(LogStatus.PASS, "User click button Selanjutnya");
	}
	
	@Then("User click button OK")
	public void user_click_button_OK() {
		Hooks.delay(3);
//		modul.pilihLanjut();
		driver.switchTo().alert().accept();
		Hooks.delay(2);
		extentTest.log(LogStatus.PASS, "User click button OK");
	}
	
//	Form Upload Foto Faskes Tujuan
	@When("User click button foto Faskes Tujuan")
	public void user_click_button_foto_faskes_tujuan() {
		modul.btnTujuan();
		extentTest.log(LogStatus.PASS, "User click button foto Faskes Tujuan");
	}
	
	@And("User click button choose file Faskes Tujuan")
	public void user_click_button_choose_file_Faskes_Tujuan() {
		modul.btnGambarTujuan();
		extentTest.log(LogStatus.PASS, "User click button choose file Faskes Tujuan");
	}
	
//	Form Upload Foto TTD Digital
	@When("User click button foto TTD Digital")
	public void user_click_button_foto_TTD_digital() {
		modul.btnTTD();
		extentTest.log(LogStatus.PASS, "User click button foto TTD Digital");
	}

	@And("User click button choose file TTD Digital")
	public void user_click_button_choose_file_TTD_Digital() {
		modul.btnGambarTTD();
		extentTest.log(LogStatus.PASS, "User click button choose file TTD Digital");
	}
}

