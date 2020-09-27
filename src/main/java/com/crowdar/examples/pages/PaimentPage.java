package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class PaimentPage extends PageBaseShop {

    public PaimentPage(RemoteWebDriver driver){
        super(driver);
        this.url="";
    }

    private final String PAY_BY_BANK_WINE_BUTTON_CSS_SELECTOR = "#HOOK_PAYMENT > div:nth-child(1) > div > p > a";
    private final String TITLE_H1_CSS_SELECTOR = "#center_column > h1";


    public void verifyPaimentPage(){
        Assert.assertEquals(getWebElement(By.cssSelector(TITLE_H1_CSS_SELECTOR)).getText(),"PLEASE CHOOSE YOUR PAYMENT METHOD");
    }

    public void clicks(String button){
        switch (button){
            case "Pay by bank" :
               clickElement(By.cssSelector(PAY_BY_BANK_WINE_BUTTON_CSS_SELECTOR));
            break;
        }
    }

}
