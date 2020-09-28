package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class StoreWomenPage extends StorePageBase {

    public final String WOMEN_NAVIGATOR_CSS_SELECTOR ="#columns > div.breadcrumb.clearfix > span.navigation_page";

    public StoreWomenPage(RemoteWebDriver driver){
        super(driver);
        this.url ="";
    }

    public void verifyPage(){
        Assert.assertTrue(isElementVisible(By.cssSelector(WOMEN_NAVIGATOR_CSS_SELECTOR)));
    }
}
