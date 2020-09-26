package com.crowdar.examples.pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class OrderConfirmationPage extends PageBaseShop{
    public OrderConfirmationPage(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }

    public void verifyConfirmationPage(){
        Assert.assertEquals(getText("orderconfirmation.h1_titlepage"), "ORDER CONFIRMATION");
    }
}
