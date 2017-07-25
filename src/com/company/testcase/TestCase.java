package com.company.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestCase {
	protected WebDriver driver;

	@BeforeMethod
	public void invokeBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:/Shweta/Interview Prep/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://store.demoqa.com/");
//		System.setProperty("webdriver.gecko.driver", "D:/Shweta/Interview Prep/geckodriver.exe");
//		driver = new FirefoxDriver();
//		driver.get("http://nbc.com");
	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
}
