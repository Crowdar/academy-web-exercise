package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class OrderSummary extends PageBaseShop {
    public OrderSummary(RemoteWebDriver driver){
        super(driver);
        this.url="";
    }

    private final String CONFIRM_ORDER_CSS_SELECTOR ="#cart_navigation > button > span";
    private final String TITLE_H1_CSS_SELECTOR = "#center_column > h1";

    public void verifyOrderSummary(){
        Assert.assertEquals(getWebElement(By.cssSelector(TITLE_H1_CSS_SELECTOR)).getText(),"ORDER SUMMARY");
    }

    public void clicks(String button){
        switch (button){
            case "I confirm my order" :
                clickElement(By.cssSelector(CONFIRM_ORDER_CSS_SELECTOR));
                break;
        }
    }
}
