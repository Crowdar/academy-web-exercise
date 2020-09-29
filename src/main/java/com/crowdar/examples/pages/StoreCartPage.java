package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class StoreCartPage extends StorePageBase{

    public final String PROCCEDTOCHECKOUT_BUTTON_CSS_SELECTOR = "#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium > span";

    public StoreCartPage(RemoteWebDriver driver){
        super(driver);
        this.url ="";
    }
    public void verifyPage(){
        Assert.assertTrue(isElementVisible(By.cssSelector(PROCCEDTOCHECKOUT_BUTTON_CSS_SELECTOR)), "no se pudo encontrar la pagina");
    }

    public void clickProccedToCheckout(){
        clickElement(By.cssSelector(PROCCEDTOCHECKOUT_BUTTON_CSS_SELECTOR));
    }
}
