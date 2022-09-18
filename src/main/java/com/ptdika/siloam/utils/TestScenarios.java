package com.ptdika.siloam.utils;

public enum TestScenarios {
	
	T1("User valid login module Return"),
	T2("User navigate to return page"),
	T3("Blank Start Date Ret001"),
	T4("Blank End Date Ret002"),
	T5("Set Future day on Start Date Ret003"),
	T6("Set Future day on End Date Ret004"),
	T7("Blank Status Ret005"),
	T8("Complete Status Ret006"),
	T9("Pending Status Ret007"),
	T10("Reset Button Ret008");
	
	private String testName;
	
	TestScenarios(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
}
