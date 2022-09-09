package com.ptdika.siloam.utils;

public enum TestScenarios {
	
	T1("User invalid login"),
	T2("User valid login"),
	T3("Dashboard User Function"),
	T4("Buzz Function");
	
	private String testName;
	
	TestScenarios(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
}
