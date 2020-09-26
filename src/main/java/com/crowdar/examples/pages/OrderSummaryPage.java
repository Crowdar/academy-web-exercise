package com.crowdar.examples.pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class OrderSummaryPage extends PageBaseShop{

    public OrderSummaryPage(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }

    public void verifyOrderSumaryPage(){
        Assert.assertEquals(getText("ordersummary.h1_titlepage"), "ORDER SUMMARY");
    }

    public void confirmOrder(){
        click("ordersummary.button_confirmorder");
    }
}
