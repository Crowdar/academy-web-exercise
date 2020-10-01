package com.crowdar.examples.pages;

import com.crowdar.core.Injector;
import org.aspectj.bridge.IMessage;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import java.net.MalformedURLException;

public class ShopHomePage extends PageBaseShop {


    public ShopHomePage(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }

    private final String BUTTON_SIGNIN_CSS_SELECTOR = " #header > div.nav > div > div > nav > div.header_user_info > a";
    private final String EMAIL_INPUT_ID = "email";
    private final String PASSWORD_INPUT_ID = "passwd";
    private final String BUTTON_SIGNIN__ID = "SubmitLogin";
    private final String TITTLE_H1_CSS_SELECTOR = "#center_column > h1";
    private final String SLIDER_HOME_ID = "slider_row";
    private final String BUTTON_TSHIRT_CSS_SELECTOR = "#block_top_menu > ul > li:nth-child(3) > a";
    private final String BUTTON_ARTICULO_CSS_SELECTOR = "#center_column > ul > li > div > div.right-block > h5 > a";
    private final String BUTTON_ADD_TO_CART_CSS_SELECTOR = "#add_to_cart > button";
    private final String BUTTON_PROCEED_TO_CHECKOUT1_CSS_SELECTOR = "#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a";
    private final String BUTTON_PROCEED_TO_CHECKOUT2_CSS_SELECTOR = "#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium";
    private final String BUTTON_PROCEED_TO_CHECKOUT3_CSS_SELECTOR = "#center_column > form > p > button";
    private final String BUTTON_PROCEED_TO_CHECKOUT4_CSS_SELECTOR = "#form > p > button";
    private final String BUTTON_AGREE_TERMS_OF_SERVICE_CSS_SELECTOR = "#uniform-cgv";
    private final String BUTTON_PAY_BY_BANK_WIRE_CSS_SELECTOR = "#HOOK_PAYMENT > div:nth-child(1) > div > p > a";
    private final String BUTTON_CONFIRM_ORDER_CSS_SELECTOR = "#cart_navigation > button";
    private final String TITTLE_H1_CSS_SELECTOR_MYACCOUNT = "#center_column > h1";
    private final String TITTLE_H1_CSS_SELECTOR_TSHIRT = "#center_column > h1 > span.cat-name";
    private final String TITTLE_H1_CSS_SELECTOR_ARTICULO = "#center_column > div > div > div.pb-center-column.col-xs-12.col-sm-4 > h1";
    private final String TITTLE_H1_CSS_SELECTOR_CARTSUMMARY = "#columns > div.breadcrumb.clearfix > span.navigation_page";
    private final String TITTLE_H1_CSS_SELECTOR_ADRESS = "#center_column > h1";
    private final String TITTLE_H1_CSS_SELECTOR_SHIPPING = "#carrier_area > h1";
    private final String TITTLE_H1_CSS_SELECTOR_PAYMENT = "#center_column > h1";
    private final String TITTLE_H1_CSS_SELECTOR_ORDERSUMMARY = "#center_column > h1";
    private final String TITTLE_H1_CSS_SELECTOR_ORDERCONFIRMATION = "#center_column > h1";


    public void go() {
        navigateToCompleteURL();
    }


    public void clickSigninButton() {

        clickElement((By.cssSelector(BUTTON_SIGNIN_CSS_SELECTOR)));
    }

/*    public void completeLoginInfo(String email, String password) {

        completeField(By.id(EMAIL_INPUT_ID), email);
        completeField(By.id(PASSWORD_INPUT_ID), password);

    }
*/
    public void clickSigninButton2() {
        clickElement(By.id(BUTTON_SIGNIN__ID));

    }

    public void verifyScreen(String pantalla) {
        Assert.assertTrue(isElementVisible(By.cssSelector(TITTLE_H1_CSS_SELECTOR)), "no se encontró el titulo");

    }

    public void verificarHome() {
        Assert.assertTrue(isElementPresentAndDisplayed((By.id(SLIDER_HOME_ID))), "el elemento no es visible");

    }
    public void setPassword(String password){
        completeField(By.id(PASSWORD_INPUT_ID), password);
    }
    public void enterEmail(String email){

        completeField(By.id(EMAIL_INPUT_ID), email);
    }



    public void clickButton(String button) {
        switch (button) {
            case "Sign in":
                loginButtonclick();
                break;
            case "Sign in2":
                loginButton2click();
                break;
            case "t-shirt":
                tShirtclick();
                break;
            case "articulo":
                articuloclick();
                break;
            case "add to cart":
                addtoCartclick();
                break;
            case "proceed to checkout1":
                proceedtoChechoutclick1();
                break;
            case "proceed to checkout2":
                proceedtoChechoutclick2();
                break;
            case "proceed to checkout3":
                proceedtoChechoutclick3();
                break;
            case "proceed to checkout4":
                proceedtoChechoutclick4();
                break;
            case "terms of service":
                termsofServiceclick();
                break;
            case "pay by bank wire":
                paybyBankWireclick();
                break;
            case "I confirm my order":
                confirmOrderclick();
                break;

        }
    }

