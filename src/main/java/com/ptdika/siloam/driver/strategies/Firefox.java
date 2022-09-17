package com.ptdika.siloam.driver.strategies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox implements DriverStrategy {

	public WebDriver setStrategy() {
		System.setProperty("webdriver.gecko.driver", "E:\\selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		return driver;
	}

}
