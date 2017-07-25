package com.company.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home {

	public static WebElement myAccount(final WebDriver driver) {
		final WebElement myAccount = driver.findElement(By.xpath("//*[@id=\"account\"]/a"));
		return myAccount;
	}

}
