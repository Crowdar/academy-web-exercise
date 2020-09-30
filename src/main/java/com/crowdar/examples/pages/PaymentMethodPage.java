package com.crowdar.examples.pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class PaymentMethodPage extends PageBaseShop{
    public PaymentMethodPage(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }

    public void verifyPaymentMethodPage(){
        Assert.assertEquals(getText("paymentmethod.h1_titlepage"),"PLEASE CHOOSE YOUR PAYMENT METHOD");
    }

    public void clickPayButton(String button){
        if(button.toLowerCase().equals("bank wire")){
            click("paymentmethod.button_bankwire");
        } else {
            if(button.toLowerCase().equals("check")) {
                click("paymentmethod.button_cheque");
            }
        }
    }
}
