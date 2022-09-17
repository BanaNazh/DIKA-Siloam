package com.ptdika.siloam.utils;

public enum TestScenarios {
	
	T0("User valid login Sales"),
	T1("User on feature input data Field Nama"),
	T2("User on feature input data Field BPJS"),
	T3("User on feature input data Field KTP"),
	T4("User on feature input data Field Alamat"),
	T5("User on feature input data Field Search Kota"),
	T6("User on feature input data Field Faskes Awal");
	
	
	private String testName;
	
	TestScenarios(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
}
