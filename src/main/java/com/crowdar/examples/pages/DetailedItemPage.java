package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class DetailedItemPage extends PageBaseShop {
    public DetailedItemPage(RemoteWebDriver driver){
        super(driver);
        this.url="";
    }

    private final String TITLE_H3_CSS_SELECTOR ="#center_column > div > section:nth-child(2) > h3";
    private final String PROCEED_TO_CHECKOUT_BUTTON_CSS_SELECTOR = "#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a > span";
    private final String ADD_TO_CART_CSS_SELECTOR ="#add_to_cart > button > span";

    public void verifyDetailedItemPage(){
        Assert.assertEquals(getWebElement(By.cssSelector(TITLE_H3_CSS_SELECTOR)).getText(),"DATA SHEET");
    }

    public void clicks(String button){
        switch (button){
            case "Add to cart" :
                clickElement(By.cssSelector(ADD_TO_CART_CSS_SELECTOR));
                break;
            case "Proceed to checkout":
                clickElement(By.cssSelector(PROCEED_TO_CHECKOUT_BUTTON_CSS_SELECTOR));
        }
    }

}
