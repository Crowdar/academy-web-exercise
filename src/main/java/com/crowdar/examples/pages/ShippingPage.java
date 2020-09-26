package com.crowdar.examples.pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class ShippingPage extends PageBaseShop{
    public ShippingPage(RemoteWebDriver driver) {
        super(driver);
        this.url="";
    }

    public void verifyShippingPage(){
        Assert.assertEquals(getText("shipping.h1_pagetitle"),"SHIPPING");
    }

    public void acceptTerms(){
        click("shipping.input_checkbox_terms",true);
    }

    public void clickProceedToCheckout(){
        click("shipping.button_proceed_to_checkout",false);
    }
}
