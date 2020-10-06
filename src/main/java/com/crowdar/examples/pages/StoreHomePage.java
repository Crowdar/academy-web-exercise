package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class StoreHomePage extends PageBaseStore {

    public StoreHomePage(RemoteWebDriver driver) {
        super(driver);
        this.url = ""; //here you can define the custom paths For example:"/search" --> www.googe.com/search
    }
     //Login-----------
    private final String SIGN_IN_BUTTON_CSS_SELECTOR = "#header > div.nav > div > div > nav > div.header_user_info > a";
    private final String CREATE_ACCOUNT_BUTTON_CSS_SELECTOR = "#SubmitCreate";
    private final String SIGNIN_BUTTON_CSS_SELECTOR = "#SubmitLogin";
    private final String REGISTER_BUTTON_ID = "submitAccount";
    private final String SLIDER_HOME_ID = "slider_row";
    private final String H1_TITLE_CSS_SELECTOR = "#center_column > h1";
    private final String EMAIL_INPUT_CREATE_CSS_SELECTOR = "#email_create";
    private final String EMAIL_INPUT_LOGIN_CSS_SELECTOR = "#email";
    private final String PASSWORD_INPUT_LOGIN_CSS_SELECTOR = "#passwd";
    private final String FORM_CSS_SELECTOR = "#noSlide > h1";
    private final String BLOCK_TOP_MENU_CSS_SELECTOR = "body.category.category-8.category-dresses.hide-right-column.lang_en:nth-child(2) div.header-container div:nth-child(3) div.container div.row div.sf-contener.clearfix.col-lg-12:nth-child(6) > ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows";

    //Compra-----------
    private final String SELECCION_DRESSES_CSS_SELECTOR = "#block_top_menu > ul > li:nth-child(2) > a";
    private final String VERIFICAR_PANTALLA_DRESSES_CSS_SELECTOR = "#center_column > h1 > span.cat-name";
    private final String SELECCION_SUMMER_DRESSES_CSS_SELECTOR ="#categories_block_left > div > ul > li.last > a";

    private final String VERIFICAR_PANTALLA_SUMMER_DRESSES_CSS_SELECTOR = "#center_column > h1 > span.cat-name";
    private final String PRIMER_ITEM_SUMMER_DRESSES_CSS_SELECTOR = "#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.first-in-line.last-line.first-item-of-tablet-line.first-item-of-mobile-line.last-mobile-line > div > div.left-block > div > a.product_img_link > img";
    private final String VERIFICA_PANTALLA_PRIMETITEM_CSS_SELECTOR = "#product_reference > span";
    private final String ADD_TO_THE_CART_1_CSS_SELECTOR = "#add_to_cart > button > span";
    private final String VERIFICA_PANTALLA_successfully_added_CSS_SELECTOR = "#layer_cart > div.clearfix > div.layer_cart_product.col-xs-12.col-md-6 > h2";
    private final String BUTTON_PROCEDED_TO_CHECK_OUT_ADDED_CSS_SELECTOR = "#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a > span";
    private final String VERIFICAR_PANTALLA_SHOPPINGCART_CSS_SELECTOR = "#cart_title";
    private final String BUTTON_PROCEDED_TO_CHECK_OUT_SHOPPINGCART_CSS_SELECTOR = "#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium > span";
    private final String VERIFICAR_PANTALLA_ADDRESSES_CSS_SELECTOR = "#center_column > h1";
    private final String BUTTON_PROCEDED_TO_CHECK_OUT_ADDRESSS_CSS_SELECTOR = "#center_column > form > p > button > span";
    private final String VERIFICAR_PANTALLA_SHIPPING_CSS_SELECTOR = "#carrier_area > h1";
    private final String SELECT_I_AGREE_CSS_SELECTOR = "#cgv";
    private final String BUTTON_PROCEDED_TO_CHECK_OUT_IAGREE_CSS_SELECTOR = "#form > p > button > span";
    private final String VERIFICAR_PANTALLA_ELEGIR_PAGO_CSS_SELECTOR = "#center_column > h1";
    private final String SELECCIONAR_METODO_DEPAGO_CSS_SELECTOR = "#HOOK_PAYMENT > div:nth-child(1) > div > p > a";
    private final String VERIFICAR_PANTALLA_ORDERSUMMARY_CSS_SELECTOR = "#center_column > h1";
    private final String BUTTON_CONFIRMAR_COMPRA_CSS_SELECTOR = "#cart_navigation > button > span";
    private final String VERIFICAR_PANTALLA_COMPRA_CSS_SELECTOR ="#center_column > h1";


    public void go() {

        navigateToCompleteURL();
    }

    public void verifyHome(){
        Assert.assertTrue(isElementPresentAndDisplayed(By.id(SLIDER_HOME_ID)), "El elemento no es visible" );
    }

    public void verifyHomeCompra(){
        Assert.assertTrue(isElementPresentAndDisplayed(By.id(BLOCK_TOP_MENU_CSS_SELECTOR)), "El elemento no es visible" );
    }

        public void clickButton(String button){
            switch (button){
                case "Sign in":
                    loginButtonClick();
                    break;
                case "Create an account":
                   createAnAccountButton();
                    break;
                case "Register":
                    registerButton();
                    break;
                case "Dresses":
                    dressesSelect();
                    break;
                case "SummerDresses":
                    summerDressesSelect();
                    break;
            }

    }

    //Metodos de botones

    public void loginButtonClick(){
        if (isElementPresent(By.cssSelector(SIGN_IN_BUTTON_CSS_SELECTOR)) && isElementPresent(By.cssSelector(SIGNIN_BUTTON_CSS_SELECTOR))){
            clickElement(By.cssSelector(SIGNIN_BUTTON_CSS_SELECTOR));
        }
        if (isElementVisible(By.cssSelector(SIGN_IN_BUTTON_CSS_SELECTOR))){
            clickElement(By.cssSelector(SIGN_IN_BUTTON_CSS_SELECTOR));
        }
    }
    public void createAnAccountButton(){

        clickElement(By.cssSelector(CREATE_ACCOUNT_BUTTON_CSS_SELECTOR));
    }

    public void registerButton(){

        clickElement(By.id(REGISTER_BUTTON_ID));
    }

    public void redirectScreen(String pantalla){
        switch (pantalla){
            case "Login":
                verifyLoginScreen();
                break;
            case "My Account":
                verifyMyAccountScreen();
                break;
            case "Dresses":
                verificarPantallaDresses();
                break;
            case "Summer Dresses":
                verificarPantallaSummerDresses();
                break;
        }
    }


    //Metodos de verificaciones

    public void verifyLoginScreen(){
        Assert.assertEquals(getWebElement(By.cssSelector(H1_TITLE_CSS_SELECTOR)).getText(),"AUTHENTICATION");
    }

    public void verifyMyAccountScreen(){
        Assert.assertEquals(getWebElement(By.cssSelector(H1_TITLE_CSS_SELECTOR)).getText(),"MY ACCOUNT");
    }

    public void verifYForm(){
        waitForElementVisibility(By.cssSelector(FORM_CSS_SELECTOR));
        Assert.assertTrue(isElementPresentAndDisplayed(By.cssSelector(FORM_CSS_SELECTOR)), "El Formulario no se ha desplegado");
    }


    //Métodos introducir datos


    public void enterEmail(String email){
        completeField(By.cssSelector(EMAIL_INPUT_CREATE_CSS_SELECTOR), email);
        completeField(By.cssSelector(EMAIL_INPUT_LOGIN_CSS_SELECTOR), email);
    }

    public void enterPassword(String password){
        completeField(By.cssSelector(PASSWORD_INPUT_LOGIN_CSS_SELECTOR), password);

    }

//--------------------------------------------------------------------------------------------------------------------
    //Métodos de la compra

    public void dressesSelect(){
        clickElement(By.cssSelector(SELECCION_DRESSES_CSS_SELECTOR));
    }

    public void verificarPantallaDresses(){
        Assert.assertEquals(getWebElement(By.cssSelector(VERIFICAR_PANTALLA_DRESSES_CSS_SELECTOR)).getText(),"DRESSES");
    }

    public void summerDressesSelect(){
        clickElement(By.cssSelector(SELECCION_SUMMER_DRESSES_CSS_SELECTOR));
    }

    public void verificarPantallaSummerDresses(){
        Assert.assertEquals(getWebElement(By.cssSelector(SELECCION_SUMMER_DRESSES_CSS_SELECTOR)).getText(),"DRESSES");
    }

    public void seleccionarVestido(){


    }





}
