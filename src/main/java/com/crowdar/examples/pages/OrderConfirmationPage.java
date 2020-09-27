package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class OrderConfirmationPage extends PageBaseShop {
    public OrderConfirmationPage(RemoteWebDriver driver){
        super(driver);
        this.url="";
    }
    private final String TITLE_H1_CSS_SELECTOR = "#center_column > h1";

    public void verifyOrderSummary(){
        Assert.assertEquals(getWebElement(By.cssSelector(TITLE_H1_CSS_SELECTOR)).getText(),"ORDER CONFIRMATION");
    }
}
