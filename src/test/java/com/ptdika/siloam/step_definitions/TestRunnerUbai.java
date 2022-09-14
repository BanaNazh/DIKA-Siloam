package com.ptdika.siloam.step_definitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="a",
				features="src/test/resources/features/1.Login.feature",
				glue = "com.juaracoding.pageobject.step_definitions",
				plugin = {"pretty", "html:target/cucumber-reports.html"})

public class TestRunnerUbai extends AbstractTestNGCucumberTests{
a
}
