package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class ShippingPage extends PageBaseShop{

    public ShippingPage(RemoteWebDriver driver) {
        super(driver);
        this.url="";
    }

    private String INPUT_CHECKBOX_TERMS_ID = "cgv";

    public void verifyShippingPage(){
        Assert.assertEquals(getText("shipping.h1_pagetitle"),"SHIPPING");
    }

    public void acceptTerms(){
        selectCheckbox(By.id(INPUT_CHECKBOX_TERMS_ID));
    }

    public void clickProceedToCheckout(){
        click("shipping.button_proceed_to_checkout",false);
    }
}
