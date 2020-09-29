package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class StoreConfirmedOrderPage extends StorePageBase{

    public final String CONFIRMEDORDER_HEADER_CSS_SELECTOR = "#center_column > h1";
    public StoreConfirmedOrderPage(RemoteWebDriver driver){
        super(driver);
        this.url ="";
    }
    public void verifyPage(){
        Assert.assertTrue(isElementVisible(By.cssSelector(CONFIRMEDORDER_HEADER_CSS_SELECTOR)), "no se pudo encontrar la pagina");
    }

}
