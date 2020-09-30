package com.crowdar.examples.pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class AddressesPage extends PageBaseShop{
    public AddressesPage(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }

    public void verifyAddressesPage(){
        Assert.assertEquals(getText("addresses.h1_titlepage"),"ADDRESSES");
    }

    public void clickProceedToCheckout(){
        click("addresses.button_proceed_to_checkout",true);
    }
}
