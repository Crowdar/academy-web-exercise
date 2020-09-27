package com.crowdar.examples.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

public class StoreHomePage extends PageBaseStore {


	@SuppressWarnings("deprecation")
	public StoreHomePage(RemoteWebDriver driver) {
		super(driver);
		this.url = "";
	}

	@SuppressWarnings("deprecation")
	public void go() {
		navigateToCompleteURL();
	}


}
