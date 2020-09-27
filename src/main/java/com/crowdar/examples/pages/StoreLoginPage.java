package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class StoreLoginPage extends PageBaseStore {

	private final String INPUT_EMAIL_ID = "email";
	private final String INPUT_PASSWORD_ID = "passwd";
	private final String MSG_LOGIN_FAIL = ".//li[contains(text(),'Authentication failed.')]";
	private final String ACCOUNT_INFO_MESSAGE = ".//p[@class='info-account']";


	public StoreLoginPage(RemoteWebDriver driver) {
		super(driver);
		this.url = ""; // here you can define the custom paths For example:"/search" -->
						// www.googe.com/search
	}

	@SuppressWarnings("deprecation")
	public void completeLoginInfo(String type, String value) {
		switch (type) {
		case "email": {
			completeField(By.id(INPUT_EMAIL_ID), value);
			break;
		}
		case "password": {
			completeField(By.id(INPUT_PASSWORD_ID), value);
			break;
		}
		default:
			break;
		}

	}
	
	@SuppressWarnings("deprecation")
	public void verifyResultLogin(String result) {
		switch (result) {
		case "login incorrecto": {
			Assert.assertTrue(isElementVisible(By.xpath(MSG_LOGIN_FAIL)));
			break;
		}
		case "login correcto": {
			Assert.assertTrue(isElementVisible(By.xpath(ACCOUNT_INFO_MESSAGE)));
			break;
		}
		default:
			break;
		}

	}
	


}
