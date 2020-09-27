package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class AddressesPage extends PageBaseShop {
    public AddressesPage(RemoteWebDriver driver){
        super(driver);
        this.url="";
    }

    private final String TITLE_H1_CSS_SELECTOR = "#center_column > h1";
    private final String PROCCED_TO_CHECKOUT_BUTTON_CSS_SELECTOR ="#center_column > form > p > button > span";

    public void verifyAddresses(){
        Assert.assertEquals(getWebElement(By.cssSelector(TITLE_H1_CSS_SELECTOR)).getText(),"ADDRESSES");
    }

    public void clicks(String button){
        switch (button){
            case "Proceed to checkout" :
                clickElement(By.cssSelector(PROCCED_TO_CHECKOUT_BUTTON_CSS_SELECTOR));
                break;
        }
    }

}
