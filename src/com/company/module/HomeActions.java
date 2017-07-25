package com.company.module;

import org.openqa.selenium.WebDriver;

import com.company.pages.Home;

public class HomeActions {

	public static void login(final WebDriver driver) {
		Home.myAccount(driver).click();

	}

}