    public void redirectScreen(String pantalla) {

        switch (pantalla) {
            case "Login":
                verifyLoginScreen();
                break;
            case "My Account":
                verifyMyAccountScreen();
                break;
            case "compra T-shirt":
                verifycompraTShirtcreen();
                break;
            case "articulo":
                verifyArticuloScreen();
                break;
            case "Shopping-Cart Summary":
                verifyShoppingCartScreen();
                break;
            case "Addresses":
                verifyAddressesScreen();
                break;
            case "Shipping":
                verifyShippingScreen();
                break;
            case "Payment Method":
                verifyPaymentMethodScreen();
                break;
            case "Order Summary":
                verifyOrderSummaryScreen();
                break;
            case "Order confirmation":
                verifyOrderConfirmationScreen();
                break;

        }


    }


    public void loginButtonclick() {
        clickElement(By.cssSelector(BUTTON_SIGNIN_CSS_SELECTOR));
    }


    public void loginButton2click() {

        clickElement(By.id(BUTTON_SIGNIN__ID));

    }

    public void tShirtclick() {
        clickElement(By.cssSelector(BUTTON_TSHIRT_CSS_SELECTOR));

    }

    public void articuloclick() {
        clickElement(By.cssSelector(BUTTON_ARTICULO_CSS_SELECTOR));

    }

    public void addtoCartclick() {
        clickElement(By.cssSelector(BUTTON_ADD_TO_CART_CSS_SELECTOR));

    }

    public void proceedtoChechoutclick1() {
        clickElement(By.cssSelector(BUTTON_PROCEED_TO_CHECKOUT1_CSS_SELECTOR));

    }

    public void proceedtoChechoutclick2() {
        clickElement(By.cssSelector(BUTTON_PROCEED_TO_CHECKOUT2_CSS_SELECTOR));

    }

    public void proceedtoChechoutclick3() {
        clickElement(By.cssSelector(BUTTON_PROCEED_TO_CHECKOUT3_CSS_SELECTOR));

    }

    public void proceedtoChechoutclick4() {
        clickElement(By.cssSelector(BUTTON_PROCEED_TO_CHECKOUT4_CSS_SELECTOR));

    }

    public void termsofServiceclick() {

        clickElement(By.cssSelector(BUTTON_AGREE_TERMS_OF_SERVICE_CSS_SELECTOR));
    }

    public void paybyBankWireclick() {

        clickElement(By.cssSelector(BUTTON_PAY_BY_BANK_WIRE_CSS_SELECTOR));
    }

    public void confirmOrderclick() {

        clickElement(By.cssSelector(BUTTON_CONFIRM_ORDER_CSS_SELECTOR));
    }


    public void verifyLoginScreen() {
        Assert.assertEquals(getWebElement(By.cssSelector(TITTLE_H1_CSS_SELECTOR)).getText(), "AUTHENTICATION");

    }

    public void verifyMyAccountScreen() {
        Assert.assertEquals(getWebElement(By.cssSelector(TITTLE_H1_CSS_SELECTOR_MYACCOUNT)).getText(), "MY ACCOUNT");


    }

    public void verifycompraTShirtcreen() {
        Assert.assertEquals(getWebElement(By.cssSelector(TITTLE_H1_CSS_SELECTOR_TSHIRT)).getText(), "T-SHIRTS ");


    }

    public void verifyArticuloScreen() {
        Assert.assertEquals(getWebElement(By.cssSelector(TITTLE_H1_CSS_SELECTOR_ARTICULO)).getText(),"Faded Short Sleeve T-shirts");

    }

    public void verifyShoppingCartScreen() {
        Assert.assertEquals(getWebElement(By.cssSelector(TITTLE_H1_CSS_SELECTOR_CARTSUMMARY)).getText(),"Your shopping cart");

    }

    public void verifyAddressesScreen() {
        Assert.assertEquals(getWebElement(By.cssSelector(TITTLE_H1_CSS_SELECTOR_ADRESS)).getText(),"ADDRESSES");

    }

    public void verifyShippingScreen() {
        Assert.assertEquals(getWebElement(By.cssSelector(TITTLE_H1_CSS_SELECTOR_SHIPPING)).getText(),"SHIPPING");

    }

    public void verifyPaymentMethodScreen() {
        Assert.assertEquals(getWebElement(By.cssSelector(TITTLE_H1_CSS_SELECTOR_PAYMENT)).getText(),"PLEASE CHOOSE YOUR PAYMENT METHOD");

    }
    public void verifyOrderSummaryScreen(){

        Assert.assertEquals(getWebElement(By.cssSelector(TITTLE_H1_CSS_SELECTOR_ORDERSUMMARY)).getText(),"ORDER SUMMARY");

    }
    public void verifyOrderConfirmationScreen() {
        Assert.assertEquals(getWebElement(By.cssSelector(TITTLE_H1_CSS_SELECTOR_ORDERCONFIRMATION)).getText(),"ORDER CONFIRMATION");

    }


}


