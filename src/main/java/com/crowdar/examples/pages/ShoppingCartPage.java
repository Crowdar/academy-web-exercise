package com.crowdar.examples.pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class ShoppingCartPage extends PageBaseShop{
    public ShoppingCartPage(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }

    public void verifyShoppingCartPage() {
        Assert.assertEquals(getText("shoppingcart.span_navigationpage"),"Your shopping cart");
    }

    public void clickProceedToCheckout(){
        click("shoppingcart.button_proceed_to_checkout", true);
    }
}
