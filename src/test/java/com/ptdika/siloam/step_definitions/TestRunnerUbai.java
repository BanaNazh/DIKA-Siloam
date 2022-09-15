package com.ptdika.siloam.step_definitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="",
				features={"src/test/resources/1.LoginAdminUbai.feature","src/test/resources/2.ModulViewReportUbai.feature"},
				glue = "com.ptdika.siloam.step_definitions",
				plugin = {"pretty", "html:target/cucumber-reports.html","json:target/cucumber.json"})

public class TestRunnerUbai extends AbstractTestNGCucumberTests{
	
}