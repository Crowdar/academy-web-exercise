package com.crowdar.examples.pages;


import com.crowdar.core.Injector;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class HomePage extends PageBaseShop {


    public HomePage(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }

    public void go() {
        navigateToCompleteURL();
    }


    public void verifyHomePage() {
        Assert.assertTrue(isPresent("home.div_slider"), "El elemento no esta visible");
    }

    public void clickButtons(String button){
        switch (button){
            case "Sign In": Injector._page(LoginPage.class).clickBotonSignIn(); break;
            case "Add to cart": Injector._page(ArticlePage.class).clickButton(button); break;
            case "Proceed to checkout": clickProceedToCheckout(button); break;
            case "I confirm my order": Injector._page(OrderSummaryPage.class).confirmOrder(); break;
        }
    }

    public void clickBotonSignIn(){
        click("home.button_sign_in");
    }

    public void irAPantalla(String pantalla){
        switch(pantalla.toUpperCase()){
            case "LOGIN": Injector._page(LoginPage.class).verifyLoginPage(); break;
            case "MY ACCOUNT": Injector._page(MyAccountPage.class).verifyMyAccountPage(); break;
            case "WOMEN":
            case "DRESSES":
            case "T-SHIRTS":
                Injector._page(CategoryPage.class).verifyCategoryPage(pantalla); break;
            case "ARTICLE": Injector._page(ArticlePage.class).verifyArticlePage(); break;
            case "SHOPPING-CART SUMMARY": Injector._page(ShoppingCartPage.class).verifyShoppingCartPage(); break;
            case "ADDRESSES": Injector._page(AddressesPage.class).verifyAddressesPage(); break;
            case "SHIPPING": Injector._page(ShippingPage.class).verifyShippingPage(); break;
            case "PAYMENT METHOD": Injector._page(PaymentMethodPage.class).verifyPaymentMethodPage(); break;
            case "ORDER SUMMARY": Injector._page(OrderSummaryPage.class).verifyOrderSumaryPage(); break;
            case "ORDER CONFIRMATION": Injector._page(OrderConfirmationPage.class).verifyConfirmationPage(); break;
        }
    }

    public void clickProceedToCheckout(String button){
        if(isPresent("shipping.button_proceed_to_checkout")){
            Injector._page(ShippingPage.class).clickProceedToCheckout();
        } else {
            if(isPresent("addresses.button_proceed_to_checkout")){
                Injector._page(AddressesPage.class).clickProceedToCheckout();
            } else {
                if(isPresent("shoppingcart.button_proceed_to_checkout")){
                    Injector._page(ShoppingCartPage.class).clickProceedToCheckout();
                } else {
                    if(isPresent("article.button_proceed_to_checkout")){
                        Injector._page(ArticlePage.class).clickButton(button);
                    }
                }
            }
        }
    }

}
