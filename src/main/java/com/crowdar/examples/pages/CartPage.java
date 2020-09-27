package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class CartPage extends PageBaseShop {

    public CartPage(RemoteWebDriver driver){
        super(driver);
        this.url="";
    }

    private final String TITLE_SPAM_CSS_SELECTOR = "#columns > div.breadcrumb.clearfix > span.navigation_page";
    private final String PROCEED_TO_CHECKOUT_CSS_SELECTOR ="#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium > span";

    public void verifySignIn(){
        Assert.assertEquals(getWebElement(By.cssSelector(TITLE_SPAM_CSS_SELECTOR)).getText(),"Your shopping cart");
    }

    public void clicks(String button){
        switch (button){
            case "Proceed to checkout" :
                clickElement(By.cssSelector(PROCEED_TO_CHECKOUT_CSS_SELECTOR));
                break;
        }
    }


}
