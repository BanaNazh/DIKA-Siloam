package com.ptdika.siloam.step_definitions;

import org.openqa.selenium.WebDriver;

import com.ptdika.siloam.pages.ModulTandaTanganDigital;
import com.ptdika.siloam.pages.ModulUploadDocument;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestModulTandaTanganDigital {

	public static WebDriver driver;
	private static ExtentTest extentTest;
	private ModulTandaTanganDigital modul = new ModulTandaTanganDigital();
	
	public TestModulTandaTanganDigital() {
		driver = Hooks.driver;
		extentTest = Hooks.extentTest;
	}
	
	@When("User click menu New ttd")
	public void user_click_menu_new_ttd() {
		modul.btnNew();
		extentTest.log(LogStatus.PASS, "User click menu New ttd");
	}
		
	@And("User click Search ttd")
	public void user_click_search_ttd() {
		modul.srcNama("Ubaidillah1" + "\n");
		Hooks.delay(3);
		extentTest.log(LogStatus.PASS, "User click menu Input ttd");	
	}
	
	@Then("User click button Aksi ttd")
	public void user_click_button_aksi_ttd() {
		modul.btnEye();
		extentTest.log(LogStatus.PASS, "User click button Aksi ttd");
	}
	

//  Form Tanda Tangan Digital Edit Text Field
	@When("User click button Edit")
	public void user_click_button_edit() {
		Hooks.scroll(150);
		modul.btnEdit();
		extentTest.log(LogStatus.PASS, "User click button Edit");
	}
	
	@And("User click button Cancel")
	public void user_click_button_cancel() {
		modul.btnCancelUpdate();
		extentTest.log(LogStatus.PASS, "User click button Cancel");
	}
	
	
	@And("User input field Nama ttd")
	public void user_input_field_nama_ttd() {
		modul.txtNama("Budi Cahyadi");
		extentTest.log(LogStatus.FAIL, "User input field Nama ttd");
	}
	
	@And("User input field BPJS ttd")
	public void user_input_field_bpjs_ttd() {
		modul.txtBPJS("1212444466559");
		extentTest.log(LogStatus.PASS, "User input field BPJS ttd");
	}
	
	@And("User input field KTP ttd")
	public void user_input_field_ktp_ttd() {
		modul.txtKTP("12345678910111213");
		extentTest.log(LogStatus.PASS, "User input field KTP ttd");
	}
	
	@And("User input field Alamat ttd")
	public void user_input_field_alamat_ttd() {
		modul.txtAlamat("Jalan Mentari");
		extentTest.log(LogStatus.PASS, "User input field Alamat ttd");
	}
	
	@And("User click button kota KTP ttd")
	public void user_click_button_kota_ktp_ttd() {
		modul.btnKota();
		extentTest.log(LogStatus.PASS, "User click button kota KTP ttd");
	}
	
	@And("User input field Jakarta Barat ttd")
	public void user_input_field_angka_jakarta_barat_ttd() {
		modul.txtPilihKotaHuruf("Jakarta Barat" + "\n");
		extentTest.log(LogStatus.PASS, "User input field Jakarta Barat ttd");
	}
	
	@And("User input field faskes Awal ttd")
	public void user_input_field_faskes_awal_ttd() {
		modul.txtFaskesAwal("Clinic Cahya");
		extentTest.log(LogStatus.PASS, "User input field faskes Awal ttd");
	}
	
	@And("User click button faskes Tujuan ttd")
	public void user_click_button_faskes_tujuan_ttd() {
		modul.btnFaskesTujuan();
		extentTest.log(LogStatus.PASS, "User click button faskes Tujuan ttd");
	}
	
	@And("User input field Jakarta Timur ttd")
	public void user_input_field_jakarta_timur_ttd() {
		modul.txtFaskesTujuan("Jakarta Timur" + "\n");
		extentTest.log(LogStatus.PASS, "User input field Jakarta Timur ttd");
	}
	
	@And("User input field Alasan ttd")
	public void user_input_field_alasan_ttd() {
		modul.txtAlasan("Pindah Kantor");
		extentTest.log(LogStatus.PASS, "User input field Alasan ttd");
	}
	
	@Then("User click button Update")
	public void user_click_button_update() {
		modul.btnUpdate();
		extentTest.log(LogStatus.PASS, "User click button Update");
	}	

//  Upload Ulang Document
	@When("User click button Add File1")
	public void user_click_button_add_file1() {
		Hooks.scroll(500);
		Hooks.delay(2);
		modul.btnAddFile1();
		extentTest.log(LogStatus.PASS, "User click button Add File1");
	}
	
	@And("User click button Add File2")
	public void user_click_button_add_file2() {
		Hooks.delay(1);
		modul.btnAddFile2();
		extentTest.log(LogStatus.PASS, "User click button Add File2");
	}
	
	@And("User click button Add File3")
	public void user_click_button_add_file3() {
		Hooks.delay(1);
		modul.btnAddFile3();
		extentTest.log(LogStatus.PASS, "User click button Add File3");
	}
	
	@And ("User click button Cancel upload ulang")
	public void user_click_button_cancel_upload_ulang() {
		modul.btnCancelUpload();
		extentTest.log(LogStatus.PASS, "User click button Cancel upload ulang");
	}
	
	@And ("User click button Simpan upload ulang")
	public void user_click_button_simpan_upload_ulang() {
		Hooks.delay(1);
		modul.btnSaveUpload();
		extentTest.log(LogStatus.PASS, "User click button Simpan upload ulang");
	}
	
	@And("User click button Add File Before")
	public void user_click_button_add_file_before() {
		modul.btnGambarBefore();
		extentTest.log(LogStatus.PASS, "User click button Add File Before");
	}
	
	@And("User click button Add File After")
	public void user_click_button_add_file_after() {
		modul.btnGambarAfter();
		extentTest.log(LogStatus.PASS, "User click button Add File After");
	}
	
	@And("User click button Add File TTD")
	public void user_click_button_add_file_ttd() {
		modul.btnGambarTTD();
		extentTest.log(LogStatus.PASS, "User click button Add File TTD");
	}
	
	@Then("User click button Submit ttd")
	public void user_click_button_submit_ttd() {
		Hooks.scroll(900);
		Hooks.delay(2);
		modul.btnSubmitTTD();
		driver.switchTo().alert().accept();
		extentTest.log(LogStatus.PASS, "User click button Submit ttd");
	}	
}
