package com.ptdika.siloam.step_definitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="",
				features={"src/test/resources/features/1.loginSales.feature",
						},
				glue = "com.ptdika.siloam.step_definitions",
				plugin = {"pretty", "html:target/cucumber-reports.html"})
public class TestRunner extends AbstractTestNGCucumberTests{

}
