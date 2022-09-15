package com.ptdika.siloam.utils;

public enum TestScenarios {
	
	T1("User valid login"),
	T2("Dashboard User Function"),
	T3("Buzz Function");
	
	private String testName;
	
	TestScenarios(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
}
