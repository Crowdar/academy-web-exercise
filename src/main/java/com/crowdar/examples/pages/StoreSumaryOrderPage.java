package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class StoreSumaryOrderPage extends StorePageBase{

    public final String CONFIRMMYORDER_BUTTON_CSS_SELECTOR = "#cart_navigation > button > span";

    public StoreSumaryOrderPage(RemoteWebDriver driver){
        super(driver);
        this.url ="";
    }
    public void verifyPage(){
        Assert.assertTrue(isElementVisible(By.cssSelector(CONFIRMMYORDER_BUTTON_CSS_SELECTOR)), "no se pudo encontrar la pagina");
    }

    public void clickConfirmMyOrder(){
        clickElement(By.cssSelector(CONFIRMMYORDER_BUTTON_CSS_SELECTOR));
    }
}
