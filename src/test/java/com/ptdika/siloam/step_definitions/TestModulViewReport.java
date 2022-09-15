package com.ptdika.siloam.step_definitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.ptdika.siloam.pages.ModulViewReport;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.*;

public class TestModulViewReport {

	public static WebDriver driver;
	private static ExtentTest extentTest;
	private ModulViewReport modul = new ModulViewReport();

	public TestModulViewReport() {
		driver = Hooks.driver;
		extentTest = Hooks.extentTest;
	}
	
	@When("User on menu dashboard")
	public void User_on_menu_dashboard() {
		assertEquals(modul.getTxtPageModul(), "Home");
		extentTest.log(LogStatus.PASS, "User on menu dashboard");	
	}
	
	@And("User Admin view and report")
	public void user_admin_view_and_report() {
		modul.onFeatureViewReport();
		extentTest.log(LogStatus.PASS, "User Admin view and report");
	}
	
	@And("User Admin click start date")
	public void user_admin_click_start_date() {
		modul.startDate();
		extentTest.log(LogStatus.PASS, "User Admin click start date");
	}
	
	@And("User Admin click end date")
	public void user_admin_click_end_date() {
		modul.endDate();
		extentTest.log(LogStatus.PASS, "User Admin click end date");
	}
	
	@And("User Admin click button filter")
	public void user_admin_click_button_filter() {
		modul.filter();
		extentTest.log(LogStatus.PASS, "User Admin click button filter");
	}
	
	@Then("User Admin click button redo")
	public void user_admin_click_button_redo() {
		modul.redo();
		extentTest.log(LogStatus.PASS, "User Admin click button redo");
	}
	
//	@Then("Alert on end date credentials")
//	public void Alert_on_end_date_credentials() {
//		assertEquals(modul.getTxtAlertInfo(), "Please fill out this field.");
//		extentTest.log(LogStatus.PASS, "Alert on end date credentials");
//	}
	
	@Then("User click button export")
	public void user_click_button_export() {
		modul.export();
		extentTest.log(LogStatus.PASS, "User click button export");
	}
	
	@Then("User click button download")
	public void user_click_button_download() {
		modul.download();
		extentTest.log(LogStatus.PASS, "User click button download");
	}
	
	@When("User Admin click View")
	public void user_admin_click_button_View() {
		modul.view();
		extentTest.log(LogStatus.PASS, "User Admin click View");
	}
	
	@Then("User Admin click Preview Data")
	public void user_admin_click_preview_data() {
		modul.view();
		extentTest.log(LogStatus.PASS, "User Admin click Preview Data");
	}
	
	@Then("User Admin click Foto Faskes Awal")
	public void user_admin_click_foto_faskes_awal() {
		modul.faskesAwal();
		extentTest.log(LogStatus.PASS, "User Admin click Foto Faskes Awal");
	}
	
	@Then("User Admin click Foto Faskes Tujuan")
	public void user_admin_click_foto_faskes_tujuan() {
		modul.faskesTujuan();
		extentTest.log(LogStatus.PASS, "User Admin click Foto Faskes Tujuan");
	}

	@Then("User Admin click scan PDF Agreement")
	public void user_admin_click_scan_PDF_agreement() {
		modul.pdfAgreement();
		extentTest.log(LogStatus.PASS, "User Admin click scan PDF Agreement");
	}
	
}
