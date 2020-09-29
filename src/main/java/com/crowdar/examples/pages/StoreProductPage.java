package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class StoreProductPage extends StorePageBase{

    public final String ADDTOCART_BUTTON_CSS_SELECTOR ="#add_to_cart > button > span";
    public final String PROCCEDTOCHECKOUT_BUTTON_CSS_SELECTOR = "#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a > span";

    public StoreProductPage(RemoteWebDriver driver){
        super(driver);
        this.url ="";
    }

    public void verifyPage(){
        Assert.assertTrue(isElementVisible(By.cssSelector(ADDTOCART_BUTTON_CSS_SELECTOR)), "no se pudo encontrar la pagina");
    }

    public void clickButton(String button){
        switch (button){
            case "add to cart":
                clickElement(By.cssSelector(ADDTOCART_BUTTON_CSS_SELECTOR));
                break;
            case"procced to checkout":
                clickElement(By.cssSelector(PROCCEDTOCHECKOUT_BUTTON_CSS_SELECTOR));
                break;
        }
    }
}
