package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class ShippingPage extends PageBaseShop {
    public ShippingPage(RemoteWebDriver driver){
        super(driver);
        this.url="";
    }

    private final String TITLE_H1_CSS_SELECTOR = "#carrier_area > h1";
    private final String CHECKBOX_CSS_SELECTOR = "#cgv";
    private final String PROCEED_TO_CHECKOUT_BUTTON_CSS_SELECTOR = "#form > p > button > span";

    public void verifyShippingPage(){
        Assert.assertEquals(getWebElement(By.cssSelector(TITLE_H1_CSS_SELECTOR)).getText(),"SHIPPING");
    }

    public void clicks(String button){
        switch (button){
            case "checkbox" :
                selectCheckbox(By.cssSelector(CHECKBOX_CSS_SELECTOR));
                break;
            case "Proceed to checkout":
                clickElement(By.cssSelector(PROCEED_TO_CHECKOUT_BUTTON_CSS_SELECTOR));
        }
    }


}
