package com.company.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.company.module.HomeActions;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class HomeTestCase extends TestCase {
	@Test
	public void homeTestCase() {
		ExtentReports logger = ExtentReports.get(HomeTestCase.class);
		logger.init("C:\\Shweta\\workspace\\PageObjectFramework\\report.html", true);
		logger.startTest("TestCaseHome");
		HomeActions.login(driver);
		logger.log(LogStatus.FAIL,"step1", "Test Case1 Failed", "C:\\Shweta\\workspace\\PageObjectFramework\\");
		logger.log(LogStatus.INFO, "Browser up and running");
		Assert.assertEquals(driver.getCurrentUrl(), "http://store.demoqa.com/products-page/your-account/");
		logger.log(LogStatus.PASS, "Test Finished");
		// Assert.assertNotEquals(driver.getCurrentUrl(),
		// "http://store.demoqa.com/products-page/your-account/");
	}

}
