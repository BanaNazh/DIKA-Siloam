package com.ptdika.siloam.step_definitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", features = { "src/test/resources/features/01.loginSales.feature",
		"src/test/resources/features/02.ModulInputData.feature",
		"src/test/resources/features/7.ModulUploadDocument.feature",
		"src/test/resources/features/8.ModulTandaTanganDigital.feature",
//		"src/test/resources/features/03.InputTTDDigital.feature",
		"src/test/resources/features/04.ReturnFilter.feature",
		"src/test/resources/features/05.LogoutSales.feature",
		"src/test/resources/features/06.loginAdmin.feature",
		"src/test/resources/features/07.ModulViewReport.feature"},

glue = "com.ptdika.siloam.step_definitions", plugin = {
				"pretty", "html:target/cucumber-reports.html" })
public class TestRunner extends AbstractTestNGCucumberTests {

	public static void main(String[] args) {

	}

}
